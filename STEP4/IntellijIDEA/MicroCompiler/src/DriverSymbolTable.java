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

            // IS NOT APPLICABLE FOR THE STEP 3 BECAUSE DATA-STRUCTURE WAS MODIFIED FOR STEP 4,
            // AS WELL AS MicroListener WAS MODIFIED FOR STEP 4.
            // ----------------------------------------------------------------------------------- //
            // Print symbol table for STEP 3
            //prettyPrint(microListener.getSymbolTable());
            // ----------------------------------------------------------------------------------- //

            // Print symbol table for STEP 4
            print(microListener.getSymbolTable());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Print symbol table for STEP 3
     * @param tmp: Map<Integer, MicroSymbolTable>
     */
    private void prettyPrint(Map<Integer, MicroSymbolTable> tmp)
    {
        // Check if symbol table get duplicate identifiers
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

                // This IF block is for INT and FLOAT types
                if (name != null && type != null && value == null)
                {
                    String str = "name " + name + " type " + type;
                    System.out.printf("%s\n", str);
                }
            }
        }

    }


    /**
     * Print symbol table for STEP 4
     * @param tmp: Map<Integer, MicroSymbolTable>
     */
    private void print(Map<Integer, MicroSymbolTable> tmp)
    {
        // Check if symbol table get duplicate identifiers
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
                int symbolTableID = entry.getValue().getSymbolTableId();
                String symbolTable = entry.getValue().getSymbolTableName();

                String name = entry.getValue().getName();
                String type = entry.getValue().getType();
                String value = entry.getValue().getValue();

                String nl = "";

                // Checking if we need to print extra newline
                // ================================================================================= //
                if (symbolTable != null)
                {
                    // Printing extra new-line or not
                    if(countSymTable == 0)
                    {
                        nl = "";
                    }
                    else if(countSymTable > 0)
                    {
                        nl = "\n";
                    }
                    countSymTable++;

                    // Printing symbol-table
                    System.out.printf("%s[%d]: %s\n", nl, symbolTableID, symbolTable);

                    // Printing statements
                    // ---------------------------------------------------------------------------------- //
                    if(entry.getValue().getStatementObj() != null)
                    {
                        String lable = entry.getValue().getStatementObj().getLableName();
                        String statement = null;
                        if(entry.getValue().getStatementObj().isCondition())
                        {
                            statement = "condition";
                        }
                        else
                        {
                            statement = "assignment";
                        }
                        String strOut = entry.getValue().getStatementObj().getStatement();

                        System.out.printf("\t\t%s --- %s: %s\n", lable, statement, strOut);

                        boolean isBeginningOfBlock = entry.getValue().getStatementObj().isBeginningOfBlock();
                        System.out.printf("\t\tBLOCK BEGINNING: %b\n", isBeginningOfBlock);
                    }
                    // ---------------------------------------------------------------------------------- //
                }
                // ================================================================================= //

                // Printing strings declarations
                // This IF block, is for STRING type because usually STRING go with some value
                // ---------------------------------------------------------------------------------- //
                if (name != null && type != null && value != null)
                {
                    String str = "name " + name + " type " + type + " value " + value;
                    System.out.printf("[%d]: %s\n", symbolTableID, str);
                }
                // ---------------------------------------------------------------------------------- //

                // Printing variables declarations
                // This IF block, is for INT and FLOAT types
                // ---------------------------------------------------------------------------------- //
                if (name != null && type != null && value == null)
                {
                    String str = "name " + name + " type " + type;
                    System.out.printf("[%d]: %s\n", symbolTableID, str);
                }
                // ---------------------------------------------------------------------------------- //
                // ================================================================================= //
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

