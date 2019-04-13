/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev, Mandy Hawkins, Abdulrahman Alhitm, Michael Seeley
 */

/*ANTLR4 libs import */
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.net.URL;

/**
 * MicroParser extends BaseErrorListener in order to count ANTLR parsing errors
 */
public class MicroParser extends BaseErrorListener
{
    // Path to the .micro file
    private URL res = null;

    public MicroParser(URL res)
    {
        this.res = res;
    }

    /**
     * Run Parser
     */
    public void run()
    {
        int errNumbs = -1;
        String message = null;

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

            // We have to remove ConsoleErrorListener from our parser
            // in order to avoid error prints in the console
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);

            // Parsing input .micro
            parser.program();

            // Get number of parsing or number of syntax errors
            errNumbs = parser.getNumberOfSyntaxErrors();
            //System.out.println("Number of syntax errors: " + errNumbs);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        if (errNumbs == 0)
        {
            message = "Accepted";
        }
        else
        {
            message = "Not accepted";
        }

        System.out.printf("%s\n", message);
    }
}
