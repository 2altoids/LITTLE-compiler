// Generated from C:/Users/alexm/Desktop/Programs/MSU_Classes/2019/Spring/Compilers_CSCI_468_001/labs/STEP1_Final/Micro/src\MicroGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MicroGrammarParser}.
 */
public interface MicroGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MicroGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MicroGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MicroGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MicroGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(MicroGrammarParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(MicroGrammarParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MicroGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MicroGrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(MicroGrammarParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(MicroGrammarParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(MicroGrammarParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(MicroGrammarParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(MicroGrammarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(MicroGrammarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(MicroGrammarParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(MicroGrammarParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(MicroGrammarParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(MicroGrammarParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(MicroGrammarParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(MicroGrammarParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(MicroGrammarParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(MicroGrammarParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(MicroGrammarParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(MicroGrammarParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(MicroGrammarParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(MicroGrammarParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(MicroGrammarParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(MicroGrammarParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(MicroGrammarParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(MicroGrammarParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(MicroGrammarParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(MicroGrammarParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(MicroGrammarParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(MicroGrammarParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(MicroGrammarParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(MicroGrammarParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MicroGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MicroGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(MicroGrammarParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(MicroGrammarParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(MicroGrammarParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(MicroGrammarParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(MicroGrammarParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(MicroGrammarParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(MicroGrammarParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(MicroGrammarParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(MicroGrammarParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(MicroGrammarParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MicroGrammarParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MicroGrammarParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MicroGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MicroGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(MicroGrammarParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(MicroGrammarParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MicroGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MicroGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(MicroGrammarParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(MicroGrammarParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(MicroGrammarParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(MicroGrammarParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(MicroGrammarParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(MicroGrammarParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(MicroGrammarParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(MicroGrammarParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(MicroGrammarParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(MicroGrammarParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MicroGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MicroGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(MicroGrammarParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(MicroGrammarParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(MicroGrammarParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(MicroGrammarParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MicroGrammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MicroGrammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(MicroGrammarParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(MicroGrammarParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(MicroGrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(MicroGrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(MicroGrammarParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(MicroGrammarParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(MicroGrammarParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(MicroGrammarParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroGrammarParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(MicroGrammarParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroGrammarParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(MicroGrammarParser.EmptyContext ctx);
}