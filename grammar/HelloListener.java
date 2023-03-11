// Generated from .\Hello.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HelloParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HelloParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(HelloParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(HelloParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(HelloParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(HelloParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(HelloParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(HelloParser.ColorContext ctx);
}