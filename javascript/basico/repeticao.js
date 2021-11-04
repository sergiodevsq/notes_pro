/*
    while (expressão)
        instrução

    do
        instrução
    while (expressão);

    for(inicialização ; teste ; incremento)
        instrução

    for (variável in objeto)
        instrução    

    
    TRY CATCH FINALLY

    try {
        // Normalmente, este código é executado do início ao fim do bloco
        // sem problemas. Mas às vezes pode disparar uma exceção
        // diretamente, com uma instrução throw, ou indiretamente, pela
        // chamada de um método que lança uma exceção.
        }
        catch (e) {
        // As instruções deste bloco são executadas se, e somente se, o bloco
        // try dispara uma exceção. Essas instruções podem usar a variável local
        // e se referir ao objeto Error ou a outro valor que foi lançado.
        // Este bloco pode tratar da exceção de algum modo, pode ignorá-la
        // não fazendo nada ou pode lançar a exceção novamente com throw.
        }
        finally {
        // Este bloco contém instruções que são sempre executadas, independente
        // do que aconteça no bloco try. Elas são executadas se o bloco
        // try terminar:
        //
        1) normalmente, após chegar ao final do bloco
        //
        2) por causa de uma instrução break, continue ou return
        //
        3) com uma exceção que é tratada por uma cláusula catch anterior
        //
        4) com uma exceção não capturada que ainda está se propagando
    }

    document.forms[0].address.value;
    with(document.forms[0]) {
        // Acessa elementos do formulário diretamente aqui. Por exemplo:
        name.value = "";
        address.value = "";
        email.value = "";
    }

        
*/