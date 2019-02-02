/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev
 */

/*ANTLR4 libs import */
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Main
{
    public static void main(String[] args) throws IOException, URISyntaxException
    {
        /*In the final application file name should be provided via command line*/

        // Get absolute path to the .micro file
        URL res = null;
        String filePath = "Here should be absolute path to the .micro file";
        res = Paths.get(filePath).toUri().toURL();

        // Initialize stream of chars from .micro file
        CharStream inp = null;

        // Loop via .micro file and get its text using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(res.openStream()));
        String inputString;


        while ((inputString = br.readLine()) != null)
        {

            // Remove all white spaces for input line to identify if input line is comment
            //===================================================================================//
            boolean comment = isComment(inputString);
            //===================================================================================//

            // We do not have to parr comment line, we have to skip it
            if(!comment)
            {
                //System.out.println(inputString);
                String[] splited = inputString.split("\\s+");
                for(int i = 0; i < splited.length; i++)
                {
                    // get char steam from the input line
                    inp = CharStreams.fromString(splited[i]);

                    gl2Lexer lexer = new gl2Lexer(inp);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    gl2Parser parser = new gl2Parser(tokens);

                    // Get token text which is token name
                    String tokenName = parser.getCurrentToken().getText();

                    // Get token type number, such number shows type in the
                    // .tokens file
                    int tokenTypeNum = parser.getCurrentToken().getType();

                    // -1 associated with EOF, there is no needs to print it out
                    if(tokenTypeNum != -1)
                    {
                        System.out.printf("%s: %d\n",tokenName, tokenTypeNum);
                    }

                    /*Still have some problems with identifying string literals*/
                    /*In the final app we have to read .tokens file to get associated names with
                      token type.
                    */
                }
            }
        }
    }

    public static boolean isComment(String inputLine)
    {
        boolean comment = false;

        // Remove all white spaces for input line to identify if input line is comment
        //===================================================================================//
        String tmpStr = inputLine.replaceAll("\\s+", "");
        char[] chars = tmpStr.toCharArray();
        /*
        for(int i = 0; i < chars.length; i++)
        {
            System.out.printf("\t[%d]: %c\n", i, chars[i]);
        }
        */

        if(chars.length >= 1)
        {
            if(chars[0] == '-' && chars[0] == '-')
            {
                System.out.println("COMMENT");
                comment = true;
            }
        }
        //===================================================================================//

        return comment;
    }
}
