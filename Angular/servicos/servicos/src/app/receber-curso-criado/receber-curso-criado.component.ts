// importação da classe CursosService, qual o serviço vai ser utlizado
import { CursosService } from '../cursos/cursos.service';

// Importando as classes componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qual estilo sera usado
@Component({
  selector: 'app-receber-curso-criado',
  templateUrl: './receber-curso-criado.component.html',
  styleUrls: ['./receber-curso-criado.component.css']
})

// Método para utlizar/exportar essas funções no template
export class ReceberCursoCriadoComponent implements OnInit {

  curso: string;

  //Implementa um construtor e o inicializa com um parametro
  constructor(private cursosService: CursosService) { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
    this.cursosService.emitirCursoCriado.subscribe(
        cursoCriado => this.curso = cursoCriado
    );
  }

}
