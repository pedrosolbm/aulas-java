import { Pipe, PipeTransform } from '@angular/core';
import { FiltroArrayPipe } from './filtro-array.pipe';

//Herda da class filtro Array-Pipe
// e ajusta pure como falso 

@Pipe({
    name: 'filtroArrayImpuro',
    pure: false
  })
  export class FiltroArrayImpuroPipe extends FiltroArrayPipe {

  }
