//Importando os serviços do componente Log.service
import { LogService } from './shared/log.service';

// Importando uma classe da biblioteca @angular/platform-browser direto do angular 
import { BrowserModule } from '@angular/platform-browser';

// Importando uma classe da biblioteca @angular/core direto do angular 
import { NgModule } from '@angular/core';

// Importando as rotas a serem atribuidas no modulo
import { AppRoutingModule } from './app-routing.module';

//Importamdo os componetes do aplicação
import { AppComponent } from './app.component';

// Importando os modulos do componete cursos.module
import { CursosModule } from './cursos/cursos.module';
// importação da classe CursosService para poder utiliza-la como provider
// também deve ser inserida dentro de providers, neste arquivo
import { CursosService } from './cursos/cursos.service';
import { CriarCursoModule } from './criar-curso/criar-curso.module';

/**
 * Importando os métodos que utlizam propriedades dos componetes
 * incluzive de todas as diretivas que foram criadas.
 */ 
@NgModule({
  declarations: [
    AppComponent
  ],

  //Importações utilizadas no módulo
  imports: [
    BrowserModule,
    AppRoutingModule,
    CriarCursoModule,
    CursosModule
  ],
  // este provider está comentado porque CursosService está como provider ou nos
  // modulos funcionais ou internamente dentro de um componente
  // se descomentar, CursosServices ficará disponível para toda a aplicação
  // providers: [CursosService],

  //Importando Estilos e os Provedores
  providers: [LogService],
  bootstrap: [AppComponent]
})

//Métodos para o AppModule
export class AppModule { }
