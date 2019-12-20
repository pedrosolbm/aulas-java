import { LogService } from './shared/log.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CursosModule } from './cursos/cursos.module';
// importação da classe CursosService para poder utiliza-la como provider
// também deve ser inserida dentro de providers, neste arquivo
import { CursosService } from './cursos/cursos.service';
import { CriarCursoModule } from './criar-curso/criar-curso.module';

@NgModule({
  declarations: [
    AppComponent
  ],
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
  providers: [LogService],
  bootstrap: [AppComponent]
})
export class AppModule { }
