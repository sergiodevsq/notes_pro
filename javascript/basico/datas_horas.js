var somente_dia = new Date(2021, 0, 1);
var dia_hora = new Date(2021, 0, 1, 17, 10, 30);

var agora = new Date();
var diferenca = agora - somente_dia;


console.log(somente_dia);
console.log(dia_hora);
console.log(agora);
console.log(diferenca);


console.log(agora.getFullYear());
console.log(agora.getMonth());
console.log(agora.getDate());
console.log(agora.getDay());
console.log(agora.getHours());
console.log(agora.getUTCHours());
console.log(agora.toString());
console.log(agora.toLocaleDateString());
