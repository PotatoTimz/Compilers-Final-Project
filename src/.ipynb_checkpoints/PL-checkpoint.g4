grammar PL;

@header {
import backend.*;
}

@members {
    final Boolean TRUEBOOLEAN = true;
    final Boolean FALSEBOOLEAN = false;

    String removeQuotes(String text){
         text = text.substring(1, text.length() - 1);
         return text;
    }
    String addStrings(String text1, String text2){
        return text1+text2;
    }
    int toInt(String text) {
        return Integer.parseInt(text);
    }
    void display(int value) {
        System.out.println("> " + value);
    }
}

program returns [Expr expr] : 
        { List <Expr> statements = new ArrayList<Expr>(); }
        (statement { statements.add($statement.expr); }  )+
        EOF      { $expr = new Block (
                            statements
                        );}
            ;

statement returns [Expr expr]:
        assignment SEMICOLUMN { $expr = $assignment.expr; } |
        
        { List <Expr> output = new ArrayList<Expr>(); }
        print SEMICOLUMN { output.add($print.expr); }
                         { $expr = new Output(output); } |
        
        ifelse { $expr = $ifelse.expr; } |
        
        funcDeclare { $expr = $funcDeclare.expr; } |
        
        forLoop { $expr = $forLoop.expr; } |
        
        expression { $expr = $expression.value; } SEMICOLUMN
        ;

forLoop returns [Expr expr]:
        'for' '(' WORD 'in' NUMBER { String start = $NUMBER.text; } '..' NUMBER ')' funcBody
        { $expr = new ForLoop(
                        $WORD.text,
                        new IntLiteral(start),
                        new IntLiteral($NUMBER.text),
                        $funcBody.body
                        ); 
        }
        ;

ifelse returns [Expr expr]:
        'if(' expression ')' if=funcBody 
        {Expr ifBody = $funcBody.body;}
        'else' funcBody
        { $expr = new Ifelse(
                            $expression.value,
                            ifBody,
                            $funcBody.body
                            );
        }
        ;

funcDeclare returns [Expr expr]:
        'function ' funcName=WORD declareParameterName funcBody
        {$expr = new Declare(
                            $funcName.text,
                            $declareParameterName.parameters,
                            $funcBody.body
                            );
        }
        ;
        
funcInvoke returns [Expr expr]:
        funcName=WORD declareParameters
        { $expr = new Invoke( $funcName.text, $declareParameters.arguements); }
        ;

funcBody returns [Expr body]:
        { List <Expr> functionBody = new ArrayList<Expr>(); }
        '{'
            (statement { functionBody.add($statement.expr); } | 
             expression { functionBody.add($expression.value); } )+
        '}'
        { $body = new Block(functionBody); }
        ;

declareParameterName returns [List<String> parameters]:
        { List <String> parameter = new ArrayList<String>(); }
        (
        '(' WORD { parameter.add($WORD.text); } (', ' WORD { parameter.add($WORD.text); })* ')'|
         '()'
        )
        { $parameters = parameter; }
        ;

declareParameters returns [List<Expr> arguements]:
        { List <Expr> arguement = new ArrayList<Expr>(); }
        (
        '(' expression { arguement.add($expression.value); } (', ' expression { arguement.add($expression.value); })* ')' |
        '()'
        )
        { $arguements = arguement; }
        ;

assignment returns [Expr expr]:
        WORD EQUAL expression { $expr = new Assign($WORD.text, $expression.value); }
        |
        { Expr val; }
        name=WORD'[' expression '] = ' (WORDQUOTE { val = new StringLiteral(removeQuotes($WORDQUOTE.text)); }| 
                                         NUMBER { val = new IntLiteral($NUMBER.text); })
        { $expr = new ReassignList($expression, $name.text, val); }
        |
        { Expr val; 
          String front = ""; }
        name=WORD '.add(' (WORDQUOTE { val = new StringLiteral(removeQuotes($WORDQUOTE.text)); } | 
                           NUMBER { val = new IntLiteral($NUMBER.text); } )
                          ', ' (index=NUMBER | 
                                toggle='front'{ front = $toggle.text; } | 
                                toggle='back' { front = $toggle.text; })
                          ')'
        { 
            if(front == ""){
                $expr = new ListAddAt(toInt($index.text), $name.text, val);
            }
            else if (front.equals("front")){
                $expr = new ListAddFrontBack(TRUEBOOLEAN, $name.text, val);
            }
            else{
                $expr = new ListAddFrontBack(FALSEBOOLEAN, $name.text, val);
            }
        }
        ;

