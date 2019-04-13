/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev, Mandy Hawkins, Abdulrahman Alhitm, Michael Seeley
 */

/**
 * This class used as a data structure of the symbol table
 */
public class MicroSymbolTable
{
    private static int id = 1;
    private int elementId = 1;

    private String symbolTableName = null;
    private String currentSymbolTableName = null;

    private String name = null;
    private String type = null;
    private String value = null;

    public MicroSymbolTable(String symbolTableName)
    {
        this.elementId = id;
        this.symbolTableName = symbolTableName;
        this.currentSymbolTableName = symbolTableName;

        id++;
    }

    // For STRING
    public MicroSymbolTable(String name, String type, String value, String currentSymbolTableName)
    {
        this.elementId = id;
        this.name = name;
        this.type = type;
        this.value = value;
        this.currentSymbolTableName = currentSymbolTableName;
        id++;
    }

    public MicroSymbolTable(String name, String type, String currentSymbolTableName)
    {
        this.elementId = id;
        this.name = name;
        this.type = type;
        this.currentSymbolTableName = currentSymbolTableName;
        id++;
    }

    public int getElementId()
    {
        return this.elementId;
    }

    public String getSymbolTableName()
    {
        return this.symbolTableName;
    }

    public String getName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }

    public String getValue()
    {
        return value;
    }

    public String getCurrentSymbolTableName()
    {
        return this.currentSymbolTableName;
    }

}
