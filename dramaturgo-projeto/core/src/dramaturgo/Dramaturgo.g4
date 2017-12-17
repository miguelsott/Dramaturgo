grammar Dramaturgo;
// Comando pra gerar os arquivos: java -jar antlr-4.7-complete.jar -package dramaturgo -visitor Dramaturgo.g4
// Exemplo: java -jar C:\Users\DwarfMeDown\Documents\EclipseProjects\Dramaturgo\core\libs\antlr-4.7-complete.jar -package dramaturgo -visitor Dramaturgo.g4

programa : cabecalho corpo 'FIM';

cabecalho : titulo personagens cenarios recursos; 

corpo : cena mais_cenas;

titulo : 'TITULO:' CADEIA;

personagens : 'PERSONAGENS:' PERSONAGEM mais_personagens '.';

cenarios : 'CENARIOS:' IDENT mais_cenarios '.';

recursos : 'RECURSOS:' recurso mais_recursos '.';

cena : '-' nome_cena '-' narrativa pulo;

nome_cena : 'CENA' NUM;

mais_cenas : cena mais_cenas
           |
           ;

mais_personagens : ',' PERSONAGEM mais_personagens
                 |
                 ;

mais_cenarios : ',' IDENT mais_cenarios
              |
              ;

recurso : estado_personagem '=' CADEIA 
        | IDENT '=' CADEIA
        | IDENT '(' tipo_som ')' '=' CADEIA 
        ;

mais_recursos : ',' recurso mais_recursos 
              |
              ;

narrativa : entrelinhas narrativa
          | dialogo narrativa
          | escolha narrativa
          |
          ;

pulo : 'PULE' NUM
	 | 'PULO FIM' 
	 |
	 ;

estado_personagem : PERSONAGEM '[' IDENT ']';

tipo_som : 'musica' | 'som';

entrelinhas : novo_cenario
            | nova_entrada
            | mudanca_emocao
            | nova_saida
            | nova_musica
            | novo_som;

dialogo : CADEIA
        | PERSONAGEM '-' CADEIA;

escolha : 'ESCOLHA:' CADEIA '-' 'va' 'para' nome_cena mais_escolhas '.';

mais_escolhas : ',' CADEIA '-' 'va' 'para' nome_cena mais_escolhas
              |
              ;

novo_cenario : '(' 'cenario' IDENT ')';
nova_entrada : '(' 'entra' estado_personagem outra_entrada ')';
mudanca_emocao: '(' estado_personagem outra_mudanca ')';
nova_saida : '(' 'sai' PERSONAGEM outra_saida ')';
nova_musica : '(' 'musica' IDENT ')';
novo_som : '(' 'som' IDENT ')';

outra_entrada : 'e' estado_personagem outra_entrada
              |
              ;
              
outra_mudanca : 'e' estado_personagem outra_mudanca
              |
              ; 

outra_saida : 'e' PERSONAGEM outra_saida
            |
           ;

CADEIA: '"' ~('\r' | '\n' | '"')* '"';
PERSONAGEM : [A-Z][a-zA-Z_0-9]*;
IDENT : [a-z_][a-zA-Z_0-9]*;  
NUM : [0-9]+;
WS: [ \n\t\r]+ -> skip;
