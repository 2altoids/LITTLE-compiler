/**
 * Montana State University
 * Class: Compilers - CSCI 468
 * @author Olexandr Matveyev, Mandy Hawkins, Abdulrahman Alhitm, Michael Seeley
 */

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class MicroListener extends MicroGrammarBaseListener
{
    // data structure to store our symbol table
    private HashMap<Integer, MicroSymbolTable> symbolTable = new HashMap<Integer, MicroSymbolTable>();

    // This global variable is used to count number of IFs WHILEs statements in side a function
    private int blockCount = 0;

    private int whileBlockCounter = 1;
    private int ifBlockCounter = 1;
    private int elseBlockCounter = 1;

    private boolean isBegFUNC = false;
    private boolean isEndFUNC = false;
    private boolean isBegWHILE = false;
    private boolean isEndWHILE = false;
    private boolean isBegIF = false;
    private boolean isEndIF = false;
    private boolean isBegELSE = false;
    private boolean isEndELSE = false;

    // This global variable is used to count number of elements (number of records)
    // in symbol table
    private int elementCount = 1;

    // This global variable is used to track current Symbol-Table-Name
    private String currentSymbolTableName = null;

    // Tracing ENTER and EXIT from a Symbol-Table-Block
    // --------------------------------------------------------------------------------- //
    // FUNCTION
    private boolean isInFUNCTION = false;

    // WHILE
    private boolean isInWHILE = false;

    // IF
    private boolean isInIF = false;

    // ELSE
    private boolean isInELSE = false;
    // --------------------------------------------------------------------------------- //


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterProgram(MicroGrammarParser.ProgramContext ctx)
    {
        String globalSTN = "Symbol table GLOBAL";
        currentSymbolTableName = globalSTN;

        MicroSymbolTable mstTMP = new MicroSymbolTable(globalSTN, 0);
        symbolTable.put(new Integer(elementCount), mstTMP);

        //System.out.printf("Symbol table GLOBAL\n");
        elementCount++;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitProgram(MicroGrammarParser.ProgramContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterId(MicroGrammarParser.IdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitId(MicroGrammarParser.IdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPgm_body(MicroGrammarParser.Pgm_bodyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPgm_body(MicroGrammarParser.Pgm_bodyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDecl(MicroGrammarParser.DeclContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDecl(MicroGrammarParser.DeclContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterString_decl(MicroGrammarParser.String_declContext ctx)
    {
        String strType = null;
        String strIdName = null;
        String strValue = null;

        // try-catch for STRING block declaration
        // ========================================================================================== //
        try
        {
            strType = ctx.STRING().toString();
            strIdName = ctx.id().IDENTIFIER().toString();
            strValue = ctx.str().STRINGLITERAL().toString();

            String name = strIdName;
            String type = strType;
            String value = strValue;

            MicroSymbolTable mstTMP = new MicroSymbolTable(name, type, value, currentSymbolTableName, 0);

            symbolTable.put(new Integer(elementCount), mstTMP);

            //System.out.printf("name %s type %s value %s\n", strIdName, strType, strValue);
            elementCount++;
        }
        catch (Exception e)
        {
            // Uncomment if you have to debug it
            //System.out.printf("[STRING] var-name is: %s\n", e.getMessage());
        }
        // ========================================================================================== //
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitString_decl(MicroGrammarParser.String_declContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStr(MicroGrammarParser.StrContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStr(MicroGrammarParser.StrContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVar_decl(MicroGrammarParser.Var_declContext ctx)
    {
        String type = null;
        String name[] = null;

        // try-catch for var-name *IS NOT FOR STRING*
        // ========================================================================================== //
        try
        {
            // Split-up var-names
            // 1: Remove spaces from the incoming string of var-names
            String str1 = ctx.id_list().getText().replaceAll("\\s+", "");

            // Check if we have more then one var-name
            // If more then 1, than we have multiple var-names
            if (str1.length() > 1)
            {
                // 2: Create String array from the splitted string
                name = str1.split(",");
            }
            else if (str1.length() == 1)
            {
                name = new String[1];
                name[0] = str1;
            }
        }
        catch (Exception e)
        {
            // Uncomment if you have to debug it
            //System.out.printf("var-name is: %s\n", e.getMessage());
        }
        // ========================================================================================== //

        // FLOAT
        // ========================================================================================== //
        if (type == null)
        {
            // try-catch for FLOAT
            try
            {
                type = ctx.var_type().FLOAT().toString();
            }
            catch (Exception e)
            {
                // Uncomment if you have to debug it
                //System.out.printf("FLOAT is: %s\n", e.getMessage());
            }
        }
        // ========================================================================================== //

        // INT
        // ========================================================================================== //
        if (type == null)
        {
            // try-catch for INT
            try
            {
                type = ctx.var_type().INT().toString();
            }
            catch (Exception e)
            {
                // Uncomment if you have to debug it
                //System.out.printf("INT is: %s\n", e.getMessage());
            }
        }
        // ========================================================================================== //

        // Print result *IS NOT FOR STRING*
        if (type != null && name != null)
        {
            for (int i = 0; i < name.length; i++)
            {
                MicroSymbolTable mstTMP = new MicroSymbolTable(name[i], type, currentSymbolTableName, 0);

                symbolTable.put(new Integer(elementCount), mstTMP);

                //System.out.printf("name %s type %s\n", name[i], type);
                elementCount++;
            }
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVar_decl(MicroGrammarParser.Var_declContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVar_type(MicroGrammarParser.Var_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVar_type(MicroGrammarParser.Var_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAny_type(MicroGrammarParser.Any_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAny_type(MicroGrammarParser.Any_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterId_list(MicroGrammarParser.Id_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitId_list(MicroGrammarParser.Id_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterId_tail(MicroGrammarParser.Id_tailContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitId_tail(MicroGrammarParser.Id_tailContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParam_decl_list(MicroGrammarParser.Param_decl_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParam_decl_list(MicroGrammarParser.Param_decl_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParam_decl(MicroGrammarParser.Param_declContext ctx)
    {
        String type = null;
        String name[] = null;

        // try-catch for var-name *IS NOT FOR STRING*
        // ========================================================================================== //
        try
        {
            // Split-up var-names
            // 1: Remove spaces from the incoming string of var-names
            String str1 = ctx.id().getText().replaceAll("\\s+", "");

            // Check if we have more then one var-name
            // If more then 1, than we have multiple var-names
            if (str1.length() > 1)
            {
                // 2: Create String array from the splitted string
                name = str1.split(",");
            }
            else if (str1.length() == 1)
            {
                name = new String[1];
                name[0] = str1;
            }
        }
        catch (Exception e)
        {
            // Uncomment if you have to debug it
            //System.out.printf("var-name is: %s\n", e.getMessage());
        }
        // ========================================================================================== //

        // FLOAT
        // ========================================================================================== //
        if (type == null)
        {
            // try-catch for FLOAT
            try
            {
                type = ctx.var_type().FLOAT().toString();
            }
            catch (Exception e)
            {
                // Uncomment if you have to debug it
                //System.out.printf("FLOAT is: %s\n", e.getMessage());
            }
        }
        // ========================================================================================== //

        // INT
        // ========================================================================================== //
        if (type == null)
        {
            // try-catch for INT
            try
            {
                type = ctx.var_type().INT().toString();
            }
            catch (Exception e)
            {
                // Uncomment if you have to debug it
                //System.out.printf("INT is: %s\n", e.getMessage());
            }
        }
        // ========================================================================================== //

        // Print result *IS NOT FOR STRING*
        if (type != null && name != null)
        {
            for (int i = 0; i < name.length; i++)
            {
                MicroSymbolTable mstTMP = new MicroSymbolTable(name[i], type, currentSymbolTableName, blockCount);
                symbolTable.put(new Integer(elementCount), mstTMP);

                //System.out.printf("name %s type %s\n", name[i], type);
                elementCount++;
            }
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParam_decl(MicroGrammarParser.Param_declContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParam_decl_tail(MicroGrammarParser.Param_decl_tailContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParam_decl_tail(MicroGrammarParser.Param_decl_tailContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunc_declarations(MicroGrammarParser.Func_declarationsContext ctx)
    {
        this.isInFUNCTION = true;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunc_declarations(MicroGrammarParser.Func_declarationsContext ctx)
    {
        this.isInFUNCTION = false;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunc_decl(MicroGrammarParser.Func_declContext ctx)
    {
        // ===================================================================== //
        blockCount++;

        //String func = ctx.FUNCTION().toString();
        //String funcType = ctx.any_type().VOID().toString();
        String funcName = ctx.id().IDENTIFIER().toString();

        String symbolTableName = "Symbol table " + funcName;
        currentSymbolTableName = symbolTableName;

        MicroSymbolTable mstTMP = new MicroSymbolTable(symbolTableName, blockCount);
        symbolTable.put(new Integer(elementCount), mstTMP);


        //System.out.printf("\nSymbol table %s\n", funcName);
        elementCount++;
        // ===================================================================== //
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunc_decl(MicroGrammarParser.Func_declContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunc_body(MicroGrammarParser.Func_bodyContext ctx)
    {
        this.isBegFUNC = true;

        this.isBegWHILE = false;
        this.isBegIF = false;
        this.isBegELSE = false;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunc_body(MicroGrammarParser.Func_bodyContext ctx)
    {
        this.isEndFUNC = true;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStmt_list(MicroGrammarParser.Stmt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStmt_list(MicroGrammarParser.Stmt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStmt(MicroGrammarParser.StmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStmt(MicroGrammarParser.StmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBase_stmt(MicroGrammarParser.Base_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBase_stmt(MicroGrammarParser.Base_stmtContext ctx) { }

    /**
     * This method is used to create statement object for current symbol-table.
     * FOR STEP 4
     * @param label
     * @param isCondition
     * @param statement
     */
    private void addExpression(String label, boolean isCondition, String statement, boolean isBeginningOfBlock)
    {
        // Building statement object for current symbol-table
        Statement statementObj = new Statement(currentSymbolTableName, label, isCondition, statement, isBeginningOfBlock);

        MicroSymbolTable mstTMP = new MicroSymbolTable(currentSymbolTableName, blockCount);
        mstTMP.setStatementObj(statementObj);

        symbolTable.put(new Integer(elementCount), mstTMP);

        elementCount++;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssign_stmt(MicroGrammarParser.Assign_stmtContext ctx)
    {
        // FOR STEP 4
        // ========================================================================================== //
        try
        {
            // symbol-table-block tracking
            if (isInIF && !isInELSE)
            {
                String label = "IF";

                // ---------------------------------- //
                String expression = ctx.assign_expr().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegIF)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInELSE && !isInIF)
            {
                String label = "ELSE";

                // ---------------------------------- //
                String expression = ctx.assign_expr().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegELSE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInIF && isInELSE)
            {
                String label = "ELSE";

                // ---------------------------------- //
                String expression = ctx.getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegELSE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInWHILE && !isInIF && !isInELSE)
            {
                String label = "WHILE";

                // ---------------------------------- //
                String expression = ctx.assign_expr().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegWHILE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInFUNCTION && !isInWHILE && !isInIF && !isInELSE)
            {
                String label = "MAIN";

                // ---------------------------------- //
                String expression = ctx.assign_expr().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegFUNC)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
        }
        catch (Exception e)
        {
            // Uncomment if you have to debug it
            //System.out.printf("var-name is: %s\n", e.getMessage());
        }
        // ========================================================================================== //
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssign_stmt(MicroGrammarParser.Assign_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssign_expr(MicroGrammarParser.Assign_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssign_expr(MicroGrammarParser.Assign_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRead_stmt(MicroGrammarParser.Read_stmtContext ctx)
    {
        // FOR STEP 4
        // ========================================================================================== //
        try
        {
            // Testing symbol-table-block tracking
            if (isInIF && !isInELSE)
            {
                String label = "IF-READ";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegIF)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInELSE && !isInIF)
            {
                String label = "ELSE-READ";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegELSE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInIF && isInELSE)
            {
                String label = "ELSE-READ";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegELSE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInWHILE && !isInIF && !isInELSE)
            {
                String label = "WHILE-READ";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegWHILE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInFUNCTION && !isInWHILE && !isInIF && !isInELSE)
            {
                String label = "MAIN-READ";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegFUNC)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
        }
        catch (Exception e)
        {
            // Uncomment if you have to debug it
            //System.out.printf("var-name is: %s\n", e.getMessage());
        }
        // ========================================================================================== //
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRead_stmt(MicroGrammarParser.Read_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWrite_stmt(MicroGrammarParser.Write_stmtContext ctx)
    {
        // FOR STEP 4
        // ========================================================================================== //
        try
        {
            // Testing symbol-table-block tracking
            if (isInIF && !isInELSE)
            {
                String label = "IF-WRITE";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegIF)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInELSE && !isInIF)
            {
                String label = "ELSE-WRITE";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegELSE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInIF && isInELSE)
            {
                String label = "ELSE-WRITE";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegELSE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInWHILE && !isInIF && !isInELSE)
            {
                String label = "WHILE-WRITE";
                //String label = currentSymbolTableName;

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegWHILE)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
            if (isInFUNCTION && !isInWHILE && !isInIF && !isInELSE)
            {
                String label = "MAIN-WRITE";

                // ---------------------------------- //
                String expression = ctx.id_list().getText();
                boolean isCondition = false;

                boolean tmp = false;
                if(isBegFUNC)
                {
                    tmp = true;
                }

                addExpression(label, isCondition, expression, tmp);
                // ---------------------------------- //
            }
        }
        catch (Exception e)
        {
            // Uncomment if you have to debug it
            //System.out.printf("var-name is: %s\n", e.getMessage());
        }
        // ========================================================================================== //
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWrite_stmt(MicroGrammarParser.Write_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterReturn_stmt(MicroGrammarParser.Return_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitReturn_stmt(MicroGrammarParser.Return_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpr(MicroGrammarParser.ExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpr(MicroGrammarParser.ExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpr_prefix(MicroGrammarParser.Expr_prefixContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpr_prefix(MicroGrammarParser.Expr_prefixContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFactor(MicroGrammarParser.FactorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFactor(MicroGrammarParser.FactorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFactor_prefix(MicroGrammarParser.Factor_prefixContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFactor_prefix(MicroGrammarParser.Factor_prefixContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPostfix_expr(MicroGrammarParser.Postfix_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPostfix_expr(MicroGrammarParser.Postfix_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCall_expr(MicroGrammarParser.Call_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCall_expr(MicroGrammarParser.Call_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpr_list(MicroGrammarParser.Expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpr_list(MicroGrammarParser.Expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpr_list_tail(MicroGrammarParser.Expr_list_tailContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpr_list_tail(MicroGrammarParser.Expr_list_tailContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPrimary(MicroGrammarParser.PrimaryContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrimary(MicroGrammarParser.PrimaryContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAddop(MicroGrammarParser.AddopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAddop(MicroGrammarParser.AddopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMulop(MicroGrammarParser.MulopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMulop(MicroGrammarParser.MulopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIf_stmt(MicroGrammarParser.If_stmtContext ctx)
    {
        this.isInIF = true;

        this.isBegIF = true;
        this.isBegELSE = true;
        this.isBegWHILE = false;
        this.isBegFUNC = false;

        String stmt = null;

        // try-catch for IF
        try
        {
            stmt = ctx.IF().toString();
        }
        catch (Exception e)
        {
            // Uncomment to debug
            //System.out.printf("func-stmt: %s\n", e.getMessage());
        }

        if (stmt != null)
        {
            blockCount++;
            String symbolTableName = "Symbol table BLOCK " + blockCount;
            currentSymbolTableName = symbolTableName;

            // FOR STEP 4
            // ---------------------------------------------------------------------------- //
            Statement statementObj = null;

            // Getting IF condition
            try
            {
                // Get condition
                String lable = stmt;
                String condition = ctx.cond().getText();
                boolean isCondition = true;
                boolean isBeginningOfBlock = true;

                // Building statement object for current symbol-table
                statementObj = new Statement(currentSymbolTableName ,lable, isCondition, condition, isBeginningOfBlock);
            }
            catch (Exception e)
            {
                // Uncomment if you have to debug it
                //System.out.printf("var-name is: %s\n", e.getMessage());
            }
            // ---------------------------------------------------------------------------- //

            MicroSymbolTable mstTMP = new MicroSymbolTable(symbolTableName, blockCount);
            mstTMP.setStatementObj(statementObj);

            symbolTable.put(new Integer(elementCount), mstTMP);

            //System.out.printf("\nSymbol table BLOCK %d\n", blockCount);
            //blockCount++;
            elementCount++;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIf_stmt(MicroGrammarParser.If_stmtContext ctx)
    {
        this.isInIF = false;

        this.isEndIF = true;

        this.isBegIF = false;
        this.isBegELSE = true;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterElse_part(MicroGrammarParser.Else_partContext ctx)
    {
        this.isInELSE = true;

        this.isBegELSE = true;
        this.isBegIF = false;
        this.isBegWHILE = false;
        this.isBegFUNC = false;

        String stmt = null;

        // try-catch for ELSE
        try
        {
            stmt = ctx.ELSE().toString();
        }
        catch (Exception e)
        {
            // Uncomment to debug
            //System.out.printf("func-stmt: %s\n", e.getMessage());
        }

        if (stmt != null)
        {
            blockCount++;
            String symbolTableName = "Symbol table BLOCK " + blockCount;
            currentSymbolTableName = symbolTableName;

            MicroSymbolTable mstTMP = new MicroSymbolTable(symbolTableName, blockCount);

            symbolTable.put(new Integer(elementCount), mstTMP);

            //System.out.printf("\nSymbol table BLOCK %d\n", blockCount);
            //blockCount++;
            elementCount++;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitElse_part(MicroGrammarParser.Else_partContext ctx)
    {
        this.isInELSE = false;

        this.isEndELSE = true;

        this.isBegELSE = false;
        this.isBegIF = false;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCond(MicroGrammarParser.CondContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCond(MicroGrammarParser.CondContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCompop(MicroGrammarParser.CompopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCompop(MicroGrammarParser.CompopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhile_stmt(MicroGrammarParser.While_stmtContext ctx)
    {
        this.isInWHILE = true;

        this.isBegWHILE = true;
        this.isBegIF = false;
        this.isBegELSE = false;
        this.isBegFUNC = false;

        String stmt = null;

        // try-catch for WHILE
        try
        {
            stmt = ctx.WHILE().toString();
        }
        catch (Exception e)
        {
            // Uncomment to debug
            //System.out.printf("func-stmt: %s\n", e.getMessage());
        }

        if (stmt != null)
        {
            blockCount++;
            String symbolTableName = "Symbol table BLOCK " + blockCount;
            currentSymbolTableName = symbolTableName;

            // FOR STEP 4
            // ---------------------------------------------------------------------------- //
            Statement statementObj = null;

            // Getting WHILE condition
            try
            {
                // Get condition
                String lable = stmt;
                String condition = ctx.cond().getText();
                boolean isCondition = true;
                boolean isBeginningOfBlock = true;

                // Building statement object for current symbol-table
                statementObj = new Statement(currentSymbolTableName, lable, isCondition, condition, isBeginningOfBlock);
            }
            catch (Exception e)
            {
                // Uncomment if you have to debug it
                //System.out.printf("var-name is: %s\n", e.getMessage());
            }
            // ---------------------------------------------------------------------------- //
            MicroSymbolTable mstTMP = new MicroSymbolTable(symbolTableName, blockCount);
            mstTMP.setStatementObj(statementObj);

            symbolTable.put(new Integer(elementCount), mstTMP);

            //System.out.printf("\nSymbol table BLOCK %d\n", blockCount);
            //blockCount++;
            elementCount++;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhile_stmt(MicroGrammarParser.While_stmtContext ctx)
    {
        this.isInWHILE = false;
        this.isEndWHILE = true;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEmpty(MicroGrammarParser.EmptyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEmpty(MicroGrammarParser.EmptyContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }

    public Map<Integer, MicroSymbolTable> getSymbolTable()
    {
        return this.symbolTable;
    }
}
