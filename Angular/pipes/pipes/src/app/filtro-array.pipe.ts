// Importando as bibliotecas Pipes e PipeTransform @angular/core direto do angular
// para fazer as conversões necessárias
import { Pipe, PipeTransform } from '@angular/core';

// Atribuindo a Pipe uma varivel "name" e inicializando uma string a ela
@Pipe({
  name: 'filtroArray'
})

// Função a seguir vai transformar a string anterior em Letras Maiusculas
export class FiltroArrayPipe implements PipeTransform {

  // O método recebe alguns parâmetros e retorna ele o proprio valor
  // se satisfazer a condição
  transform(value: any, args?: any): any {
    if (value.length === 0 || args === undefined) {
      return value;
    }

  // Criando uma váriavel e atribuindo a ela a função do Pipe para
  // transformar em letra maiuscula, logo depois transformando a
  // variavel "value" passada anteriormente
    let filter = args.toLocaleLowerCase();
    return value.filter(
      v => v.toLocaleLowerCase().includes(filter)
    );
  }

}

