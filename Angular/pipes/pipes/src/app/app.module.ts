import { SettingsService } from './settings.service';

// Importando um componente da biblioteca @angular/platform-browser direto do angular
import { BrowserModule } from '@angular/platform-browser';

// Importando um componente da biblioteca @angular/core direto do angular
import { NgModule, LOCALE_ID } from '@angular/core';

// Importando as rotas a serem atribuidas no modulo
import { AppRoutingModule } from './app-routing.module';

//Importamdo os componetes do aplicação
import { AppComponent } from './app.component';
import { ExemplosPipesComponent } from './exemplos-pipes/exemplos-pipes.component';

// pegando a CamelCase criado anteriormente
import { CamelCasePipe } from './camel-case.pipe';

// utilizando a bibliateca Forms do angular
import { FormsModule } from '@angular/forms';

import { registerLocaleData } from '@angular/common';
import localePt from '@angular/common/locales/pt';
import { FiltroArrayPipe } from './filtro-array.pipe';
import { FiltroArrayImpuroPipe } from './filtro-array-impuro.pipe';
registerLocaleData(localePt, 'pt');

//Importando os métodos que utlizam propriedades dos componetes
@NgModule({
  declarations: [
    AppComponent,
    ExemplosPipesComponent,
    CamelCasePipe,
    FiltroArrayPipe,
    FiltroArrayImpuroPipe
  ],

  //Importações utilizadas no módulo
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],

  //Importando Estilos e os Provedores
  providers: [
    // { provide: LOCALE_ID, useValue: 'pt' },
    SettingsService,
    {
      provide: LOCALE_ID,
      deps: [SettingsService],
      useFactory: (settingsService) => settingsService.getLocale()
    }
  ],
  bootstrap: [AppComponent]
})

//Métodos para o AppModule
export class AppModule { }
