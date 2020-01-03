import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AlunosService {

  getAlunos() {
    return [
      {id: 1, nome: 'João', sobrenome: 'de Deus', cpf: '584.706.336-94', tel: '(83) 5099-4628', email: 'joaodd@teleworm.us' },
      {id: 2, nome: 'Joaquim', sobrenome: 'Pereira', cpf: '670.975.530-49', tel: '(19) 8928-3577', email: 'jpereira@tCoachingPolls.com.br' },
      {id: 3, nome: 'William', sobrenome: 'Blazkowicz', cpf: '701.608.838-30', tel: '(27) 7993-9861', email: 'bjblaz@jourrapide.com'  },
      {id: 4, nome: 'Mario', sobrenome: 'Bros', cpf: '195.706.423-43', tel: '(71) 4707-9486', email: 'mario_bros@rhyta.com' },
      {id: 5, nome: 'Pen', sobrenome: 'Taylor', cpf: '168.489.529-40', tel: '(11) 2761-7957', email: 'pntlor@dayrep.com' },
    ];
  }

  
  getAluno(id: number){

    let alunos = this.getAlunos();

    for (let i=0; i<alunos.length; i++) {
      let aluno = alunos[i];
      if (aluno.id == id) {
        return aluno;
      }
    }
    return null;
  }

  constructor() { }
}
