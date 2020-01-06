//importa os dados de CursoNaoEncontradoComponent para que fiquem visiveis
import { CursoNaoEncontradoComponent } from './cursos/curso-nao-encontrado/curso-nao-encontrado.component';
//importa os dados de CursoDetalheComponent para que fiquem visiveis 
import { CursoDetalheComponent } from './cursos/curso-detalhe/curso-detalhe.component';

import { ModuleWithProviders } from '@angular/core';
//Representa uma configuração de rota para o serviço Roteador. Uma matriz de Route object, 
//usada em Router.config para configurações de rota aninhadas em Route.children.
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { CursosComponent } from './cursos/cursos.component';
import { LoginComponent } from './login/login.component';

//Representa uma configuração de rota para o serviço Roteador. Uma matriz de Routeobjetos, 
//usada em Router.confige para configurações de rota aninhadas em Route
const APP_ROUTES: Routes = [
    { path: 'cursos', component: CursosComponent },
    { path: 'curso/:id', component: CursoDetalheComponent },
    { path: 'login', component: LoginComponent },
    { path: 'naoEncontrado', component: CursoNaoEncontradoComponent },
    { path: '', component: HomeComponent }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);
