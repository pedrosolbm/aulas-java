import { AlunosModule } from './alunos/alunos.module';
import { CursosModule } from './cursos/cursos.module';
//import { CursosService } from './cursos/cursos.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MaterializeButtonModule, MaterializeCardModule } from 'materialize-angular';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CommonModule } from '@angular/common';
import { MzButtonModule, MzInputModule } from 'ngx-materialize';


import { AppComponent } from './app.component';
//import { CursosComponent } from './cursos/cursos.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
//import { CursoDetalheComponent } from './cursos/curso-detalhe/curso-detalhe.component';
//import { CursoNaoEncontradoComponent } from './cursos/curso-nao-encontrado/curso-nao-encontrado.component';
import { AppRoutingModule } from './app.routing.module';
// import { AlunosComponent } from './alunos/alunos.component';

@NgModule({
  declarations: [
    AppComponent,
    //CursosComponent,
    LoginComponent,
    HomeComponent,
    //AlunosComponent,
    //CursoDetalheComponent,
    // CursoNaoEncontradoComponent  
  ],
  imports: [
    MzButtonModule,
    MzInputModule,
    CommonModule,
    BrowserModule,
    MaterializeButtonModule,
    MaterializeCardModule,
    BrowserAnimationsModule,
    CursosModule,
    AlunosModule,
    AppRoutingModule,
  ],
  // providers: [CursosService],
  bootstrap: [AppComponent]
})
export class AppModule { }


