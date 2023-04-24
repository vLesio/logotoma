// Generated from LogoToma.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoTomaParser}.
 */
public interface LogoTomaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LogoTomaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LogoTomaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LogoTomaParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LogoTomaParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LogoTomaParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LogoTomaParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LogoTomaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LogoTomaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(LogoTomaParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(LogoTomaParser.EngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#wheel}.
	 * @param ctx the parse tree
	 */
	void enterWheel(LogoTomaParser.WheelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#wheel}.
	 * @param ctx the parse tree
	 */
	void exitWheel(LogoTomaParser.WheelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#spray}.
	 * @param ctx the parse tree
	 */
	void enterSpray(LogoTomaParser.SprayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#spray}.
	 * @param ctx the parse tree
	 */
	void exitSpray(LogoTomaParser.SprayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#spray_color}.
	 * @param ctx the parse tree
	 */
	void enterSpray_color(LogoTomaParser.Spray_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#spray_color}.
	 * @param ctx the parse tree
	 */
	void exitSpray_color(LogoTomaParser.Spray_colorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#spray_size}.
	 * @param ctx the parse tree
	 */
	void enterSpray_size(LogoTomaParser.Spray_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#spray_size}.
	 * @param ctx the parse tree
	 */
	void exitSpray_size(LogoTomaParser.Spray_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#sleep}.
	 * @param ctx the parse tree
	 */
	void enterSleep(LogoTomaParser.SleepContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#sleep}.
	 * @param ctx the parse tree
	 */
	void exitSleep(LogoTomaParser.SleepContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(LogoTomaParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(LogoTomaParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(LogoTomaParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(LogoTomaParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LogoTomaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LogoTomaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSave(LogoTomaParser.SaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSave(LogoTomaParser.SaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(LogoTomaParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(LogoTomaParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(LogoTomaParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(LogoTomaParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#loope}.
	 * @param ctx the parse tree
	 */
	void enterLoope(LogoTomaParser.LoopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#loope}.
	 * @param ctx the parse tree
	 */
	void exitLoope(LogoTomaParser.LoopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#whilee}.
	 * @param ctx the parse tree
	 */
	void enterWhilee(LogoTomaParser.WhileeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#whilee}.
	 * @param ctx the parse tree
	 */
	void exitWhilee(LogoTomaParser.WhileeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#ife}.
	 * @param ctx the parse tree
	 */
	void enterIfe(LogoTomaParser.IfeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#ife}.
	 * @param ctx the parse tree
	 */
	void exitIfe(LogoTomaParser.IfeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#elsee}.
	 * @param ctx the parse tree
	 */
	void enterElsee(LogoTomaParser.ElseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#elsee}.
	 * @param ctx the parse tree
	 */
	void exitElsee(LogoTomaParser.ElseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(LogoTomaParser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(LogoTomaParser.SignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(LogoTomaParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(LogoTomaParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LogoTomaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LogoTomaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#atomicLogicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicLogicExpression(LogoTomaParser.AtomicLogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#atomicLogicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicLogicExpression(LogoTomaParser.AtomicLogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(LogoTomaParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(LogoTomaParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expression(LogoTomaParser.Logic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expression(LogoTomaParser.Logic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LogoTomaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LogoTomaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LogoTomaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LogoTomaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LogoTomaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LogoTomaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#f_call}.
	 * @param ctx the parse tree
	 */
	void enterF_call(LogoTomaParser.F_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#f_call}.
	 * @param ctx the parse tree
	 */
	void exitF_call(LogoTomaParser.F_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(LogoTomaParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(LogoTomaParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LogoTomaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LogoTomaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(LogoTomaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(LogoTomaParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#floate}.
	 * @param ctx the parse tree
	 */
	void enterFloate(LogoTomaParser.FloateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#floate}.
	 * @param ctx the parse tree
	 */
	void exitFloate(LogoTomaParser.FloateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(LogoTomaParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(LogoTomaParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTomaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LogoTomaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTomaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LogoTomaParser.StringContext ctx);
}