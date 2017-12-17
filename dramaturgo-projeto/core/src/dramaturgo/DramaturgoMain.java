package dramaturgo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import modelos.Narrativa;

/**
 *  Executa os passos pricipais de um compilador:
 *  Analise Sintatica
 *  Analise Semantica
 *  Interpretacao (no lugar de geracao de codigo intermediario)
 *  Retorna um objeto Narrativa que contem todos os objetos criados a partir da interpretacao.
 */
public class DramaturgoMain {
    
    //private static String casoDeTeste = "C:/Users/DwarfMeDown/Documents/EclipseProjects/Dramaturgo/core/src/exemplosSemErro/casoSemErro1.txt";
    
	private static String casoDeTeste;
	
    public DramaturgoMain(String arquivo) {
    	casoDeTeste = arquivo;
    }
    
    public Narrativa run() throws FileNotFoundException, IOException, Exception  {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(casoDeTeste));
        DramaturgoLexer lexer = new DramaturgoLexer(input);
        lexer.removeErrorListeners();
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DramaturgoParser parser = new DramaturgoParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new DramaturgoParserErrorListener());
        
        DramaturgoParser.ProgramaContext arvore = null;
        
        try {
        	// Realiza a analise sintatica
        	arvore = parser.programa();
		} catch (ParseCancellationException e) {
			System.out.println(e);
		}

        int numErrosSemanticos = 0;
        // Caso nao ocorra erros sintaticos, realiza analise semantica
        if(parser.getNumberOfSyntaxErrors() == 0) {
	        DramaturgoSemantico analiseSemantica = new DramaturgoSemantico();
	        numErrosSemanticos = (Integer) analiseSemantica.visitPrograma(arvore);
        } else {
        	throw new ParseCancellationException("Analise sintatica falhou!");
        }
        
        // Caso nao ocorra erros semanticos, realiza a interpretacao do codigo
        if(numErrosSemanticos == 0) {
	        DramaturgoInterpretador dramin = new DramaturgoInterpretador();
	        return (Narrativa) dramin.visitPrograma(arvore);
        }
        
        throw new Exception("Compilacao falhou!");
    }   
}
