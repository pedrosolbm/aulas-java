// Importando um componente da biblioteca @angular/platform-browser direto do angular 
import { BrowserModule } from '@angular/platform-browser';

// Importando um componente da biblioteca @angular/core direto do angular 
import { NgModule } from '@angular/core';

// Importando as rotas a serem atribuidas no modulo
import { AppRoutingModule } from './app-routing.module';

//Importamdo os componetes do aplicação
import { AppComponent } from './app.component';

//Importando os métodos que utlizam propriedades dos componetes 
@NgModule({
  declarations: [
    AppComponent
  ],
  //Importações utilizadas no módulo
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  //Importando Estilos e os Provedores
  providers: [],
  bootstrap: [AppComponent]
})
//Métodos para o AppModule
export class AppModule { }
