// Generated from d:/Proyectos/ANTLR y C#/Calculadora/Calculadora.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculadoraParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculadoraParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalculadoraParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalculadoraParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalculadoraParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalculadoraParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDIV(CalculadoraParser.DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDIV(CalculadoraParser.DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADD(CalculadoraParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADD(CalculadoraParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMOD(CalculadoraParser.MODContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMOD(CalculadoraParser.MODContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMUL(CalculadoraParser.MULContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMUL(CalculadoraParser.MULContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParents(CalculadoraParser.ParentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParents(CalculadoraParser.ParentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Oprand}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOprand(CalculadoraParser.OprandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Oprand}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOprand(CalculadoraParser.OprandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMINUS(CalculadoraParser.MINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link CalculadoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMINUS(CalculadoraParser.MINUSContext ctx);
}