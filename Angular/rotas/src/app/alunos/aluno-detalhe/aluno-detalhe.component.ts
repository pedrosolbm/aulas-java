import { Subscription } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { AlunosService } from '../alunos.service';

@Component({
  selector: 'app-aluno-detalhe',
  templateUrl: './aluno-detalhe.component.html',
  styleUrls: ['./aluno-detalhe.component.css']
})
export class AlunoDetalheComponent implements OnInit {

aluno:any;
inscricao:Subscription;


  constructor( 
    private route:ActivatedRoute,
    private alunosService:AlunosService,
    private router:Router) { }

  ngOnInit() {

    this.inscricao=this.route.params.subscribe(




      (params:any)=>{
        let id =params['id'];

        this.aluno=this.alunosService.getAluno(id);

      }
    );

    
    
    
  }


  editarContato(){

    this.router.navigate(['/alunos',this.aluno.id,'editar']);

  }

  ngOnDestroy(){
    this.inscricao.unsubscribe();
  }

}
