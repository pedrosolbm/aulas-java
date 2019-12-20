// Importando as classes da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Importando qual o serviço vai ser utlizado , da classe "cursos.service"
import { CursosService } from '../cursos/cursos.service';

// Utilizando o componente e referênciando Selector, qual o template e qual estilo sera usado
@Component({
  selector: 'app-criar-curso',
  templateUrl: './criar-curso.component.html',
  styleUrls: ['./criar-curso.component.css'] ,
  providers: [CursosService]
})

// Método para utlizar/exportar essas funções no template
export class CriarCursoComponent implements OnInit {

  // Declarando um vetor de Strings
  // Será preenchida com alguns itens para verificação da iteração no template
  cursos: string[] = [];


   //Implementa um construtor e o inicializa com um parametro
  constructor(private cursosService: CursosService) { }

   //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
      this.cursos = this.cursosService.getCursos();
  }

  // método que recebe uma string passada por parametro e 
  // a atribui ao ao atributo cursosService
  onAddCurso(curso: string) {
    this.cursosService.addCurso(curso);

  }

}
