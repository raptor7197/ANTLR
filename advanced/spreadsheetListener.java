// Generated from spreadsheet.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link spreadsheetParser}.
 */
public interface spreadsheetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link spreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(spreadsheetParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link spreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(spreadsheetParser.ExpressionContext ctx);
}