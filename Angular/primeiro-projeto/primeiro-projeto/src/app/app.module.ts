// Importando um componente da biblioteca @angular/platform-browser direto do angular 
import { BrowserModule } from '@angular/platform-browser';

// Importando um componente da biblioteca @angular/core direto do angular 
import { NgModule } from '@angular/core';

// Importando as rotas a serem atribuidas no modulo
import { AppRoutingModule } from './app-routing.module';

//Importamdo os componetes do aplicação
import { AppComponent } from './app.component';

/* Linhas a seguir importam os componentes criados respectivamente 
   MeuPrimeiroComponent, MeuPrimeiro2Component e CursosModule 
*/
import { MeuPrimeiroComponent } from './meu-primeiro/meu-primeiro.component';
import { MeuPrimeiro2Component } from './meu-primeiro2/meu-primeiro2.component';
import { CursosModule } from './cursos/cursos.module';

//Importando os métodos que utlizam propriedades dos componetes 
@NgModule({
  declarations: [ 
    MeuPrimeiroComponent,
    MeuPrimeiro2Component
  ],
//Importações utilizadas no módulo
  imports: [ 
    BrowserModule,
    AppRoutingModule,
    CursosModule 
  ],
//Importando Estilos e os Provedores
  providers: [],
  bootstrap: [AppComponent]
  
})

//Métodos para o AppModule
export class AppModule { }
