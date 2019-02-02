// Generated from C:/Users/alexm/Desktop/Programs/MSU_Classes/2019/Spring/Compilers_CSCI_468_001/labs/STEP1/Tokenizer/grammar\gl2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gl2Parser}.
 */
public interface gl2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gl2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gl2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gl2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(gl2Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(gl2Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(gl2Parser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(gl2Parser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(gl2Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(gl2Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(gl2Parser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(gl2Parser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(gl2Parser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(gl2Parser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(gl2Parser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(gl2Parser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(gl2Parser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(gl2Parser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(gl2Parser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(gl2Parser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(gl2Parser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(gl2Parser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(gl2Parser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(gl2Parser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(gl2Parser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(gl2Parser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(gl2Parser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(gl2Parser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(gl2Parser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(gl2Parser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(gl2Parser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(gl2Parser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(gl2Parser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(gl2Parser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(gl2Parser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(gl2Parser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(gl2Parser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(gl2Parser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(gl2Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(gl2Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(gl2Parser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(gl2Parser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(gl2Parser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(gl2Parser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(gl2Parser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(gl2Parser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(gl2Parser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(gl2Parser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(gl2Parser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(gl2Parser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(gl2Parser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(gl2Parser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gl2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gl2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(gl2Parser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(gl2Parser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gl2Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gl2Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(gl2Parser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(gl2Parser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(gl2Parser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(gl2Parser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(gl2Parser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(gl2Parser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(gl2Parser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(gl2Parser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(gl2Parser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(gl2Parser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(gl2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(gl2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(gl2Parser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(gl2Parser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(gl2Parser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(gl2Parser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(gl2Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(gl2Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(gl2Parser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(gl2Parser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(gl2Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(gl2Parser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(gl2Parser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(gl2Parser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(gl2Parser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(gl2Parser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gl2Parser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(gl2Parser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gl2Parser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(gl2Parser.EmptyContext ctx);
}