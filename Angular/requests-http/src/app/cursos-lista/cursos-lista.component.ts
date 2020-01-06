// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit, ViewChild } from '@angular/core';

// Linhas a seguir fazem a ligação com os serviços Http criados
import { CursosService } from '../cursos/cursos.service';
import { Curso } from '../cursos/curso';

/* O Angular Router permite a navegação de uma visualização para a outra, 
*  conforme os usuários executam tarefas do aplicativo. Já o ActivedRoute 
*  Fornece acesso as informações sobre uma rota associada a um componente 
*  carregado em uma ligação. Usado para percorrer a árvore de rotas e extrair 
*  informações dos nós.
*/ 
import { Router, ActivatedRoute } from '@angular/router';

// Importando os diferentes estilos que serão usados na página, direto do Bootstrap
import { BsModalRef, BsModalService } from 'ngx-bootstrap/modal';

import { Observable } from 'rxjs/internal/Observable';

// Importando a biblioteca com um serviço que os aplicativos podem 
// usar para interagir com o URL de um navegador.
import { Location } from '@angular/common';

// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-cursos-lista',
  templateUrl: './cursos-lista.component.html',
  styleUrls: ['./cursos-lista.component.css'],
  preserveWhitespaces: true
})

// Método para utlizar/exportar essas funções no template
export class CursosListaComponent implements OnInit {

  // declarando e iniciando a variavel -cursos , com métodos de cursos.service
  cursos: Curso[];

  deleteModalRef: BsModalRef;

  cursoSelecionado: Curso;


  @ViewChild('deleteModal', { static: true }) deleteModal;
  constructor(private service: CursosService, private router: Router, private route: ActivatedRoute, private modalService: BsModalService, private location: Location) { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
    this.service.list().subscribe(dados => this.cursos = dados);
  }

  //--------------- Métodos a seguir são para realizar as operações de CRUD -------------//

    onEdit(id) {
      this.router.navigate(['editar', id], { relativeTo: this.route });
    }

    onDelete(curso) {
      this.cursoSelecionado = curso;
      this.deleteModalRef = this.modalService.show(this.deleteModal, { class: 'modal-sm' });
    }

    onConfirmDelete() {
      this.service.remove(this.cursoSelecionado.id).subscribe(
        success => {
                      this.deleteModalRef.hide()
        },             
            error => alert("Erro ao remover registro. Tente novamente") 
      );
    }

    onDeclineDelete() {
      this.deleteModalRef.hide();
    }

}
