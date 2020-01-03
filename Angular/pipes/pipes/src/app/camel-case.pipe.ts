// Importando as bibliotecas Pipes e PipeTransform @angular/core direto do angular
// para fazer as conversões necessárias
import { Pipe, PipeTransform } from '@angular/core';

// Atribuindo ao Pipe uma varivel "name" e inicializando uma string a ela
@Pipe({
  name: 'camelCase'
})


export class CamelCasePipe implements PipeTransform {

  transform(value: any, args?: any): any {
    let values = value.split(' ');
    let result = '';

    for (let v of values){
      result += this.capitalize(v) + ' ';
    }

    return result;
  }

  capitalize(value: string){
    return value.substr(0,1).toUpperCase() +
      value.substr(1).toLowerCase();
  }

}
