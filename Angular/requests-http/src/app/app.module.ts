// Importando um componente da biblioteca @angular/platform-browser direto do angular.
import { BrowserModule } from '@angular/platform-browser';

// Importando um componente da biblioteca @angular/core direto do angular.
import { NgModule } from '@angular/core';

// Importando as rotas a serem atribuidas no modulo.
import { AppRoutingModule } from './app-routing.module';

//Importamdo os componetes do aplicação.
import { AppComponent } from './app.component';

/**
 * Os "Imports" a seguir importam os componentes das dirtetivas
 * anteriormente criadas, para que todas as rotas estejam corretas
 * na hora da utilizaçõa dos componentes.
 */
import { CursosFormComponent } from './cursos-form/cursos-form.component';
import { CursosListaComponent } from './cursos-lista/cursos-lista.component';
import { CursosService } from './cursos/cursos.service';

// Modulos importados a seguir para a estilização da página,
// utilizando formulários e moodais .
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { BsModalService, ModalModule } from 'ngx-bootstrap/modal';

/**
 * Importando os métodos que utlizam propriedades dos componetes
 */
@NgModule({
  declarations: [
    AppComponent,
    CursosFormComponent,
    CursosListaComponent
  ],
  //Importações utilizadas no módulo
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    ModalModule.forRoot()
  ],
  //Importando Estilos e os Provedores
  providers: [CursosService, BsModalService],
  bootstrap: [AppComponent]
})
//Métodos para o AppModule
export class AppModule { }
