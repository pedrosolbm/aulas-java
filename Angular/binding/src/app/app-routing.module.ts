// Importando um componente da biblioteca @angular/core direto do angular 
import { NgModule } from '@angular/core';

// Importando da biblioteca  @angular/router as funções de roteamento direto do angular 
import { Routes, RouterModule } from '@angular/router';

// declarando quais são as rotas da aplicação
const routes: Routes = [];

//Importando e exportando os módulos de rotas que serã usadas na aplicação
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

// Método para utlizar essas funções no template
export class AppRoutingModule { }
