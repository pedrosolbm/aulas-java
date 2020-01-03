import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { CursosComponent } from './cursos/cursos.component';


import { routing } from './app.routing';
import { CursosService } from './cursos/cursos.service';
import { AlunosService } from './alunos/alunos.service';
import { CursoDetalheComponent } from './curso-detalhe/curso-detalhe.component';
import { InfoNaoEncontradaComponent } from './info-nao-encontrada/info-nao-encontrada.component';
import { AlunosComponent } from './alunos/alunos.component';
import { AlunoDetalheComponent } from './alunos/aluno-detalhe/aluno-detalhe.component';

import { AuthService } from './login/auth.service';

import { FormsModule } from '@angular/forms';
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    CursosComponent,
    CursoDetalheComponent,
    InfoNaoEncontradaComponent,
    AlunosComponent,
    AlunoDetalheComponent,
    PaginaNaoEncontradaComponent
  ],
  imports: [
  BrowserModule,
    AppRoutingModule,
    routing,
    FormsModule
  ],
  providers: [AlunosService, CursosService, AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
