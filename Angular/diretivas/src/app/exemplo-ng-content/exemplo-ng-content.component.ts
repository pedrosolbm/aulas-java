// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qual o estilo usado
@Component({
  selector: 'app-exemplo-ng-content',
  templateUrl: './exemplo-ng-content.component.html',
  styleUrls: ['./exemplo-ng-content.component.css']
})

// Método para utlizar/exportar essas funções no template
export class ExemploNgContentComponent implements OnInit {

  //Implementa um construtor
  constructor() { }

   //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

}





