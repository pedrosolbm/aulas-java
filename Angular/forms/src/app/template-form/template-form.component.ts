// Importando um componente da biblioteca @angular/core direto do angular
// e a biblioteca OmInit para ser usada quando a página iniciar
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-template-form',
  templateUrl: './template-form.component.html',
  styleUrls: ['./template-form.component.css']
})

// Método para utlizar/exportar essas funções no template
export class TemplateFormComponent implements OnInit {

  //Implementa um construtor
  constructor() { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

}
