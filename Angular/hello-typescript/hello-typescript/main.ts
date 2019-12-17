// declarando uma variavel constante
const minhaVar = 'minha variavel';

//declarando uma função, que recebe dois parametros
function minhaFunc(x, y) {
    //retorna a soma dos parametros recebidos
    return x + y;
}

//let é um tipo de variavel que não pode ser redeclarado como var
let num = 2;

 // declarando uma constante, não pode ser redeclarada nem ter seu valor alterado
const PI = 3.14;

// declaração de vetor
var numeros = [1, 2, 3];

//javascript
//chama o metodo .map para alterar o valor no vetor
numeros.map(function(valor){
    return valor * 2;
});

//arrow function minimiza a função acima:
numeros.map(valor => valor * 2); //es 2015

//teste da função matematica em ecmascript

// declaração de classe,
class Matematica {
    //classe matematica tem uma função soma que recebe dois numeros
    soma(x, y){
        return x + y;
    }
}