package Implementation;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import parser.PascalLexer;
import parser.PascalParser;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {


    public static void main(String[] args){
        try {
            CharStream charStream = CharStreams.fromFileName("Sample.pas");
            PascalLexer lexer = new PascalLexer(charStream);
            PascalParser parser = new PascalParser(new CommonTokenStream(lexer));
            parser.addParseListener(new PascalListenerImplementation());
            parser.program();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
