// Importando o componente ForsmsModule da biblioteca @angular/forms direto do angular 
import { FormsModule } from '@angular/forms';

// Importando um componente da biblioteca @angular/platform-browser direto do angular 
import { BrowserModule } from '@angular/platform-browser';

// Importando um componente da biblioteca @angular/core direto do angular 
import { NgModule } from '@angular/core';

// Importando as rotas a serem atribuidas no modulo
import { AppRoutingModule } from './app-routing.module';
//Importamdo os componetes do aplicação
import { AppComponent } from './app.component';

// --------------------------------Inicio dos "Imports" das diretivas----------------------------------//

/**
 * Os "Imports" a seguir importam os componentes das dirtetivas 
 * anteriormente criadas, para que todas as rotas estejam corretas 
 * na hora da utilizaçõa dos componentes.
 */
import { DiretivaNgifComponent } from './diretiva-ngif/diretiva-ngif.component';
import { DiretivaNgswitchComponent } from './diretiva-ngswitch/diretiva-ngswitch.component';
import { DiretivaNgforComponent } from './diretiva-ngfor/diretiva-ngfor.component';
import { DiretivaNgclassComponent } from './diretiva-ngclass/diretiva-ngclass.component';
import { DiretivaNgstyleComponent } from './diretiva-ngstyle/diretiva-ngstyle.component';
import { OperadorElvisComponent } from './operador-elvis/operador-elvis.component';
import { ExemploNgContentComponent } from './exemplo-ng-content/exemplo-ng-content.component';
import { FundoAmareloDirective } from './shared/fundo-amarelo.directive';
import { DiretivasCustomizadasComponent } from './diretivas-customizadas/diretivas-customizadas.component';
import { HighlightMouseDirective } from './shared/highlight-mouse.directive';
import { HighlightDirective } from './shared/highlight.directive';
import { NgElseDirective } from './shared/ng-else.directive';
// -------------------------------------Fim dos "Imports" das diretivas-------------------------------------//

/**
 * Importando os métodos que utlizam propriedades dos componetes
 * incluzive de todas as diretivas que foram criadas.
 */ 
@NgModule({
  declarations: [
    AppComponent,
    DiretivaNgifComponent,
    DiretivaNgswitchComponent,
    DiretivaNgforComponent,
    DiretivaNgclassComponent,
    DiretivaNgstyleComponent,
    OperadorElvisComponent,
    ExemploNgContentComponent,
    FundoAmareloDirective,
    DiretivasCustomizadasComponent,
    HighlightMouseDirective,
    HighlightDirective,
    NgElseDirective
  ],

    //Importações utilizadas no módulo
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],

   //Importando Estilos e os Provedores
  providers: [],
  bootstrap: [AppComponent]
})

//Métodos para o AppModule
export class AppModule { }
