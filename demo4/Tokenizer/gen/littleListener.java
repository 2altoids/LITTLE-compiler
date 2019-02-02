// Generated from C:/Users/alexm/Desktop/Programs/MSU_Classes/2019/Spring/Compilers_CSCI_468_001/labs/STEP1/Tokenizer/grammar\little.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link littleParser}.
 */
public interface littleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link littleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(littleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(littleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(littleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(littleParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(littleParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(littleParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(littleParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(littleParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(littleParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(littleParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(littleParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(littleParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(littleParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(littleParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(littleParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(littleParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(littleParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(littleParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(littleParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(littleParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(littleParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(littleParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(littleParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(littleParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(littleParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(littleParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(littleParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(littleParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(littleParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(littleParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(littleParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(littleParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(littleParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(littleParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(littleParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(littleParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(littleParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(littleParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(littleParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(littleParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(littleParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(littleParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(littleParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(littleParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(littleParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(littleParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(littleParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(littleParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(littleParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(littleParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(littleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(littleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(littleParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(littleParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(littleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(littleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(littleParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(littleParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(littleParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(littleParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(littleParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(littleParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(littleParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(littleParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(littleParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(littleParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(littleParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(littleParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(littleParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(littleParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(littleParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(littleParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(littleParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(littleParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(littleParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(littleParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(littleParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(littleParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(littleParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(littleParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(littleParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(littleParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(littleParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(littleParser.EmptyContext ctx);
}