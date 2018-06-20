package Implementation;



import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.PascalLexer;
import parser.PascalParser;
import utils.DataType;

import java.io.IOException;

public class Main {


    public static void main(String[] args){
        try {
            CharStream charStream = CharStreams.fromFileName("Sample.pas");
            PascalLexer lexer = new PascalLexer(charStream);
            PascalParser parser = new PascalParser(new CommonTokenStream(lexer));
            RepeatListener listenerImplementation = new RepeatListener();
            PascalParser.ProgramContext program = parser.program();
            ParseTreeWalker.DEFAULT.walk(listenerImplementation,program);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
