//importan  o Pipe do angular/core
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'camelCase'
})

/* transforma estilo pegya informcao de uma palavra que esta em lower case e tranforma em camel case
interface transform. */

export class CamelCasePipe implements PipeTransform {

  // pega qq tipo de valor(Livro.titulo) e tranforma. 

  transform(value: any, ...args: any[]): any {

    // split separa as palavras onde tem espaco e atribui a variavel values

    let values = value.split(' ');
    let result = '';

    // utiliza os values  e utiliza a funcao capitalize

    for (let v of values) {
      result += this.capitalize(v) + ' ';
    }

    return result;
  }

  /* Pipe personalizado camelCase
  funçao substr separa os caracteres passando dois argumentos 0 e 1 o 0 o indice 0 e o 1 e apenas um caractere,
  se fosse 0,2 pegaria os dois primeiros caracteres.Depois com a função toUpperCase  e caso algum caractere
  esteja em maisculo vai passar para minusculo. */

  capitalize(value: string) {
    return value.substr(0, 1).toUpperCase() +
      value.substr(1).toLowerCase();
  }



}


