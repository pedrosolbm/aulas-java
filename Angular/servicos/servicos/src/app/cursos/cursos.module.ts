/**
 * Implementa diretivas e tubos angulares básicos, como 
 * NgIf, NgForOf, DecimalPipe e assim por diante.
 */
import { CommonModule } from '@angular/common';

// Importando as classes da biblioteca @angular/core direto do angular 
import { NgModule } from '@angular/core';

// importação da classe CursosService para poder utiliza-la como provider
import { CursosService } from '../cursos/cursos.service';

// Importando os modulos e serviços do componete curso.component
import { CursosComponent } from './cursos.component';


/**
 * Importando os métodos que utlizam propriedades dos componetes
 * e as declarations que serão usadas
 */
@NgModule({
  declarations: [
    CursosComponent,
  ],

  //Importações utilizadas no módulo
  imports: [
    CommonModule
  ],

   //Importando os Provedores
  exports: [CursosComponent],
  providers: [CursosService]
})

//Métodos para o AppModule
export class CursosModule { }
