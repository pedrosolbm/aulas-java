import { AlunoFormComponent } from './aluno-form/aluno-form.component';
import { AlunoDetalheComponent } from './aluno-detalhe/aluno-detalhe.component';
import { AlunosComponent } from './alunos.component';
import { RouterModule } from '@angular/router';
import { NgModule, Component } from '@angular/core';
import { CommonModule } from '@angular/common';



const alunosRoutes=[

{path:'alunos',component:AlunosComponent,children:
  [
    {path:'novo',component:AlunoFormComponent},
    {path:':id',component:AlunoDetalheComponent},
    {path:':id/editar',component:AlunoFormComponent},
  ]
},



]

 
@NgModule({
  
  declarations: [],

  imports: [
    CommonModule,
    RouterModule.forChild(alunosRoutes)
  ],

  exports:[RouterModule]
})
export class AlunosRoutingModule { }
