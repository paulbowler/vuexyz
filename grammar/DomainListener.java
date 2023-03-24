// Generated from Domain.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DomainParser}.
 */
public interface DomainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DomainParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(DomainParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomainParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(DomainParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomainParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(DomainParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomainParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(DomainParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomainParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(DomainParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomainParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(DomainParser.DomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomainParser#view}.
	 * @param ctx the parse tree
	 */
	void enterView(DomainParser.ViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomainParser#view}.
	 * @param ctx the parse tree
	 */
	void exitView(DomainParser.ViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomainParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DomainParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomainParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DomainParser.AttributeContext ctx);
}