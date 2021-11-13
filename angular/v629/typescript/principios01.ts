// No TypeScript, os tipos são inferidos de forma implícita, mas também podemos explicitar o tipo. 
// Por exemplo, no código abaixo explicitamos que o tipo da variável numeroQualquer é do tipo number.

let numeroQualquer: number;
let valor = 10.5;

console.log(valor);


// Os tipos mais utilizados no TypeScript são:
/*
    Number
        É para todo e qualquer tipo de número, seja ele ponto flutuante ou inteiro.

    String
        Representa uma string costumeiramente conhecida em outras linguagens de programação.

    Boolean
        Representa um valor booleano: true ou false.

    Any
        A tradução de Any é qualquer e, como sua tradução sugere, é um tipo que pode ser modificado para qualquer 
        outro tipo presente na linguagem, seja string, number, boolean ou qualquer outra coisa.

    Array
        Representa o tipo Array dentro da linguagem. É válido informar que podemos criar arrays de duas formas dentro do TypeScript.

        let list: number[ ] = [2, 3, 5, 7];
        var list: Array<number> = [2, 3, 5, 7, 11]
        let array: [string, number];
        x = [“Hello”, 10];  // Inicialização

    num
        Assim como em outras linguagens, enum é um tipo que permite declarar um conjunto valores nomeados e constantes pré-definidos.

        enum Cor { VERMELHO, VERDE, AZUL}
        let cor: Cor = Cor.Azul;

    Void
        O tipo void é visto como um tipo de retorno de funções que não retornam valor nenhum, geralmente chamadas de procedimentos.

        function minhaFuncao(): void {
            console.log(“Minha Função”);
        }    

        

*/






