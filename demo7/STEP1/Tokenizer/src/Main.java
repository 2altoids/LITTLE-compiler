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
        //===========================================================================================//
        URL res = null;
        String path = "C:\\Users\\alexm\\Desktop\\Programs\\MSU_Classes\\2019\\Spring\\Compilers_CSCI_468_001\\labs\\STEP1\\Tokenizer\\testfiles\\step1\\inputs\\";

        // fibonacci.micro
        // loop.micro
        // nested.micro
        // sqrt.micro
        String file = "fibonacci.micro";
        String filePath = path + file;

        res = Paths.get(filePath).toUri().toURL();
        //===========================================================================================//

        // Initialize stream of chars from .micro file
        CharStream inp = null;

        // Loop via .micro file and get its text using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(res.openStream()));
        String inputString;


        while ((inputString = br.readLine()) != null)
        {
            //System.out.printf("%s\n", inputString);

            // Remove all white spaces for input line to identify if input line is comment
            //===================================================================================//
            boolean comment = isComment(inputString);
            //===================================================================================//

            // We do not have to parse a comment line, we have to skip it
            if(!comment)
            {
                // string_decl: KEYWORD id OPERATOR str OPERATOR;
                boolean isStringDecl = false;
                String[] stringDecl = null;

                // Split input line using its spaces
                String[] splited = inputString.split("\\s+");

                // Getting rebuilded splited input line of STRING
                stringDecl = strLiteral(inputString, splited);
                if(stringDecl != null)
                {
                    splited = stringDecl;
                    isStringDecl = true;
                }



                if(!isStringDecl)
                {
                    splited = addSpace(splited);
                }




                // Building "Token Type" and its "Value"
                for(int i = 0; i < splited.length; i++)
                {
                    if(!splited[i].equals(null))
                    {
                        if(!splited[i].equals(""))
                        {
                            //System.out.printf("-----: %s\n", splited[i]);

                            // get char steam from the input line
                            inp = CharStreams.fromString(splited[i]);

                            MicroGrammarLexer lexer = new MicroGrammarLexer(inp);
                            CommonTokenStream tokens = new CommonTokenStream(lexer);
                            MicroGrammarParser parser = new MicroGrammarParser(tokens);

                            output(parser);
                        }
                    }
                }
            }
        }
    }

    public static String[] addSpace(String[] splited)
    {
        String[] newSplited = null;
        String tmp = null;

        // Check if input line has + - * / = < > ( ) ; ,
        // and add extra space
        for(int i = 0; i < splited.length; i++)
        {
            char[] chars = splited[i].toCharArray();
            for(int j = 0; j < chars.length; j++)
            {
                if(
                        chars[j] == '+' || chars[j] == '-' || chars[j] == '*' || chars[j] == '/'
                        || chars[j] == '=' || chars[j] == '<' || chars[j] == '>' || chars[j] == '('
                        || chars[j] == ')' || chars[j] == ';' || chars[j] == ','
                  )
                {
                    System.out.printf("%s\n", splited[i]);
                }
            }
            //System.out.printf("%s\n", tmp);
        }

        return splited;
    }

    public static boolean isComment(String inputLine)
    {
        boolean comment = false;

        // Remove all white spaces for input line to identify if input line is comment
        //===================================================================================//
        String tmpStr = inputLine.replaceAll("\\s+", "");
        char[] chars = tmpStr.toCharArray();

        if(chars.length >= 1)
        {
            if(chars[0] == '-' && chars[0] == '-')
            {
                System.out.printf("\tCOMMENT: %s\n", inputLine);
                comment = true;
            }
        }
        //===================================================================================//

        return comment;
    }

    public static String[] strLiteral(String inputLine, String[] splited)
    {
        boolean isStrLiteral = false;

        // Get STRINGLITERAL
        //=================================================================================//
        for(int i = 0; i < splited.length; i++)
        {
            if(!splited[i].equals(null))
            {
                // Checking if input li ne is STRINGLITERAL
                if(splited[i].equals("STRING"))
                {
                    isStrLiteral = true;
                    break;
                }
            }
        }
        //=================================================================================//

        if(isStrLiteral)
        {
            // We will return string array that will include:
            //      STRINGLITERAL
            //      semicolon
            String[] strArr = null;

            char[] chars = inputLine.toCharArray();
            int start = -1;
            int end = -1;
            String pulledStr = "";
            String semicolon = "";

            // Get index of '"'
            for(int i = 0; i < chars.length; i++)
            {
                if(chars[i] == '"')
                {
                    start = i;
                    break;
                }
            }
            end = chars.length - 1;

            // If input line has '"' then it means we have STRINGLITERAL
            if(start != -1)
            {
                // Initialize string array
                strArr = new String[2];

                // Build STRINGLITERAL
                for(int i = start; i < end; i++)
                {
                    pulledStr += chars[i];
                    //System.out.printf("\t[%d]: %s\n", i, chars[i]);
                }

                // Get semicolon
                semicolon = "" + chars[end];

                strArr[0] = pulledStr;
                strArr[1] = semicolon;
                //System.out.printf("\tPulled string: %s%s\n", pulledStr, semicolon);
            }

            String[] tmp = null;
            // Build new splited line
            //=================================================================================//
            if(isStrLiteral)
            {
                tmp = new String[5];
                // Build new splited line
                for(int i = 0; i < splited.length; i++)
                {
                    if(!splited[i].equals(null))
                    {
                        if(!splited[i].equals(""))
                        {
                            tmp[0] = splited[i];   // KEYWORD
                            tmp[1] = splited[i+1]; // id
                            tmp[2] = splited[i+2]; // OPERATOR
                            break;
                        }
                    }
                }
                tmp[3] = strArr[0]; // str
                tmp[4] = strArr[1]; // OPERATOR

                splited = null;
                splited = tmp;
            }
            //=================================================================================//

            return tmp;
        }
        else
        {
            return null;
        }
    }

    // Building "Token Type" and its "Value"
    public static void output(MicroGrammarParser parser)
    {
        // Get token text which is token name
        String tokenValue = parser.getCurrentToken().getText();

        // Get token type number, such number shows type in the
        // .tokens file
        int tokenTypeNum = parser.getCurrentToken().getType();

        // Get symbolic name by type basically "symbolic name" is "Token Type"
        String tokenType = parser.getVocabulary().getSymbolicName(tokenTypeNum);

        // -1 associated with EOF, there is no needs to print it out
        if(tokenTypeNum != -1)
        {
            /*
            * Token Type: KEYWORD
            * Value: PROGRAM
            */

            System.out.printf("Token Type: %s\nValue: %s\n", tokenType, tokenValue);
        }


    }
}
