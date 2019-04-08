/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev, Mandy Hawkins, Abdulrahman Alhitm, Michael Seeley
 */

/*ANTLR4 libs import */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(microListener, parser.program());
            //new ParseTreeWalker().walk(microListener, parser.program());

            // Print symbol table
            //prettyPrint(microListener.getSymbolTable());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Print symbol table
     * @param tmp: Map<Integer, MicroSymbolTable>
     */
    private void prettyPrint(Map<Integer, MicroSymbolTable> tmp)
    {
        // Check is symbol table get duplicate identifiers
        // if there are duplicate identifiers, then print and error message
        Map<String, MicroSymbolTable> duplicates = duplicateCheck(tmp);
        if (duplicates != null)
        {
            for (Map.Entry<String, MicroSymbolTable> entry : duplicates.entrySet())
            {
                System.out.printf("DECLARATION ERROR %s\n", entry.getKey());
            }
        }

        // If no duplicate identifiers print symbol table
        if (duplicates == null)
        {
            // This counter used to specify where we should print extra new-line
            int countSymTable = 0;

            for (Map.Entry<Integer, MicroSymbolTable> entry : tmp.entrySet())
            {
                String symbolTable = entry.getValue().getSymbolTableName();

                String name = entry.getValue().getName();
                String type = entry.getValue().getType();
                String value = entry.getValue().getValue();

                if (symbolTable != null)
                {
                    // Printing extra new-line or not
                    if(countSymTable == 0)
                    {
                        System.out.printf("%s\n", symbolTable);
                    }
                    else if(countSymTable > 0)
                    {
                        System.out.printf("\n%s\n", symbolTable);
                    }
                    countSymTable++;
                }

                // This IF block is for STRING type because usually STRING go with some value
                if (name != null && type != null && value != null)
                {
                    String str = "name " + name + " type " + type + " value " + value;
                    System.out.printf("%s\n", str);
                }

                // This IF block is for INT, FLOAT types
                if (name != null && type != null && value == null)
                {
                    String str = "name " + name + " type " + type;
                    System.out.printf("%s\n", str);
                }
            }
        }

    }

    /**
     * Check for duplicate identifiers
     * @param tmp: Map<Integer, MicroSymbolTable>
     * @return Map<String, MicroSymbolTable>
     */
    private Map<String, MicroSymbolTable> duplicateCheck(Map<Integer, MicroSymbolTable> tmp)
    {
        Map<String, MicroSymbolTable> duplicates = null;

        int count = 0;

        for (Map.Entry<Integer, MicroSymbolTable> entry1 : tmp.entrySet())
        {
            String stn1 = entry1.getValue().getCurrentSymbolTableName();
            String n1 = entry1.getValue().getName();

            for (Map.Entry<Integer, MicroSymbolTable> entry2 : tmp.entrySet())
            {
                String stn2 = entry2.getValue().getCurrentSymbolTableName();
                String n2 = entry2.getValue().getName();

                if (n2 != null)
                {
                    if (stn2.equals(stn1) && n2.equals(n1))
                    {
                        count++;
                    }
                }
            }

            if (count >= 2)
            {
                if (duplicates == null)
                {
                    duplicates = new HashMap<String, MicroSymbolTable>();
                    duplicates.put(entry1.getValue().getName(), entry1.getValue());
                }
                else
                {
                    duplicates.put(entry1.getValue().getName(), entry1.getValue());
                }
            }
            count = 0;
        }

        return duplicates;
    }
}

