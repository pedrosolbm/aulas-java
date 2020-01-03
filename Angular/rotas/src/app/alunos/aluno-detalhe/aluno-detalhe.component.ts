import { Component, OnInit } from '@angular/core';
import { AlunosService } from '../alunos.service';
import { Router, ActivatedRoute } from '@angular/router';

import { Subscription } from 'rxjs';

@Component({
  selector: 'app-aluno-detalhe',
  templateUrl: './aluno-detalhe.component.html',
  styleUrls: ['./aluno-detalhe.component.css']
})
export class AlunoDetalheComponent implements OnInit {


  id: number;

  inscrito: Subscription;

  aluno: any;

  constructor(private route: ActivatedRoute, private router: Router, private alunosService: AlunosService) { }

  ngOnInit() {

    this.inscrito = this.route.params.subscribe(
      (params: any) => {
        this.id = params.id;

        this.aluno = this.alunosService.getAluno(this.id);
         console.log(this.aluno);
        
        if (this.aluno == null){
            this.router.navigate(['/naoEncontrado']); 
        } 
      }
    );
  }

  ngOnDestroy() {
    this.inscrito.unsubscribe();
  }

}
