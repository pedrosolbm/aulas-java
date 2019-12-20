// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qual estilo será usado
@Component({
  selector: 'app-diretiva-ngclass',
  templateUrl: './diretiva-ngclass.component.html',
  styleUrls: ['./diretiva-ngclass.component.css']
})

// Método para utlizar/exportar essas funções no template
export class DiretivaNgclassComponent implements OnInit {

  meuFavorito: boolean = false;

  //Implementa um construtor
  constructor() { }

   //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

  //métodos ngClick para gerar ações quando o usuário clicar no elemento
  onClick(){
    this.meuFavorito = !this.meuFavorito;
  }

}


