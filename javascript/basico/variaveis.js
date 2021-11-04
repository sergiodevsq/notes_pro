// DECLARAÇÃO DE VARIÁVEIS
var nome = "Teste";
let endereco = "Teste de endereço";
idade = 34;
preco = 23.12;
pessoa = {"nome" : "fulano", "idade": 22, "salario": 3000.00};
dias_semana = ["SEG", "TER", "QUA", "QUI", "SEX", "SAB", "DOM"];
x = true;
y = null;
z = undefined;
function soma(a, b){
    return a + b;
}

console.log(nome);
console.log(endereco);
console.log(idade);
console.log(preco);
console.log(pessoa);
console.log(dias_semana);
console.log(x);
console.log(y);
console.log(z);

// VERIFICA O TIPO 
console.log(typeof nome);
console.log(typeof endereco);
console.log(typeof idade);
console.log(typeof preco);
console.log(typeof pessoa);
console.log(typeof dias_semana);
console.log(typeof x);
console.log(typeof y);
console.log(typeof z);
console.log(typeof soma(1, 2));
console.log("café" === "caf\u00e9");
console.log("caf\u00e9");

// CONSTANTES
const PI = 3.14159;
console.log(PI);
