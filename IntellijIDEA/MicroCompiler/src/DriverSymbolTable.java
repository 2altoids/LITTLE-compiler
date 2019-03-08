/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev, Mandy Hawkins, Abdulrahman Alhitm, Michael Seeley
 */

/*ANTLR4 libs import */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.net.URL;

public class DriverSymbolTable
{
    // Path to the .micro file
    private URL res = null;

    public DriverSymbolTable(URL res)
    {
        this.res = res;
    }

    public void run()
    {
        // Initializing necessary classes for parsing
        CharStream inp = null;
        MicroGrammarLexer lexer = null;
        CommonTokenStream tokens = null;
        MicroGrammarParser parser = null;

        try
        {
            // Get input from the file directly
            inp = CharStreams.fromStream(res.openStream());

            // Initialize lexer and parser
            lexer = new MicroGrammarLexer(inp);
            tokens = new CommonTokenStream(lexer);
            parser = new MicroGrammarParser(tokens);

            MicroListener microListener = new MicroListener();
            new ParseTreeWalker().walk(microListener, parser.program());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

