// Importando um componente da biblioteca @angular/core direto do angular 
import { NgModule } from '@angular/core';

// Importando da biblioteca  @angular/router as funções de roteamento direto do angular 
import { Routes, RouterModule } from '@angular/router';

// As linhas a seguir estão fazendo as ligações de rotas com os componentes
import { CursosListaComponent } from './cursos-lista/cursos-lista.component';
import { CursosFormComponent } from './cursos-form/cursos-form.component';

// declarando quais são as rotas da aplicação
const routes: Routes = [{ path: '', component: CursosListaComponent },
                        { path: 'novo', component: CursosFormComponent},
                        { path: 'editar/:id', component: CursosFormComponent}];

//Importando e exportando os módulos de rotas que serã usadas na aplicação
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

// Método para utlizar essas funções no template
export class AppRoutingModule { }
