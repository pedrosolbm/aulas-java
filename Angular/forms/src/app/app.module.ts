// Importando um componente da biblioteca @angular/platform-browser direto do angular
import { BrowserModule } from '@angular/platform-browser';

// Importando um componente da biblioteca @angular/core direto do angular
import { NgModule } from '@angular/core';

// Importando as rotas a serem atribuidas no modulo
import { AppRoutingModule } from './app-routing.module';

//Importamdo os componetes do aplicação
import { AppComponent } from './app.component';

// Importando as classes dos formularios que serão utilizados no .template-form
import { TemplateFormComponent } from './template-form/template-form.component';

// buscando as Animatons para usar no template, da biblioteca do @angular
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


/**
 * Importando os métodos que utlizam propriedades dos componetes
 * incluzive de todas as diretivas que foram criadas.
 */
@NgModule({
  declarations: [
    AppComponent,
    TemplateFormComponent
  ],

  //Importações utilizadas no módulo
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],

  //Importando Estilos e os Provedores
  providers: [],
  bootstrap: [AppComponent]
})

//Métodos para o AppModule
export class AppModule { }
