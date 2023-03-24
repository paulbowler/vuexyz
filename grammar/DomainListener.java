// Generated from Domain.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DomainParser}.
 */
public interface DomainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DomainParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(DomainParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomainParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(DomainParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomainParser#db_table}.
	 * @param ctx the parse tree
	 */
	void enterDb_table(DomainParser.Db_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomainParser#db_table}.
	 * @param ctx the parse tree
	 */
	void exitDb_table(DomainParser.Db_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomainParser#db_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDb_attribute(DomainParser.Db_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomainParser#db_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDb_attribute(DomainParser.Db_attributeContext ctx);
}