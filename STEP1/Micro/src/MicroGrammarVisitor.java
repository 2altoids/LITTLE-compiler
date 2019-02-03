// Generated from C:/Users/alexm/Desktop/Programs/MSU_Classes/2019/Spring/Compilers_CSCI_468_001/labs/STEP1_Final/Micro/src\MicroGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MicroGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MicroGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MicroGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MicroGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#pgm_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgm_body(MicroGrammarParser.Pgm_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MicroGrammarParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#string_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_decl(MicroGrammarParser.String_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(MicroGrammarParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(MicroGrammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(MicroGrammarParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(MicroGrammarParser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(MicroGrammarParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#id_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_tail(MicroGrammarParser.Id_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#param_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_list(MicroGrammarParser.Param_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(MicroGrammarParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#param_decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_tail(MicroGrammarParser.Param_decl_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#func_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declarations(MicroGrammarParser.Func_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(MicroGrammarParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(MicroGrammarParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(MicroGrammarParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MicroGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#base_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_stmt(MicroGrammarParser.Base_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(MicroGrammarParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(MicroGrammarParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(MicroGrammarParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(MicroGrammarParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MicroGrammarParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MicroGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prefix(MicroGrammarParser.Expr_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MicroGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#factor_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_prefix(MicroGrammarParser.Factor_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#postfix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expr(MicroGrammarParser.Postfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(MicroGrammarParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(MicroGrammarParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#expr_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_tail(MicroGrammarParser.Expr_list_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MicroGrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(MicroGrammarParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(MicroGrammarParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MicroGrammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(MicroGrammarParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(MicroGrammarParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompop(MicroGrammarParser.CompopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(MicroGrammarParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroGrammarParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(MicroGrammarParser.EmptyContext ctx);
}