/**
 * Implementa diretivas e tubos angulares básicos, como 
 * NgIf, NgForOf, DecimalPipe e assim por diante.
 */
import { CommonModule } from '@angular/common';

// Importando as classes da biblioteca @angular/core direto do angular 
import { NgModule } from '@angular/core';

// importação da classe CursosService para poder utiliza-la como provider
import { CursosService } from '../cursos/cursos.service';

// Importando os modulos e serviços do componete criar-curso.component
import { CriarCursoComponent } from './criar-curso.component';

// Importando os modulos e seviços do componete receber-curso-criado.component
import { ReceberCursoCriadoComponent } from '../receber-curso-criado/receber-curso-criado.component';

/**
 * Importando os métodos que utlizam propriedades dos componetes
 * incluzive de todas as diretivas que foram criadas.
 */
@NgModule({
  declarations: [
    CriarCursoComponent,
    ReceberCursoCriadoComponent
  ],

  //Importações utilizadas no módulo
  imports: [
    CommonModule
  ],

  //Importando os Provedores
  exports: [CriarCursoComponent],
})

//Métodos para o AppModule
export class CriarCursoModule { }
