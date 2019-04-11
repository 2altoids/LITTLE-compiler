public class Statement
{
    private String currentSymbolTableName = null;
    private String lableName = null;

    private boolean isCondition = false;
    private String statement = null;

    public Statement(String currentSymbolTableName, String lableName, boolean isCondition, String statement)
    {
        this.currentSymbolTableName = currentSymbolTableName;
        this.lableName = lableName;
        this.isCondition = isCondition;
        this.statement = statement;
    }

    public String getLableName()
    {
        return this.lableName;
    }

    public boolean isCondition()
    {
        return this.isCondition;
    }

    public String getStatement()
    {
        return this.statement;
    }
}
