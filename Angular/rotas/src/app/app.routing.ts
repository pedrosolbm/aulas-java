
import { InfoNaoEncontradaComponent } from './info-nao-encontrada/info-nao-encontrada.component';
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';
import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { CursosComponent } from './cursos/cursos.component';
import { LoginComponent } from './login/login.component';
import { CursoDetalheComponent } from './curso-detalhe/curso-detalhe.component';

import { AlunosComponent } from './alunos/alunos.component';
import { AlunoDetalheComponent } from './alunos/aluno-detalhe/aluno-detalhe.component';

const APP_ROUTES: Routes = [
    { path: 'cursos', component: CursosComponent },
    { path: 'curso/:id', component: CursoDetalheComponent },
    { path: 'login', component: LoginComponent },
    { path: 'home', component: HomeComponent },
    { path: 'alunos', component: AlunosComponent , children : [
        { path: ':id', component: AlunoDetalheComponent }
    ]}, 
    { path: 'naoEncontrado', component: InfoNaoEncontradaComponent },
    { path: '', redirectTo: '/login', pathMatch: 'full' },
    { path: '**', component: PaginaNaoEncontradaComponent }
];


export const routing: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);