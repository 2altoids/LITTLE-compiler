//Author: Olexandr Matveyev

// Define a grammar called little
grammar gl;

/* Program */
program:            KEYWORD id KEYWORD pgm_body KEYWORD;
id:                 IDENTIFIER;
pgm_body:           decl func_declarations;
decl:               string_decl decl | var_decl decl | empty;

/* Global String Declaration */
string_decl:        KEYWORD id ':=' str ';';
str:                STRINGLITERAL;

/* Variable Declaration */
var_decl:           var_type id_list ';';
var_type:           KEYWORD | KEYWORD;
any_type:           var_type | KEYWORD;
id_list:            id id_tail;
id_tail:            ',' id id_tail | empty;

/* Function Paramater List */
param_decl_list:    param_decl param_decl_tail | empty;
param_decl:         var_type id;
param_decl_tail:    ',' param_decl param_decl_tail | empty;

/* Function Declarations */
func_declarations:  func_decl func_declarations | empty;
func_decl:          KEYWORD any_type id '(' param_decl_list ')' KEYWORD func_body KEYWORD;
func_body:          decl stmt_list;

/* Statement List */
stmt_list:          stmt stmt_list | empty;
stmt:               base_stmt | if_stmt | while_stmt;
base_stmt:          assign_stmt | read_stmt | write_stmt | return_stmt;

/* Basic Statements */
assign_stmt:        assign_expr ';';
assign_expr:        id ':=' expr;
read_stmt:          KEYWORD '(' id_list ')' ';';
write_stmt:         KEYWORD '(' id_list ')' ';';
return_stmt:        KEYWORD expr ';';

/* Expressions */
expr:               expr_prefix factor;
expr_prefix:        expr_prefix factor addop | empty;
factor:             factor_prefix postfix_expr;
factor_prefix:      factor_prefix postfix_expr mulop | empty;
postfix_expr:       primary | call_expr;
call_expr:          id '(' expr_list ')';
expr_list:          expr expr_list_tail | empty;
expr_list_tail:     ',' expr expr_list_tail | empty;
primary:            '(' expr ')' | id | INTLITERAL | FLOATLITERAL;
addop:              '+' | '-';
mulop:              '*' | '/';

/* Complex Statements and Condition */
if_stmt:            KEYWORD '(' cond ')' decl stmt_list else_part KEYWORD;
else_part:          KEYWORD decl stmt_list | empty;
cond:               expr compop expr;
compop:             '<' | '>' | '=' | '!=' | '<=' | '>=';

/* While statements */
while_stmt:         KEYWORD '(' cond ')' decl stmt_list KEYWORD;

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