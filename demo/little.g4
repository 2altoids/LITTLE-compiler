// Define a grammar called little
grammar little;

/* The start of program */
program:    'PROGRAM' id 'BEGIN' WS pgm_body WS 'END';
id:         WS IDENTIFIER WS;
pgm_body:   expr
        |   WS
        ;

//Test
/*============================================================*/
expr:       '(' expr+ ')' ENDS
    |       ALHA
    |       WS
    ;

IDENTIFIER: [a-z]+;
ALHA:       [a-zA-Z0-9]*;
ENDS:       ';';
WS:         [ \n\t]+;
/*============================================================*/



