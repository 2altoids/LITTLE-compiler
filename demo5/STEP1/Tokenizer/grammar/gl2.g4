//Author: Olexandr Matveyev

// Define a grammar called little
grammar gl2;

/* Program */
program:            KEYWORD id KEYWORD pgm_body KEYWORD;
id:                 IDENTIFIER;
pgm_body:           decl func_declarations;
decl:               string_decl decl | var_decl decl | empty;

/* Global String Declaration */
string_decl:        KEYWORD id OPERATOR str OPERATOR;
str:                STRINGLITERAL;

/* Variable Declaration */
var_decl:           var_type id_list OPERATOR;
var_type:           KEYWORD | KEYWORD;
any_type:           var_type | KEYWORD;
id_list:            id id_tail;
id_tail:            OPERATOR id id_tail | empty;

/* Function Paramater List */
param_decl_list:    param_decl param_decl_tail | empty;
param_decl:         var_type id;
param_decl_tail:    OPERATOR param_decl param_decl_tail | empty;

/* Function Declarations */
func_declarations:  func_decl func_declarations | empty;
func_decl:          KEYWORD any_type id OPERATOR param_decl_list OPERATOR KEYWORD func_body KEYWORD;
func_body:          decl stmt_list;

/* Statement List */
stmt_list:          stmt stmt_list | empty;
stmt:               base_stmt | if_stmt | while_stmt;
base_stmt:          assign_stmt | read_stmt | write_stmt | return_stmt;

/* Basic Statements */
assign_stmt:        assign_expr OPERATOR;
assign_expr:        id OPERATOR expr;
read_stmt:          KEYWORD OPERATOR id_list OPERATOR OPERATOR;
write_stmt:         KEYWORD OPERATOR id_list OPERATOR OPERATOR;
return_stmt:        KEYWORD expr OPERATOR;

/* Expressions */
expr:               expr_prefix factor;
expr_prefix:        expr_prefix factor addop | empty;
factor:             factor_prefix postfix_expr;
factor_prefix:      factor_prefix postfix_expr mulop | empty;
postfix_expr:       primary | call_expr;
call_expr:          id OPERATOR expr_list OPERATOR;
expr_list:          expr expr_list_tail | empty;
expr_list_tail:     OPERATOR expr expr_list_tail | empty;
primary:            OPERATOR expr OPERATOR | id | INTLITERAL | FLOATLITERAL;
addop:              OPERATOR | OPERATOR;
mulop:              OPERATOR | OPERATOR;

/* Complex Statements and Condition */
if_stmt:            KEYWORD OPERATOR cond OPERATOR decl stmt_list else_part KEYWORD;
else_part:          KEYWORD decl stmt_list | empty;
cond:               expr compop expr;
compop:             OPERATOR | OPERATOR | OPERATOR | OPERATOR | OPERATOR | OPERATOR;

/* While statements */
while_stmt:         KEYWORD OPERATOR cond OPERATOR decl stmt_list KEYWORD;

/*Empty*/
empty:              ;

/*Lexer rules: Literals and keywords*/
KEYWORD:            PROGRAM
       |            BEGIN
       |            END
       |            FUNCTION
       |            READ
       |            WRITE
       |            IF
       |            ELSE
       |            ENDIF
       |            WHILE
       |            ENDWHILE
       |            CONTINUE
       |            BREAK
       |            RETURN
       |            INT
       |            VOID
       |            STRING
       |            FLOAT
       ;

PROGRAM:            'PROGRAM';
BEGIN:              'BEGIN';
END:                'END';
FUNCTION:           'FUNCTION';
READ:               'READ';
WRITE:              'WRITE';
IF:                 'IF';
ELSE:               'ELSE';
ENDIF:              'ENDIF';
WHILE:              'WHILE';
ENDWHILE:           'ENDWHILE';
CONTINUE:           'CONTINUE';
BREAK:              'BREAK';
RETURN:             'RETURN';

VOID:               'VOID';
INT:                'INT';
FLOAT:              'FLOAT';
STRING:             'STRING';

STRINGLITERAL:      '"' ~('"')* '"';
INTLITERAL:         [0-9]+;
FLOATLITERAL:       [0-9]+'.'[0-9]+
            |       '.'[0-9]+
            ;
IDENTIFIER:         [a-zA-Z][a-zA-Z0-9]*;
WHITESPACE:         [ \t\u000C\r\n]+ -> skip;

COMMENT:            ( '--' ~[\r\n]* ) -> skip;

OPERATOR:           ':='
        |           '+'
        |           '-'
        |           '*'
        |           '/'
        |           '='
        |           '!='
        |           '<'
        |           '>'
        |           '('
        |           ')'
        |           ';'
        |           ','
        |           '<='
        |           '>='
        ;