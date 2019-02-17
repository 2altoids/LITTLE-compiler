/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev
 */

import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.net.URL;

/**
 * MicroParser extends BaseErrorListener in order to count ANTLR parsing errors
 */
public class MicroParser extends BaseErrorListener
{
    /**
     * Run parser
     * @param res: URL
     */
    public void run(URL res)
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



    // Just DEMO
    // ================================================================================================ //
    /*
    public static void main(String[] args)
    {
        String fileName = null;
        String path = null;
        String filePath = null;

        Path currentDir = Paths.get(".");
        path = currentDir.toAbsolutePath().toString();

        if(args[0] != null)
        {
            fileName = args[0];
            filePath = path + "/" + fileName;

            try
            {
                URL res = null;

                // USe this if you want to run it from IDE
                String path2 = "C:\\Users\\alexm\\Desktop\\Programs\\MSU_Classes\\2019\\Spring\\Compilers_CSCI_468_001\\labs\\STEP2\\Parser\\src\\";
                String file2 = "test2.micro";
                String filePath2 = path2 + file2;

                res = Paths.get(filePath2).toUri().toURL();


                CharStream inp = CharStreams.fromStream(res.openStream());
                MicroGrammarLexer lexer = new MicroGrammarLexer(inp);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MicroGrammarParser parser = new MicroGrammarParser(tokens);

                try
                {
                    String text = parser.program().getText();
                    System.out.println(text);
                }
                catch (RecognitionException  r)
                {
                    System.out.println(r.getMessage());
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.printf("You did not provide complete file name!\n");
        }
    }
    */
    // ================================================================================================ //
}
