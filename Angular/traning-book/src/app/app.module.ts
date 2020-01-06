import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatDialogModule} from '@angular/material/dialog';
import { HeaderComponent } from './header/header.component';
import { ContentComponent } from './content/content.component';
import { FooterComponent } from './footer/footer.component';
import { AppRoutingModule } from './app-routing/app-routing.module';
import { CadastroClientesComponent } from './cadastro-clientes/cadastro-clientes.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HomeLogadaComponent } from './home-logada/home-logada.component';
import { CadastroConcluidoComponent } from './cadastro-concluido/cadastro-concluido.component';
import { AuthGuard } from 'auth.guard';
import { AuthService } from 'auth.service';
import { AcessoNegadoComponent } from './acesso-negado/acesso-negado.component';
import { ModalNotCadastroComponent } from './modal-not-cadastro/modal-not-cadastro.component';
import { SingletonRouterService } from 'src/services/singletonRouter.service';

import {MatCardModule} from '@angular/material/card';
import { LoginComponent } from './login/login.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ContentComponent,
    FooterComponent,
    CadastroClientesComponent,
    HomeLogadaComponent,
    CadastroConcluidoComponent,
    AcessoNegadoComponent,
    ModalNotCadastroComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatDialogModule,
    AppRoutingModule,
    ReactiveFormsModule,
    MatCardModule
  ],
  providers: [AuthGuard, AuthService, SingletonRouterService],
  entryComponents: [ModalNotCadastroComponent],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
