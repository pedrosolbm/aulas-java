import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CursosService {


  getCursos(){
    return [

      {id:1,nome:"ANGULAR 8"},
      {id:2,nome:"JAVA"},
      {id:3,nome:"C#"}

    ];
  }

  getCurso(id:number){

  let cursos=this.getCursos();
    for (let i=0;i<cursos.length;i++){
      let curso=cursos[i];
      if(curso.id==id){
      return curso;
  }
  }
  return null; 

  }

  constructor() { }
}
