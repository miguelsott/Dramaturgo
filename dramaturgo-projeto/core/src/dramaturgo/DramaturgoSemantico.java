package dramaturgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import dramaturgo.DramaturgoParser.Mudanca_emocaoContext;
import dramaturgo.DramaturgoParser.Outra_mudancaContext;
import dramaturgo.DramaturgoParser.PuloContext;

/**
 * Responsavel por realizar a analise semantica. Herda uma classe BaseVisitor e sobrecarrega 
 * seus metodos para acessar as regras da gramatica. Na visita da regra principal (Programa)
 * retorna o numero de erros semanticos ocorridos durante a analise.
 * @see DramaturgoBaseVisitor
 */

public class DramaturgoSemantico extends DramaturgoBaseVisitor <Object> {
    private Map<String, List<String>> tabelaDeSimbolos = new HashMap<String, List<String>>();
    private static int contCena = 1;
    private Map<String, Integer> pulos = new LinkedHashMap<String, Integer>();
    private Map<String, Integer> vaPara = new LinkedHashMap<String, Integer>();
    private int numDeErros = 0;
    
    /*
     *  Faz uma busca pela Tabela de Simbolos que eh um Map.
     *  Retorna true se o valor esta contido na lista ligada a chave, caso
     *	contrario ou caso nao haja uma entrada com a chave passada, retorna false
    */
    private boolean hasValue (String key, String value) {
        if(tabelaDeSimbolos.containsKey(key))
            return tabelaDeSimbolos.get(key).contains(value);
        return false;
    }

    @Override
    public Object visitPrograma(DramaturgoParser.ProgramaContext ctx) {
        visitCabecalho(ctx.cabecalho());
        visitCorpo(ctx.corpo());
        
        // Verifica se as tentativas de ir para outra cena foram validas
        for (Map.Entry<String,Integer> cena : vaPara.entrySet()) {
			if(!hasValue("cena", cena.getKey())) {
				// erro: pulo nao pode ser efetuado, pois a cena nao existe!
				System.out.println("Linha " + cena.getValue() + " - Erro (escolha): escolha nao pode ser feita, cena " + cena.getKey() + " nao criada!");
				numDeErros++;
			}
		}
        
        // Verifica se as tentativas de pulo entre as cenas foram validas
        for (Map.Entry<String, Integer> pulo : pulos.entrySet()) {
			if(!hasValue("cena", pulo.getKey())) {
				// erro: pulo nao pode ser efetuado, pois a cena nao existe!
				System.out.println("Linha " + pulo.getValue() + " - Erro (pulo): pulo nao pode ser feito, cena " + pulo.getKey() + " nao criada!");
				numDeErros++;
			}
		}
        
        return numDeErros;
    }
    
    @Override
    public Object visitPersonagens(DramaturgoParser.PersonagensContext ctx) {
        String characterName = ctx.PERSONAGEM().getText();
       
        if(!tabelaDeSimbolos.containsKey("personagem")) {
            tabelaDeSimbolos.put("personagem", new ArrayList<String>());
        }
        
        // Adiciona o personagem na tabela
        tabelaDeSimbolos.get("personagem").add(characterName);
       
        visitMais_personagens(ctx.mais_personagens());
        
        return null; 
    }
    
    @Override
    public Object visitMais_personagens(DramaturgoParser.Mais_personagensContext ctx) {
        if(ctx.PERSONAGEM() != null){
            String characterName = ctx.PERSONAGEM().getText();
            // Verifica se o personagem ja foi declarado anteriormente
            if(!hasValue("personagem", characterName)) {
                    tabelaDeSimbolos.get("personagem").add(characterName);
            } else {
                // erro: nome de personagem ja declarado
                System.out.println("Linha " + ctx.start.getLine() + " - Erro (personagem): personagem " + characterName + " ja declarado!");
                numDeErros++;
            }
            
            visitMais_personagens(ctx.mais_personagens());
        } 
        
        return null;
    }

    @Override
    public Object visitCenarios(DramaturgoParser.CenariosContext ctx) {
    	
    	if(tabelaDeSimbolos.containsKey("nova_entrada")) {
        	tabelaDeSimbolos.get("nova_entrada").clear();
        }
    	
        String scenarioName = ctx.IDENT().getText();
        
        if(!tabelaDeSimbolos.containsKey("cenario")) {
            tabelaDeSimbolos.put("cenario", new ArrayList<String>());
        }
        
        // Adiciona o cenário na tabela
        tabelaDeSimbolos.get("cenario").add(scenarioName);
       
        visitMais_cenarios(ctx.mais_cenarios());
        
        return null; 
    }

