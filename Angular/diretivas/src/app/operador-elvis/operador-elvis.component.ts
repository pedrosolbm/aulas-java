// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qual estilo usado
@Component({
  selector: 'app-operador-elvis',
  templateUrl: './operador-elvis.component.html',
  styleUrls: ['./operador-elvis.component.css']
})

// Método para utlizar/exportar essas funções no template
export class OperadorElvisComponent implements OnInit {

  // declarando classes
  tarefa: any = {
    desc: 'Descrição da tarefa',

    responsavel: {
      usuario: null
    }
  };

  //Implementa um construtor
  constructor() { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

}