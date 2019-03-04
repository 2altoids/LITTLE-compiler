/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev, Mandy Hawkins, Abdulrahman Alhitm, Michael Seeley
 */

/*ANTLR4 libs import */
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class MicroTokenizer
{
    // Path to the .micro file
    private URL res = null;

    // For recognition of tokens
    private CustomToken customToken = new CustomToken();

    /**
     *
     * @param res: URL type
     */
    public MicroTokenizer(URL res)
    {
        this.res = res;
    }

    /**
     *  Run Tokenizer
     * @throws IOException
     */
    public void run() throws IOException
    {
        /*In the final application file name should be provided via command line*/

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

            // We do not have to parse a comment line, we have to skip it
            if(!comment)
            {
                // string_decl: KEYWORD id OPERATOR str OPERATOR;
                boolean isStringDecl = false;
                String[] stringDecl = null;

                // Split input line using its spaces
                String[] splited = inputString.split("\\s+");

                // Extra test for the bloc comment
                // Sometimes comment can be behind the regular block
                // and it can messed up tokenization process
                //===================================================================================//
                String newInputString = "";
                String[] tmpArr = extraComment(splited);
                if(tmpArr != null)
                {
                    splited = tmpArr;
                    for(int i = 0; i < splited.length; i++)
                    {
                        newInputString += splited[i];
                    }
                    inputString = newInputString;
                }
                //===================================================================================//

                // Getting rebuilded splited input line of STRING
                stringDecl = strLiteral(inputString, splited);
                if(stringDecl != null)
                {
                    splited = stringDecl;
                    isStringDecl = true;
                }

                // Some input strings can have such excretions: RETURN F(n-1)+F(n-2);
                // So we need to add extra spaces beetling these characters
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

    public String[] addSpace(String[] splited)
    {
        String[] newSplited = null;
        String str = "";
        String tmp = "";

        // Check if input line has + - * / = < > ( ) ; ,
        // and add extra space
        for(int i = 0; i < splited.length; i++)
        {
            char[] chars = splited[i].toCharArray();
            for(int j = 0; j < chars.length; j++)
            {
                if(chars[j] == '+')
                {
                    tmp = splited[i].replace("+", " + ");
                    splited[i] = tmp;
                }
                if(chars[j] == '-')
                {
                    tmp = splited[i].replace("-", " - ");
                    splited[i] = tmp;
                }
                if(chars[j] == '*')
                {
                    tmp = splited[i].replace("*", " * ");
                    splited[i] = tmp;
                }
                if(chars[j] == '/')
                {
                    tmp = splited[i].replace("/", " / ");
                    splited[i] = tmp;
                }
                if(chars[j] == '=')
                {
                    if(chars.length >= 2)
                    {
                        if(chars[j-1] != '!' && chars[j-1] != ':' && chars[j-1] != '<' && chars[j-1] != '>')
                        {
                            tmp = splited[i].replace("=", " = ");
                            splited[i] = tmp;
                        }
                    }
                }
                if(chars[j] == '<')
                {
                    if(chars.length > 1)
                    {
                        if(chars[j+1] != '=')
                        {
                            tmp = splited[i].replace("<", " < ");
                            splited[i] = tmp;
                        }
                    }
                    else
                    {
                        tmp = splited[i].replace("<", " < ");
                        splited[i] = tmp;
                    }
                }
                if(chars[j] == '>')
                {
                    if(chars.length > 1)
                    {
                        if(chars[j+1] != '=')
                        {
                            tmp = splited[i].replace(">", " > ");
                            splited[i] = tmp;
                        }
                    }
                    else
                    {
                        tmp = splited[i].replace(">", " > ");
                        splited[i] = tmp;
                    }
                }
                if(chars[j] == '(')
                {
                    tmp = splited[i].replace("(", " ( ");
                    splited[i] = tmp;
                }
                if(chars[j] == ')')
                {
                    tmp = splited[i].replace(")", " ) ");
                    splited[i] = tmp;
                }
                if(chars[j] == ';')
                {
                    tmp = splited[i].replace(";", " ; ");
                    splited[i] = tmp;
                }
                if(chars[j] == ',')
                {
                    tmp = splited[i].replace(",", " , ");
                    splited[i] = tmp;
                }
            }
            //System.out.printf("-------------------: %s\n", tmp);
            str += splited[i] + " ";
            tmp = null;
        }


        newSplited = str.split("\\s+");

        return newSplited;
    }

    public boolean isComment(String inputLine)
    {
        boolean comment = false;

        // Remove all white spaces for input line to identify if input line is comment
        //===================================================================================//
        String tmpStr = inputLine.replaceAll("\\s+", "");
        char[] chars = tmpStr.toCharArray();

        if(chars.length >= 1)
        {
            if(chars[0] == '-' && chars[1] == '-')
            {
                //System.out.printf("\tCOMMENT: %s\n", inputLine);
                comment = true;
            }
        }
        //===================================================================================//

        return comment;
    }

    // This function is used for cleaning up line from comment
    // when comment is behind of statement blocks
    public String[] extraComment(String[] splited)
    {
        String[] newSplited = null;
        int index = -1;

        // Extra test for the comment block
        //===================================================================================//
        for(int i = 0; i < splited.length; i++)
        {
            if(splited[i].length() > 1)
            {
                if(splited[i].charAt(0) == '-' && splited[i].charAt(1) == '-')
                {
                    index = i;
                    break;
                }
            }
        }

        if(index != -1)
        {
            newSplited = new String[index - 1];
            for(int i = index; i < splited.length; i++)
            {
                splited[i] = null;
            }

            int k = 0;
            for(int i = 0; i < splited.length; i++)
            {
                if(splited[i] != null)
                {
                    if(!splited[i].equals(""))
                    {
                        newSplited[k] = splited[i];
                        k++;
                    }
                }
            }
        }
        else
        {
            newSplited = null;
        }

        return newSplited;
    }

    public String[] strLiteral(String inputLine, String[] splited)
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
                // Handling weird cases when string declaration is not following rules
                // like: STRING a,b,c;
                // Should be: STRING a := "string value";
                try
                {
                    // string_decl: STRING id ':=' str ';';
                    // max is [5]
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
                catch (Exception e)
                {
                    //System.out.printf("%s", e.getMessage());
                    tmp = null;
                }
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
    public void output(MicroGrammarParser parser)
    {
        // Get token text which is token name
        String tokenValue = parser.getCurrentToken().getText();

        // Get token type number, such number shows type in the
        // .tokens file
        int tokenTypeNum = parser.getCurrentToken().getType();

        // Get symbolic name by type basically "symbolic name" is "Token Type"
        String tokenType = parser.getVocabulary().getSymbolicName(tokenTypeNum);

        String tokenType2 = customToken.testToken(tokenValue);
        if(tokenType2 == null)
        {
            tokenType2 = tokenType;
        }
        else
        {
            tokenType = tokenType2;
        }

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
