// tslint:disable-next-line:eofline
var minhaVar = 'minha variavel';
function minhaFunc(x, y) {
    return x + y;
}
//transpiler para transformar ecmascript como javascript
//es6 ou ecmascript
var num = 2;
var PI = 3.14;
var numeros = [1, 2, 3];
numeros.map(function (valor) {
    return valor * 2;
});
//arrow function minimiza a função acima:
numeros.map(function (valor) { return valor * 2; }); //es 2015
