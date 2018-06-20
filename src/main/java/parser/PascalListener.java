// Generated from C:/Users/Mateusz/Desktop/Informatyka/Semestr VI/Kompilatory/Pascal_Compiler\Pascal.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(PascalParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(PascalParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PascalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PascalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PascalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PascalParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(PascalParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(PascalParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(PascalParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(PascalParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PascalParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PascalParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PascalParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PascalParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(PascalParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(PascalParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(PascalParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(PascalParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(PascalParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(PascalParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(PascalParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(PascalParser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(PascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(PascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(PascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(PascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(PascalParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(PascalParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PascalParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PascalParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(PascalParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(PascalParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(PascalParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(PascalParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(PascalParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(PascalParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PascalParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PascalParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(PascalParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(PascalParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(PascalParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(PascalParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PascalParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PascalParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(PascalParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(PascalParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(PascalParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(PascalParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(PascalParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(PascalParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(PascalParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(PascalParser.FinalValueContext ctx);
}