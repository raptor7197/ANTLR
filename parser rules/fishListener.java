// Generated from fish.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fishParser}.
 */
public interface fishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fishParser#chat}.
	 * @param ctx the parse tree
	 */
	void enterChat(fishParser.ChatContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#chat}.
	 * @param ctx the parse tree
	 */
	void exitChat(fishParser.ChatContext ctx);
	/**
	 * Enter a parse tree produced by {@link fishParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(fishParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(fishParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link fishParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(fishParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(fishParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link fishParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(fishParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(fishParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link fishParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(fishParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(fishParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link fishParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void enterEmoticon(fishParser.EmoticonContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void exitEmoticon(fishParser.EmoticonContext ctx);
	/**
	 * Enter a parse tree produced by {@link fishParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(fishParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(fishParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link fishParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(fishParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(fishParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fishParser#mention}.
	 * @param ctx the parse tree
	 */
	void enterMention(fishParser.MentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fishParser#mention}.
	 * @param ctx the parse tree
	 */
	void exitMention(fishParser.MentionContext ctx);
}