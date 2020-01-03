// Importando as bibliotecas Pipes e PipeTransform @angular/core direto do angular
// para fazer as conversões necessárias
import { Pipe, PipeTransform } from '@angular/core';

// Importando as funções que serão  de utilizadas tambem nesse Pipe './filtro-array.pipe'
import { FiltroArrayPipe } from './filtro-array.pipe';

// Atribuindo ao Pipe uma varivel "name" e inicializando uma string a ela
@Pipe({
    name: 'filtroArrayImpuro',
    pure: false
  })
  // método / função de FiltroArrayImpuroPipe que se herda as funções de FiltroArrayPipe
  export class FiltroArrayImpuroPipe extends FiltroArrayPipe {

  }
