// Generated from test.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(testParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(testParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(testParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(testParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(testParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(testParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(testParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(testParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#paint}.
	 * @param ctx the parse tree
	 */
	void enterPaint(testParser.PaintContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#paint}.
	 * @param ctx the parse tree
	 */
	void exitPaint(testParser.PaintContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSave(testParser.SaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSave(testParser.SaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#brush_shape}.
	 * @param ctx the parse tree
	 */
	void enterBrush_shape(testParser.Brush_shapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#brush_shape}.
	 * @param ctx the parse tree
	 */
	void exitBrush_shape(testParser.Brush_shapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#brush_color}.
	 * @param ctx the parse tree
	 */
	void enterBrush_color(testParser.Brush_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#brush_color}.
	 * @param ctx the parse tree
	 */
	void exitBrush_color(testParser.Brush_colorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#brush_size}.
	 * @param ctx the parse tree
	 */
	void enterBrush_size(testParser.Brush_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#brush_size}.
	 * @param ctx the parse tree
	 */
	void exitBrush_size(testParser.Brush_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#linee}.
	 * @param ctx the parse tree
	 */
	void enterLinee(testParser.LineeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#linee}.
	 * @param ctx the parse tree
	 */
	void exitLinee(testParser.LineeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#circle}.
	 * @param ctx the parse tree
	 */
	void enterCircle(testParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#circle}.
	 * @param ctx the parse tree
	 */
	void exitCircle(testParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(testParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(testParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(testParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(testParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(testParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(testParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(testParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(testParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(testParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(testParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ife}.
	 * @param ctx the parse tree
	 */
	void enterIfe(testParser.IfeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ife}.
	 * @param ctx the parse tree
	 */
	void exitIfe(testParser.IfeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#loope}.
	 * @param ctx the parse tree
	 */
	void enterLoope(testParser.LoopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#loope}.
	 * @param ctx the parse tree
	 */
	void exitLoope(testParser.LoopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#whilee}.
	 * @param ctx the parse tree
	 */
	void enterWhilee(testParser.WhileeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#whilee}.
	 * @param ctx the parse tree
	 */
	void exitWhilee(testParser.WhileeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#elsee}.
	 * @param ctx the parse tree
	 */
	void enterElsee(testParser.ElseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#elsee}.
	 * @param ctx the parse tree
	 */
	void exitElsee(testParser.ElseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAritmetic_expression(testParser.Aritmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAritmetic_expression(testParser.Aritmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expression(testParser.Logic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expression(testParser.Logic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(testParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(testParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(testParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(testParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(testParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(testParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(testParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(testParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(testParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(testParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#f_call}.
	 * @param ctx the parse tree
	 */
	void enterF_call(testParser.F_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#f_call}.
	 * @param ctx the parse tree
	 */
	void exitF_call(testParser.F_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(testParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(testParser.CommentContext ctx);
}