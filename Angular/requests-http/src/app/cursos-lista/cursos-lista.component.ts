import { Component, OnInit, ViewChild } from '@angular/core';
import { CursosService } from '../cursos/cursos.service';
import { Curso } from '../cursos/curso';
import { Router, ActivatedRoute } from '@angular/router';
import { BsModalRef, BsModalService } from 'ngx-bootstrap/modal';
import { Observable } from 'rxjs/internal/Observable';
import { Location } from '@angular/common';

@Component({
  selector: 'app-cursos-lista',
  templateUrl: './cursos-lista.component.html',
  styleUrls: ['./cursos-lista.component.css'],
  preserveWhitespaces: true
})
export class CursosListaComponent implements OnInit {

  cursos: Curso[];

  deleteModalRef: BsModalRef;

  cursoSelecionado: Curso;

  @ViewChild('deleteModal', { static: true }) deleteModal;
  constructor(private service: CursosService, private router: Router, private route: ActivatedRoute, private modalService: BsModalService, private location: Location) { }

  ngOnInit() {
    this.service.list().subscribe(dados => this.cursos = dados);
  }

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
