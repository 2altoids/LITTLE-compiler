/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev, Mandy Hawkins, Abdulrahman Alhitm, Michael Seeley
 */

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to test token and identify its subclass
 */
public class CustomToken
{
    Map<String,String> tokens = new HashMap<String,String>();

    public CustomToken()
    {
        // Keywords
        tokens.put("PROGRAM", "KEYWORD");
        tokens.put("BEGIN", "KEYWORD");
        tokens.put("END", "KEYWORD");
        tokens.put("FUNCTION", "KEYWORD");
        tokens.put("READ", "KEYWORD");
        tokens.put("WRITE", "KEYWORD");
        tokens.put("IF", "KEYWORD");
        tokens.put("ELSE", "KEYWORD");
        tokens.put("ENDIF", "KEYWORD");
        tokens.put("WHILE", "KEYWORD");
        tokens.put("ENDWHILE", "KEYWORD");
        tokens.put("CONTINUE", "KEYWORD");
        tokens.put("BREAK", "KEYWORD");
        tokens.put("RETURN", "KEYWORD");
        tokens.put("INT", "KEYWORD");
        tokens.put("VOID", "KEYWORD");
        tokens.put("STRING", "KEYWORD");
        tokens.put("FLOAT", "KEYWORD");

        // Operators
        tokens.put(":=", "OPERATOR");
        tokens.put("+", "OPERATOR");
        tokens.put("-", "OPERATOR");
        tokens.put("*", "OPERATOR");
        tokens.put("/", "OPERATOR");
        tokens.put("=", "OPERATOR");
        tokens.put("!=", "OPERATOR");
        tokens.put("<", "OPERATOR");
        tokens.put(">", "OPERATOR");
        tokens.put("(", "OPERATOR");
        tokens.put(")", "OPERATOR");
        tokens.put(";", "OPERATOR");
        tokens.put(",", "OPERATOR");
        tokens.put("<=", "OPERATOR");
        tokens.put(">=", "OPERATOR");
    }

    public String testToken(String str)
    {
        String tokenType = null;

        for (Map.Entry<String, String> entry : tokens.entrySet())
        {
            if(entry.getKey().equals(str))
            {
                tokenType = entry.getValue();
            }
        }

        return tokenType;
    }
}
