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
    // Is used to count elements and assign proper ID to specific element
    private static int id = 1;
    private int elementId = 1;

    // Is used to store symbol-table-name
    private int symbolTableId = -1;
    private String symbolTableName = null;

    // This extra symbol-table-name is used to label each declaration block,
    // in other words each declaration block is attached to specific symbol-table-name
    private String currentSymbolTableName = null;

    // Is used to store variable information
    private String name = null;
    private String type = null;
    private String value = null;

    // Data structure to store statement information
    private Statement statementObj = null;


    /**
     * Constructor is used only for symbol-table-name
     * @param symbolTableName
     */
    public MicroSymbolTable(String symbolTableName, int symbolTableId)
    {
        this.elementId = id;
        this.symbolTableId = symbolTableId;
        this.symbolTableName = symbolTableName;
        this.currentSymbolTableName = symbolTableName;
        id++;
    }

    /**
     * Constructor is used only for STRING type
     * @param name
     * @param type
     * @param value
     * @param currentSymbolTableName
     */
    public MicroSymbolTable(String name, String type, String value, String currentSymbolTableName, int symbolTableId)
    {
        this.elementId = id;
        this.name = name;
        this.type = type;
        this.value = value;
        this.currentSymbolTableName = currentSymbolTableName;
        this.symbolTableId = symbolTableId;
        id++;
    }

    /**
     * Constructor is used only for INT and FLOAT types
     * @param name
     * @param type
     * @param currentSymbolTableName
     */
    public MicroSymbolTable(String name, String type, String currentSymbolTableName, int symbolTableId)
    {
        this.elementId = id;
        this.name = name;
        this.type = type;
        this.currentSymbolTableName = currentSymbolTableName;
        this.symbolTableId = symbolTableId;
        id++;
    }

    public void setStatementObj(Statement obj)
    {
        this.statementObj = obj;
    }

    public Statement getStatementObj()
    {
        return this.statementObj;
    }

    public int getElementId()
    {
        return this.elementId;
    }

    public int getSymbolTableId()
    {
        return this.symbolTableId;
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
