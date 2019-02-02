// Generated from C:/Users/alexm/Desktop/Programs/MSU_Classes/2019/Spring/Compilers_CSCI_468_001/labs/STEP1/Tokenizer/grammar\gl2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gl2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gl2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gl2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gl2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(gl2Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#pgm_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgm_body(gl2Parser.Pgm_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(gl2Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#string_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_decl(gl2Parser.String_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(gl2Parser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(gl2Parser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(gl2Parser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(gl2Parser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(gl2Parser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#id_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_tail(gl2Parser.Id_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#param_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_list(gl2Parser.Param_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(gl2Parser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#param_decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_tail(gl2Parser.Param_decl_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#func_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declarations(gl2Parser.Func_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(gl2Parser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(gl2Parser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(gl2Parser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(gl2Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#base_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_stmt(gl2Parser.Base_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(gl2Parser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(gl2Parser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(gl2Parser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(gl2Parser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(gl2Parser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(gl2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prefix(gl2Parser.Expr_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gl2Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#factor_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_prefix(gl2Parser.Factor_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#postfix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expr(gl2Parser.Postfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(gl2Parser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(gl2Parser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#expr_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_tail(gl2Parser.Expr_list_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(gl2Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(gl2Parser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(gl2Parser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(gl2Parser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(gl2Parser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(gl2Parser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompop(gl2Parser.CompopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(gl2Parser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gl2Parser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(gl2Parser.EmptyContext ctx);
}