// Importando as classes da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// importação da classe CursosService, qual o serviço vai ser utlizado
import { CursosService } from './cursos.service';

// Utilizando o componente e referênciando Selector, qual o template e qual estilo sera usado
@Component({
  selector: 'app-cursosInstancia',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.css']
})

// Método para utlizar/exportar essas funções no template
export class CursosComponent implements OnInit {

  // Declarando um vetor de Strings
  // Será preenchida com alguns itens para verificação da iteração no template
  cursos: string[] = [];

  // declarando uma váriavel para receber os valores de "CursosService"
  cursosService: CursosService;

  //Implementa um construtor e o inicializa vazendo um novo objeto
  constructor() {
      this.cursosService = new CursosService();
  }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
      this.cursos = this.cursosService.getCursos();
  }

}
