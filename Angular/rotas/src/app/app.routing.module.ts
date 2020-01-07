import { NgModule } from '@angular/core';

// import { CursoNaoEncontradoComponent } from './cursos/curso-nao-encontrado/curso-nao-encontrado.component';
import{ Routes, RouterModule }from '@angular/router';
import { HomeComponent } from './home/home.component';
// import { CursosComponent } from './cursos/cursos.component';
import { LoginComponent } from './login/login.component';
// import { ModuleWithProviders } from '@angular/core';
// import { CursoDetalheComponent } from './cursos/curso-detalhe/curso-detalhe.component';

//Array que vai receber as informações de rota

//Constante com o  nome de APP_ROUTES dotipo
// Routes, Rotas são compostas de objeto

const appRoutes : Routes=[

//Rota raiz que vai renderizar meus Componentes

{path: '', component : HomeComponent },
//{path:'cursos',component:CursosComponent},
//{path:'curso/:id',component:CursoDetalheComponent},
{path:'login',component:LoginComponent},
//{path:'naoEncontrado',component:CursoNaoEncontradoComponent}
];


//Definição e configuração das rotas do projeto
//Classe RouterModule possui dois metodos(for Child-Para rotas de funcionalidade e for.Root=Contem as rotas de toda a aplicação-Rotas raizes)
// Passa um array de componentes do tipo Routes
 

@NgModule({

imports:[RouterModule.forRoot(appRoutes)],
exports :[RouterModule]


})
export class AppRoutingModule{}