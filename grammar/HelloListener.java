// Generated from Hello.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link HelloParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(HelloParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(HelloParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#paint}.
	 * @param ctx the parse tree
	 */
	void enterPaint(HelloParser.PaintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#paint}.
	 * @param ctx the parse tree
	 */
	void exitPaint(HelloParser.PaintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#linee}.
	 * @param ctx the parse tree
	 */
	void enterLinee(HelloParser.LineeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#linee}.
	 * @param ctx the parse tree
	 */
	void exitLinee(HelloParser.LineeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSave(HelloParser.SaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSave(HelloParser.SaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#brush_shape}.
	 * @param ctx the parse tree
	 */
	void enterBrush_shape(HelloParser.Brush_shapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#brush_shape}.
	 * @param ctx the parse tree
	 */
	void exitBrush_shape(HelloParser.Brush_shapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#brush_color}.
	 * @param ctx the parse tree
	 */
	void enterBrush_color(HelloParser.Brush_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#brush_color}.
	 * @param ctx the parse tree
	 */
	void exitBrush_color(HelloParser.Brush_colorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#brush_size}.
	 * @param ctx the parse tree
	 */
	void enterBrush_size(HelloParser.Brush_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#brush_size}.
	 * @param ctx the parse tree
	 */
	void exitBrush_size(HelloParser.Brush_sizeContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HelloParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HelloParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(HelloParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(HelloParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(HelloParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(HelloParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(HelloParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(HelloParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAritmetic_expression(HelloParser.Aritmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAritmetic_expression(HelloParser.Aritmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expression(HelloParser.Logic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expression(HelloParser.Logic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HelloParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HelloParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(HelloParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(HelloParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HelloParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HelloParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HelloParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HelloParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(HelloParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(HelloParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HelloParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HelloParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ife}.
	 * @param ctx the parse tree
	 */
	void enterIfe(HelloParser.IfeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ife}.
	 * @param ctx the parse tree
	 */
	void exitIfe(HelloParser.IfeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#loope}.
	 * @param ctx the parse tree
	 */
	void enterLoope(HelloParser.LoopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#loope}.
	 * @param ctx the parse tree
	 */
	void exitLoope(HelloParser.LoopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whilee}.
	 * @param ctx the parse tree
	 */
	void enterWhilee(HelloParser.WhileeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whilee}.
	 * @param ctx the parse tree
	 */
	void exitWhilee(HelloParser.WhileeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#elsee}.
	 * @param ctx the parse tree
	 */
	void enterElsee(HelloParser.ElseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#elsee}.
	 * @param ctx the parse tree
	 */
	void exitElsee(HelloParser.ElseeContext ctx);
}