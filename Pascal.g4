grammar Pascal;

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
   : unsignedInteger
   | sign unsignedInteger
   | identifier
   | sign identifier
   ;

unsignedInteger
   : NUM_INT
   ;

sign
   : PLUS
   | MINUS
   ;

type
   : scalarType
   | typeIdentifier
   ;

scalarType
    : LPAREN identifierList RPAREN
    ;

typeIdentifier
   : identifier
   | (CHAR | BOOLEAN | INTEGER )
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

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON typeIdentifier SEMI block
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
   : (identifier) (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2)*
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
   : unsignedInteger
   | NIL
   ;

functionDesignator
   : identifier LPAREN parameterList RPAREN
   ;

parameterList
   : expression (COMMA expression)*
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

emptyStatement
   :
   ;

structuredStatement
   : compoundStatement
   | ifStatement
   | repetetiveStatement
   ;

compoundStatement
   : BEGIN statements END
   ;

statements
   : unlabelledStatement (SEMI unlabelledStatement)*
   ;

ifStatement
   : IF expression THEN unlabelledStatement (: ELSE unlabelledStatement)?
   ;

repetetiveStatement
   : whileStatement
   | repeatStatement
   | forStatement
   ;

whileStatement
   : WHILE expression DO unlabelledStatement
   ;

repeatStatement
   : REPEAT statements UNTIL expression
   ;

forStatement
   : FOR identifier ASSIGN forList DO unlabelledStatement
   ;

forList
   : expression (TO | DOWNTO) expression
   ;


   
fragment A
   : ('a' | 'A')
   ;


fragment B
   : ('b' | 'B')
   ;


fragment C
   : ('c' | 'C')
   ;


fragment D
   : ('d' | 'D')
   ;


fragment E
   : ('e' | 'E')
   ;


fragment F
   : ('f' | 'F')
   ;


fragment G
   : ('g' | 'G')
   ;


fragment H
   : ('h' | 'H')
   ;


fragment I
   : ('i' | 'I')
   ;


fragment J
   : ('j' | 'J')
   ;


fragment K
   : ('k' | 'K')
   ;


fragment L
   : ('l' | 'L')
   ;


fragment M
   : ('m' | 'M')
   ;


fragment N
   : ('n' | 'N')
   ;


fragment O
   : ('o' | 'O')
   ;


fragment P
   : ('p' | 'P')
   ;


fragment Q
   : ('q' | 'Q')
   ;


fragment R
   : ('r' | 'R')
   ;


fragment S
   : ('s' | 'S')
   ;


fragment T
   : ('t' | 'T')
   ;


fragment U
   : ('u' | 'U')
   ;


fragment V
   : ('v' | 'V')
   ;


fragment W
   : ('w' | 'W')
   ;


fragment X
   : ('x' | 'X')
   ;


fragment Y
   : ('y' | 'Y')
   ;


fragment Z
   : ('z' | 'Z')
   ;


AND
   : A N D
   ;


BEGIN
   : B E G I N
   ;


BOOLEAN
   : B O O L E A N
   ;


CHAR
   : C H A R
   ;


CONST
   : C O N S T
   ;


DIV
   : D I V
   ;


DO
   : D O
   ;


DOWNTO
   : D O W N T O
   ;


ELSE
   : E L S E
   ;


END
   : E N D
   ;


FOR
   : F O R
   ;


FUNCTION
   : F U N C T I O N
   ;


IF
   : I F
   ;


IN
   : I N
   ;


INTEGER
   : I N T E G E R
   ;


MOD
   : M O D
   ;


NIL
   : N I L
   ;


NOT
   : N O T
   ;

   
OR
   : O R
   ;


PROCEDURE
   : P R O C E D U R E
   ;


PROGRAM
   : P R O G R A M
   ;

   
REPEAT
   : R E P E A T
   ;


THEN
   : T H E N
   ;


TO
   : T O
   ;


UNTIL
   : U N T I L
   ;


VAR
   : V A R
   ;


WHILE
   : W H I L E
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


STAR
   : '*'
   ;


SLASH
   : '/'
   ;


ASSIGN
   : ':='
   ;


COMMA
   : ','
   ;


SEMI
   : ';'
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


NOT_EQUAL
   : '<>'
   ;


LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


LBRACK
   : '['
   ;


LBRACK2
   : '(.'
   ;


RBRACK
   : ']'
   ;


RBRACK2
   : '.)'
   ;


DOT
   : '.'
   ;

   
DOTDOT
   : '..'
   ;
   
   
LCURLY
   : '{'
   ;


RCURLY
   : '}'
   ;


USES
   : U S E S
   ;


WS
   : [ \t\r\n] -> skip
   ;


COMMENT_1
   : '(*' .*? '*)' -> skip
   ;


COMMENT_2
   : '{' .*? '}' -> skip
   ;


IDENT
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;


NUM_INT
   : ('0' .. '9') + 
   ;