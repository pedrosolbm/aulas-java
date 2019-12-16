
const minhaVar = 'minha variavel';

function minhaFunc(x, y) {
    return x + y;
}

//es6 ou ecmascript
let num = 2;
const PI = 3.14;

var numeros = [1, 2, 3];

//javascript
numeros.map(function(valor){
    return valor * 2;
});

//arrow function minimiza a função acima:
numeros.map(valor => valor * 2); //es 2015

//teste da função matematica em ecmascript
class Matematica {
    soma(x, y){
        return x + y;
    }
}

/* exemplo de decorator que já pode ser carregado no babel
@frozen class Foo {
    @configurable(false) @enumerable(true) method() {}
  } */

//typescript é bom para definição do tipo de classe
//como tipar a variavel
//var n1: string = 'sjsjshd';
//n1 = 4; //tipando uma variavel como string, por exemplo, ela nào receberá valor de inteiro
//a não ser que a variavel tenha n
//var n1 = 'sjsjshd';
//n1 = 4; 

