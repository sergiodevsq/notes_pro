/*
++  Pré- ou pós-incremento D 1 lval→num
--  Pré- ou pós-decremento D 1 lval→num
-   Nega o número D 1 num→num
+   Converte para número D 1 num→num
~   Inverte bits D 1 int→int
!   Inverte valor booleano D 1 bool→bool
*/

/*
delete      Remove uma propriedade D 1 lval→bool
typeof      Determina o tipo de operando D 1 qualquer→str
void        Retorna valor indefinido D 1 qualquer→ιndef
*, /, %     Multiplica, divide, resto E 2 num,num→num
+, -        Soma, subtrai E 2 num,num→num
+           Concatena strings E 2 str,str→str
<<          Desloca para a esquerda E 2 int,int→int
>>          Desloca para a direita com extensão de sinal E 2 int,int→int
>>>         Desloca para a direita com extensão zero E 2 int,int→int
<, <=,>, >= Compara em ordem numérica E 2 num,num→bool
<, <=,>, >= Compara em ordem alfabética E 2 str,str→bool instanceof 
            Testa classe de objeto E 2 obj,fun→bool
            in Testa se a propriedade existe E 2 str,obj→bool
==          Testa a igualdade E 2 qualquer,qualquer→bool
!=          Testa a desigualdade E 2 qualquer,qualquer→bool
===         Testa a igualdade restrita E 2 qualquer,qualquer→bool
!==         Testa a desigualdade restrita E 2 qualquer,qualquer→bool
&           Calcula E bit a bit E 2 int,int→int
^           Calcula XOR bit a bit E 2 int,int→int
|           Calcula OU bit a bit E 2 int,int→int
&&          Calcula E lógico E 2 qualquer,qualquer→qualquer
||          Calcula OU lógico E 2 qualquer,qualquer→qualquer
?:          Escolhe 2o ou 3o operando D 3 bool,qualquer,qualquer→qualquer
=           Atribui a uma variável ou propriedade D 2 lval,qualquer→qualquer
*=, /=, %=, +=, Opera e atribui D 2 lval,qualquer→qualquer
                Descarta 1o operando, retorna o segundo E 2 qualquer,qualquer→qualquer
-=, &=, ^=, |=, <<=, >>=, >>>=

*/

// OPERADOR IN
var data = [7,8,9];
console.log("0" in data);
console.log(1 in data);
console.log(3 in data);

var point = { x:1, y:1 };
console.log("x" in point);

// OPERADOR INSTANCEOF
var d = new Date();

console.log(d instanceof Date);
console.log(d instanceof Object);
console.log(d instanceof Number);
var a = [1, 2, 3];
console.log(a instanceof Array);
console.log(a instanceof Object);
console.log(a instanceof RegExp);


// OPERADOR DELETE
var o = { x: 1, y: 2};
delete o.x;
console.log("x" in o);
console.log(o);
