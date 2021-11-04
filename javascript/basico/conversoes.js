console.log(Number("3"));
console.log(String(false));

console.log(parseInt("3 blind mice"));
console.log(parseFloat(" 3.12 meters"));


// parseInt() aceita um segundo argumento opcional especificando a raiz (base) do número a ser ana-
// lisado. Os valores válidos estão entre 2 e 36. Por exemplo:
console.log(parseInt("11", 2));
console.log(parseInt("ff", 16));
console.log(parseInt("zz", 36));
console.log(parseInt("077", 8));
console.log(parseInt("077", 10));