    @Override
    public Object visitMais_cenarios(DramaturgoParser.Mais_cenariosContext ctx) {
        if(ctx.IDENT() != null) {
            String scenarioName = ctx.IDENT().getText();
            // Verifica se o cenario ja foi declarado anteriormente
            if(!hasValue("cenario", scenarioName)) {
                tabelaDeSimbolos.get("cenario").add(scenarioName);
            } else {
                // erro: cenario ja declarado 
                System.out.println("Linha " + ctx.start.getLine() + " - Erro (cenario): cenario " + scenarioName + " ja declarado!");
                numDeErros++;
            }
            
            visitMais_cenarios(ctx.mais_cenarios());
        }
        
        return null;
    }
    
    @Override
    public Object visitRecurso(DramaturgoParser.RecursoContext ctx) {
        if(!tabelaDeSimbolos.containsKey("recurso")) {
            tabelaDeSimbolos.put("recurso", new ArrayList<String>());
        }
        // Se o recurso for o estado de um personagem existente
        if(ctx.estado_personagem()!= null) {
        	// Caso o personagem tenha sido declarado
            if(hasValue("personagem", ctx.estado_personagem().PERSONAGEM().getText())) {
            	// Verifica se o recurso ainda nao foi declarado
                if(!hasValue("recurso", ctx.estado_personagem().getText())) {
                    tabelaDeSimbolos.get("recurso").add(ctx.estado_personagem().getText());
                } else {
                    // erro: estado de personagem ja declarado
                    System.out.println("Linha " + ctx.start.getLine() + " - Erro (recurso): recurso da emocao " + ctx.estado_personagem().IDENT().getText() + " do personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " ja carregado!");
                    numDeErros++;
                }
            // Caso o personagem nao exista
            } else {
                // erro: personagem nao declarado
                System.out.println("Linha " + ctx.start.getLine() + " - Erro (recurso): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao declarado!");
                numDeErros++;
            }
        // Se o recurso for um tipo de audio
        } else if(ctx.tipo_som() != null) {
            // Caso seja uma musica
            if(ctx.tipo_som().getText().equals("musica")) {
                if(!tabelaDeSimbolos.containsKey("musica")) {
                     tabelaDeSimbolos.put("musica", new ArrayList<String>());
                }
                String musica = ctx.IDENT().getText() + "(" + ctx.tipo_som().getText() +")";
                if(!hasValue("recurso", musica)) {
                    tabelaDeSimbolos.get("recurso").add(musica);
                    tabelaDeSimbolos.get("musica").add(ctx.IDENT().getText());
                } else {
                    // erro: recurso ja declarada
                    System.out.println("Linha " + ctx.start.getLine() + " - Erro (recurso): recurso para musica " + ctx.IDENT().getText() + " ja carregado!");
                    numDeErros++;
                }
            // Caso seja um som
            } else {
                if(!tabelaDeSimbolos.containsKey("som")) {
                     tabelaDeSimbolos.put("som", new ArrayList<String>());
                }
                String som = ctx.IDENT().getText() + "(" + ctx.tipo_som().getText() + ")";
                if(!hasValue("recurso", som)) {
                	tabelaDeSimbolos.get("som").add(ctx.IDENT().getText());
                	tabelaDeSimbolos.get("recurso").add(som);
                } else {
                	// erro: Som ja declarado
            		System.out.println("Linha " + ctx.start.getLine() + " - Erro (recurso): recurso para som " + ctx.IDENT().getText() + " ja carregado!");
            		numDeErros++;
                }
            }
        // Caso o recurso seja um cenario
        } else {
        	// Caso o cenario nao exista
        	if(!hasValue("cenario", ctx.IDENT().getText())) {
        		// erro: cenario nao declarado
        		System.out.println("Linha " + ctx.start.getLine() + " - Erro (recurso): cenario " + ctx.IDENT().getText() + " nao declarado!");
        		numDeErros++;
        	// Caso o recurso ja tenha sido declarado anteriormente
        	} else if(hasValue("recurso", ctx.IDENT().getText())) {
        		// erro: recurso ja declarado
        		System.out.println("Linha " + ctx.start.getLine() + " - Erro (recurso): recurso para cenario " + ctx.IDENT().getText() + " ja carregado!");
        		numDeErros++;
        	} else {
        		tabelaDeSimbolos.get("recurso").add(ctx.IDENT().getText());
        	}
        }
        return null; 
    }

    @Override
    public Object visitCena(DramaturgoParser.CenaContext ctx) {
        if(!tabelaDeSimbolos.containsKey("cena")) {
            tabelaDeSimbolos.put("cena", new ArrayList<String>());
        }
        // Adiciona a cena na tabela caso ela seja a sequencia imediata da cena anterior
        if(Integer.parseInt(ctx.nome_cena().NUM().getText()) == contCena) {
        	tabelaDeSimbolos.get("cena").add(ctx.nome_cena().NUM().getText());
	        contCena++;
        } else {
        	// Caso a cena ja exista
        	if(hasValue("cena", ctx.nome_cena().NUM().getText())) {
	            // erro: cena ja existe
	            System.out.println("Linha " + ctx.start.getLine() + " - Linha " + ctx.start.getLine() + " - Erro (cena): cena " + ctx.nome_cena().NUM().getText() + " ja existe!");
	            numDeErros++;
	        // Caso a cena nao seja sequencial
        	} else {
	        	// erro: as cenas devem ser criadas sequencialmente
	        	System.out.println("Linha " + ctx.start.getLine() + " - Erro (cena): cena " + ctx.nome_cena().NUM().getText() + " fora de ordem!");
	        	numDeErros++;
        	}
        }
        
        visitNarrativa(ctx.narrativa());
        
        visitPulo(ctx.pulo());
        return null;
    }
    
    @Override
    public Object visitNovo_cenario(DramaturgoParser.Novo_cenarioContext ctx) {
    	// Verifica se o cenario
        if(!hasValue("cenario", ctx.IDENT().getText())) {
            // erro: cenario nao declarado
            System.out.println("Linha " + ctx.start.getLine() + " - Erro (cena): cenario " + ctx.IDENT().getText() + " nao declarado!");
            numDeErros++;
        }
        return null; 
    }

    @Override
    public Object visitNova_entrada(DramaturgoParser.Nova_entradaContext ctx) {
    	if(!tabelaDeSimbolos.containsKey("nova_entrada")) {
            tabelaDeSimbolos.put("nova_entrada", new ArrayList<String>());
        }
        // Caso o personagem nao exista
        if(!hasValue("personagem", ctx.estado_personagem().PERSONAGEM().getText())) {
            // erro: personagem nao declarado
            System.out.println("Linha " + ctx.start.getLine() + " - Erro (entrada): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao declarado!");
            numDeErros++;
        // Caso o recurso do personagem nao exista
        }else if(!hasValue("recurso", ctx.estado_personagem().getText())) {
            // erro: recurso de estado de personagem nao carregado
            System.out.println("Linha " + ctx.start.getLine() + " - Erro (entrada): recurso da emocao " + ctx.estado_personagem().IDENT().getText() + " do personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao carregado!");
            numDeErros++;
        }
        // Verifica se o personagem ja entrou anteriormente
        if(!hasValue("nova_entrada", ctx.estado_personagem().PERSONAGEM().getText())) {
        	tabelaDeSimbolos.get("nova_entrada").add(ctx.estado_personagem().PERSONAGEM().getText());
        } else {
        	// erro: personagem ja esta em cena
        	System.out.println("Linha " + ctx.start.getLine() + " - Erro (entrada): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " ja esta em cena!");
        	numDeErros++;
        }
        
        visitOutra_entrada(ctx.outra_entrada());
        
        return null; 
    }

    @Override
    public Object visitOutra_entrada(DramaturgoParser.Outra_entradaContext ctx) {
        if(ctx.estado_personagem() != null) { 
            // Caso o personagem nao exista
            if(!hasValue("personagem", ctx.estado_personagem().PERSONAGEM().getText())) {
                // erro: personagem nao declarado
                System.out.println("Linha " + ctx.start.getLine() + " - Erro (entrada): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao declarado!");
                numDeErros++;
            // Caso o recurso do personagem nao exista
            } else if(!hasValue("recurso", ctx.estado_personagem().getText())) {
                // erro: recurso de estado de personagem nao carregado
                System.out.println("Linha " + ctx.start.getLine() + " - Erro (entrada): recurso da emocao" + ctx.estado_personagem().IDENT().getText() + " do personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao carregado!");
                numDeErros++;
            }
            
            if(tabelaDeSimbolos.containsKey("nova_entrada")) {
            	// Verifica se o personagem ja entrou anteriormente
            	if(!hasValue("nova_entrada", ctx.estado_personagem().PERSONAGEM().getText())) {
                	tabelaDeSimbolos.get("nova_entrada").add(ctx.estado_personagem().PERSONAGEM().getText());
                } else {
                	// erro: personagem ja esta em cena
                	System.out.println("Linha " + ctx.start.getLine() + " - Erro (entrada): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " ja esta em cena!");
                	numDeErros++;
                }
            }
            
            visitOutra_entrada(ctx.outra_entrada());
        }
        
        return null;
    }
    
    @Override
    public Object visitNova_saida(DramaturgoParser.Nova_saidaContext ctx) {
        // Caso o personagem nao exista
        if(!hasValue("personagem", ctx.PERSONAGEM().getText())) {
            // erro: personagem nao declarado
            System.out.println("Linha " + ctx.start.getLine() + " - Erro (saida): personagem " + ctx.PERSONAGEM().getText() + " nao declarado!");
            numDeErros++;
        // Caso o personagem esteja na lista de personagens em cena
        } else if(hasValue("nova_entrada", ctx.PERSONAGEM().getText())) {
        	tabelaDeSimbolos.get("nova_entrada").remove(ctx.PERSONAGEM().getText());
        } else {
            // erro: personagem nao esta em cena
            System.out.println("Linha " + ctx.start.getLine() + " - Erro (saida): personagem " + ctx.PERSONAGEM().getText() + " nao esta em cena!");
            numDeErros++;
        }
        
        visitOutra_saida(ctx.outra_saida());
        
        return null; 
    }

    @Override
    public Object visitOutra_saida(DramaturgoParser.Outra_saidaContext ctx) {
        if(ctx.PERSONAGEM() != null) {
            // Caso o personagem nao exista
            if(!hasValue("personagem", ctx.PERSONAGEM().getText())) {
                // erro: personagem nao declarado
                System.out.println("Linha " + ctx.start.getLine() + " - Erro (saida): personagem " + ctx.PERSONAGEM().getText() + " nao declarado!");
                numDeErros++;
            }
            
            visitOutra_saida(ctx.outra_saida());
        }
        
        return null;
    }
    

    @Override
    public Object visitNova_musica(DramaturgoParser.Nova_musicaContext ctx) {
    	// Verifica se a musica foi declarada
        if(!hasValue("musica", ctx.IDENT().getText())) {
            // erro: musica nao carregada
            System.out.println("Linha " + ctx.start.getLine() + " - Erro (cena): musica " + ctx.IDENT().getText() + " nao carregada!");
            numDeErros++;
        }
        return null; 
    }

    @Override
    public Object visitNovo_som(DramaturgoParser.Novo_somContext ctx) {
    	// Verifica se o som foi declarado
        if(!hasValue("som", ctx.IDENT().getText())) {
            // erro: som nao carregado
            System.out.println("Linha " + ctx.start.getLine() + " - Erro (cena): som " + ctx.IDENT().getText() + " nao carregado!");
            numDeErros++;
        }
        return null; 
    }

    @Override
    public Object visitDialogo(DramaturgoParser.DialogoContext ctx) {
    	
    	if(ctx.PERSONAGEM() != null) {
	        String charName = ctx.PERSONAGEM().getText();
	        
	        if(!charName.isEmpty()) {
	            if(!hasValue("personagem", charName)) {
	                // erro: personagem nao declarado
	                System.out.println("Linha " + ctx.start.getLine() + " - Erro (dialogo): personagem " + ctx.PERSONAGEM().getText() + " nao declarado!");
	                numDeErros++;
	            } else if(!hasValue("nova_entrada", ctx.PERSONAGEM().getText())) {
	            	// erro: personagem nao esta em cena
	            	System.out.println("Linha " + ctx.start.getLine() + " - Erro (dialogo): personagem " + ctx.PERSONAGEM().getText() + " nao esta em cena!");
	                numDeErros++;
	            }
	        }
    	}
    	
        return null; 
    }

    @Override
    public Object visitEscolha(DramaturgoParser.EscolhaContext ctx) {
    	// Adiciona cena a uma lista para verificacao posterior
    	if(ctx.nome_cena() != null) {
        	vaPara.put(ctx.nome_cena().NUM().getText(), ctx.start.getLine());
        }
        visitMais_escolhas(ctx.mais_escolhas());
        
        return null; 
    }

    @Override
    public Object visitMais_escolhas(DramaturgoParser.Mais_escolhasContext ctx) {
    	// Adiciona cena a uma lista para verificacao posterior
        if(ctx.CADEIA() != null){
        	if(ctx.nome_cena().NUM() != null) {
            	vaPara.put(ctx.nome_cena().NUM().getText(), ctx.start.getLine());
            }
            visitMais_escolhas(ctx.mais_escolhas());
        }
        
        return null;
    }
    
    @Override
    public Object visitPulo(PuloContext ctx) {
    	// Adiciona pulo a uma lista para verificacao posterior
    	if(!ctx.getText().equals("PULE FIM")) {
    		if(ctx.NUM() != null) {
    			pulos.put(ctx.NUM().getText(), ctx.start.getLine());
    		}
    	} 
	
    	return null;
    }
    
    @Override
    public Object visitMudanca_emocao(Mudanca_emocaoContext ctx) {
    	if(!tabelaDeSimbolos.containsKey("mudanca_emocao")) {
    		tabelaDeSimbolos.put("mudanca_emocao", new ArrayList<String>());
    	} else {
    		tabelaDeSimbolos.get("mudanca_emocao").clear();
    	}
    	
    	if(ctx.estado_personagem() != null) {
    		if(!hasValue("personagem", ctx.estado_personagem().PERSONAGEM().getText())) {
    			//erro: personagem nao declarado
    			System.out.println("Linha " + ctx.start.getLine() + " - Erro (mudar emocao): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao declarado!");
                numDeErros++;
    		} else if(!hasValue("recurso", ctx.estado_personagem().getText())) {
    			System.out.println("Linha " + ctx.start.getLine() + " - Erro (mudar emocao): recurso da emocao" + ctx.estado_personagem().IDENT().getText() + " do personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao carregado!");
                numDeErros++;
    		} else if(!hasValue("nova_entrada", ctx.estado_personagem().PERSONAGEM().getText())) {
    			System.out.println("Linha " + ctx.start.getLine() + " - Erro (mudar emocao): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao esta em cena!");
                numDeErros++;
    		} else {
    			tabelaDeSimbolos.get("mudanca_emocao").add(ctx.estado_personagem().PERSONAGEM().getText());
    		}
    	}
    	if(ctx.outra_mudanca() != null) {
    		visitOutra_mudanca(ctx.outra_mudanca());
    	}
    	return null;
    }
    
    @Override
    public Object visitOutra_mudanca(Outra_mudancaContext ctx) {
    	if(ctx.estado_personagem() != null) {
    		if(!hasValue("personagem", ctx.estado_personagem().PERSONAGEM().getText())) {
    			//erro: personagem nao declarado
    			System.out.println("Linha " + ctx.start.getLine() + " - Erro (mudar emocao): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao declarado!");
                numDeErros++;
    		} else if(!hasValue("recurso", ctx.estado_personagem().getText())) {
    			System.out.println("Linha " + ctx.start.getLine() + " - Erro (mudar emocao): recurso da emocao " + ctx.estado_personagem().IDENT().getText() + " do personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao carregado!");
                numDeErros++;
    		} else if(!hasValue("nova_entrada", ctx.estado_personagem().PERSONAGEM().getText())) {
    			System.out.println("Linha " + ctx.start.getLine() + " - Erro (mudar emocao): personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " nao esta em cena!");
                numDeErros++;
    		} else if(hasValue("mudanca_emocao", ctx.estado_personagem().PERSONAGEM().getText())) {
    			System.out.println("Linha " + ctx.start.getLine() + " - Erro (mudar emocao): emocao para o personagem " + ctx.estado_personagem().PERSONAGEM().getText() + " ja mudada!");
                numDeErros++;
    		} else {
    			tabelaDeSimbolos.get("mudanca_emocao").add(ctx.estado_personagem().PERSONAGEM().getText());
    		}
    	}
    	if(ctx.outra_mudanca() != null) {
    		visitOutra_mudanca(ctx.outra_mudanca());
    	}
    	return null;
    }
}