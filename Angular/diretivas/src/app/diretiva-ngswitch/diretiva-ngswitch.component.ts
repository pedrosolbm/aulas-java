// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qaul o estilo sera usado
@Component({
  selector: 'app-diretiva-ngswitch',
  templateUrl: './diretiva-ngswitch.component.html',
  styleUrls: ['./diretiva-ngswitch.component.css']
})

// Método para utlizar/exportar essas funções no template
export class DiretivaNgswitchComponent implements OnInit {

  // Declarando uma variavel string e inicializando
  aba: string = 'home';

  //Implementa um construtor
  constructor() { }

   //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

}







  