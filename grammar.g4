grammar pascal;

program
   : programHeading block DOT
   ;

programHeading
   : PROGRAM identifier (LPAREN identifierList RPAREN)? SEMI
   ;

identifier
   : IDENT
   ;

block
   : (constantDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart | usesUnitsPart)* compoundStatement
   ;

usesUnitsPart
   : USES identifierList SEMI
   ;

constantDefinitionPart
   : CONST (constantDefinition SEMI)+
   ;

constantDefinition
   : identifier EQUAL constant
   ;

constant
   : unsignedNumber
   | sign unsignedNumber
   | identifier
   | sign identifier
   ;

unsignedNumber
   : unsignedInteger
   ;

unsignedInteger
   : NUM_INT
   ;

sign
   : PLUS
   | MINUS
   ;

typeDefinition
   : identifier EQUAL (type | functionType | procedureType)
   ;

functionType
   : FUNCTION (formalParameterList)? COLON resultType
   ;

procedureType
   : PROCEDURE (formalParameterList)?
   ;

type
   : simpleType
   ;

simpleType
   : scalarType
   | typeIdentifier
   
typeIdentifier
   : identifier
   | (CHAR | BOOLEAN | INTEGER)
   ;
      
   
variableDeclarationPart
   : VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON type
   ;

procedureAndFunctionDeclarationPart
   : procedureOrFunctionDeclaration SEMI
   ;

procedureOrFunctionDeclaration
   : procedureDeclaration
   | functionDeclaration
   ;

procedureDeclaration
   : PROCEDURE identifier (formalParameterList)? SEMI block
   ;

formalParameterList
   : LPAREN formalParameterSection (SEMI formalParameterSection)* RPAREN
   ;

formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | FUNCTION parameterGroup
   | PROCEDURE parameterGroup
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

constList
   : constant (COMMA constant)*
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON resultType SEMI block
   ;

resultType
   : typeIdentifier
   ;

statement
   : unlabelledStatement
   ;

unlabelledStatement
   : simpleStatement
   | structuredStatement
   ;

simpleStatement
   : assignmentStatement
   | procedureStatement
   | emptyStatement
   ;

assignmentStatement
   : variable ASSIGN expression
   ;

variable
   : (identifier) (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT identifier)*
   ;

expression
   : simpleExpression ((EQUAL | NOT_EQUAL | LT | LE | GE | GT | IN) simpleExpression)*
   ;

simpleExpression
   : term ((PLUS | MINUS | OR) term)*
   ;

term
   : signedFactor ((STAR | SLASH | DIV | MOD | AND) signedFactor)*
   ;

signedFactor
   : (PLUS | MINUS)? factor
   ;

factor
   : variable
   | LPAREN expression RPAREN
   | functionDesignator
   | unsignedConstant
   | set
   | NOT factor
   ;

unsignedConstant
   : unsignedNumber
   | NIL
   ;

functionDesignator
   : identifier LPAREN parameterList RPAREN
   ;

parameterList
   : actualParameter (COMMA actualParameter)*
   ;

set
   : LBRACK elementList RBRACK
   | LBRACK2 elementList RBRACK2
   ;

elementList
   : element (COMMA element)*
   |
   ;

element
   : expression (DOTDOT expression)?
   ;

procedureStatement
   : identifier (LPAREN parameterList RPAREN)?
   ;

actualParameter
   : expression
   ;

emptyStatement
   :
   ;

empty
   :/* empty */
   ;

structuredStatement
   : compoundStatement
   | conditionalStatement
   | repetetiveStatement
   ;

compoundStatement
   : BEGIN statements END
   ;

statements
   : statement (SEMI statement)*
   ;

conditionalStatement
   : ifStatement
   ;

ifStatement
   : IF expression THEN statement (: ELSE statement)?
   ;

repetetiveStatement
   : whileStatement
   | repeatStatement
   | forStatement
   ;

whileStatement
   : WHILE expression DO statement
   ;

repeatStatement
   : REPEAT statements UNTIL expression
   ;

forStatement
   : FOR identifier ASSIGN forList DO statement
   ;

forList
   : initialValue (TO | DOWNTO) finalValue
   ;

initialValue
   : expression
   ;

finalValue
   : expression
   ;

