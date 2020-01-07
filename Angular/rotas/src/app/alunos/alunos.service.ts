import { Injectable } from '@angular/core';
import { EmailValidator } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class AlunosService {

private alunos:any[]=[
  
  {id:1,nome:'Aluno01',email:'aluno01@email.com'},
  {id:2,nome:'Aluno02',email:'aluno02@email.com'},
  {id:3,nome:'Aluno03',email:'aluno03@email.com'},
];

getAlunos(){
return this.alunos;
}

getAluno(id:number){

  let cursos=this.getAlunos();
    for (let i=0;i<this.alunos.length;i++){
      let aluno=this.alunos[i];
      if(aluno.id==id){
      return aluno;
  }
  }
  return null; 

  }



  constructor() { 




  }
}
