// Generated from C:/Users/alexm/Desktop/Programs/MSU_Classes/2019/Spring/Compilers_CSCI_468_001/labs/STEP1/Tokenizer/grammar\little.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link littleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface littleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link littleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(littleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(littleParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#pgm_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgm_body(littleParser.Pgm_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(littleParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#string_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_decl(littleParser.String_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(littleParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(littleParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(littleParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(littleParser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(littleParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#id_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_tail(littleParser.Id_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#param_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_list(littleParser.Param_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(littleParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#param_decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_tail(littleParser.Param_decl_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#func_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declarations(littleParser.Func_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(littleParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(littleParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(littleParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(littleParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#base_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_stmt(littleParser.Base_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(littleParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(littleParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(littleParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(littleParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(littleParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(littleParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prefix(littleParser.Expr_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(littleParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#factor_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_prefix(littleParser.Factor_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#postfix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expr(littleParser.Postfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(littleParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(littleParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#expr_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_tail(littleParser.Expr_list_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(littleParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(littleParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(littleParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(littleParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(littleParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(littleParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompop(littleParser.CompopContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(littleParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link littleParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(littleParser.EmptyContext ctx);
}