print returns [Expr expr]:
        'print(' expression ')'{ $expr = $expression.value; }
        ;
        
expression returns [Expr value]:
        '(' expression ')' { $value = $expression.value; }
        |
        x=expression ' + ' y=expression { $value = new Arith(
                                                            Operator.ADD,
                                                            $x.value,
                                                            $y.value
                                                          );
                                       }
        |
        x=expression (' - ' | '-') y=expression { $value = new Arith(
                                                            Operator.SUB,
                                                            $x.value,
                                                            $y.value
                                                          );
                                       }
        |
        x=expression ' * ' y=expression { $value = new Arith(
                                                            Operator.MUL,
                                                            $x.value,
                                                            $y.value
                                                          );
                                       }
        |
        x=expression ' / ' y=expression { $value = new Arith(
                                                            Operator.DIV,
                                                            $x.value,
                                                            $y.value
                                                          );
                                       }
        |
        x=expression ' ++ ' y=expression { $value = new Arith(
                                                            Operator.ADD,
                                                            $x.value,
                                                            $y.value
                                                          );
                                       }
        |
        x=expression ' > ' y=expression { $value = new Cmp(
                                                            CmpOperators.GT,
                                                            $x.value,
                                                            $y.value
                                                        );
                                        }
        |
        x=expression ' == ' y=expression { $value = new Cmp(
                                                            CmpOperators.EQ,
                                                            $x.value,
                                                            $y.value
                                                        );
                                        }
        |
        x=expression ' < ' y=expression { $value = new Cmp(
                                                            CmpOperators.LT,
                                                            $x.value,
                                                            $y.value
                                                        );
                                        }
        |
        listName=WORD'.map(' funcName=WORD declareParameters ')'
        { $value = new MapList($funcName.text, $listName.text, $declareParameters.arguements); }
        |
        'max(' expression ')' { $value = new MaxList($expression.value); }
        |
        'min(' expression ')' { $value = new MinList($expression.value); }
        |
        'sum(' expression ')' { $value = new SumList($expression.value); }
        |
        'avg(' expression ')' { $value = new AverageList($expression.value); }
        |
        'size(' expression ')' { $value = new CountList($expression.value); }
        |
        listString { $value = new ListStringLiteral($listString.group); }
        |
        listInt { $value = new ListIntLiteral($listInt.group); }
        |
        WORD'['expression']' { $value = new DerefList($WORD.text, ($expression.value)); }
        |
        funcInvoke { $value = $funcInvoke.expr; }
        |
        NUMBER { $value = new IntLiteral($NUMBER.text); }
        |
        WORD   { $value = new Deref($WORD.text); }
        |
        WORDQUOTE { $value = new StringLiteral(removeQuotes($WORDQUOTE.text)); } 
        ;

listString returns [List<String> group]:
        { List <String> arrayList = new ArrayList<String>(); }
        '[' WORDQUOTE { arrayList.add(removeQuotes($WORDQUOTE.text)); } (', ' WORDQUOTE { arrayList.add(removeQuotes($WORDQUOTE.text)); })* ']'
        { $group = arrayList; }
        ;

listInt returns [List<Integer> group]:
        { List <Integer> arrayList = new ArrayList<Integer>(); }
        '[' NUMBER { arrayList.add(toInt($NUMBER.text)); } (', ' NUMBER { arrayList.add(toInt($NUMBER.text)); })* ']'
        { $group = arrayList; }
        ;

NUMBER : DIGIT+('.'DIGIT+)?;
WORDQUOTE: '"' ~('"' | '\r' | '\n' )* '"';
WORD : LETTER+;
EQUAL : ' = ';
SEMICOLUMN : ';';
OP : '+' | '*' ;

fragment NEWLINE   : '\r' '\n' | '\n' | '\r';
WHITESPACE : [ \t\r\n] -> skip;
fragment LETTER : ('A' .. 'Z') | ('a' .. 'z') | '_';
fragment DIGIT : ('0' .. '9');
