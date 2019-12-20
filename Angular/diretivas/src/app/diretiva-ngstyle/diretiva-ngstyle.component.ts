// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qual estilo sera usado 
@Component({
  selector: 'app-diretiva-ngstyle',
  templateUrl: './diretiva-ngstyle.component.html',
  styleUrls: ['./diretiva-ngstyle.component.css']
})

// Método para utlizar/exportar essas funções no template
export class DiretivaNgstyleComponent implements OnInit {

  //declarando variáveis e inicializando 
  ativo = false;
  tamanhoFonte = 10;

    //Implementa um construtor
  constructor() { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

  // método para atribuir/ incrementar o atributo ".ativo"
  mudarAtivo() {
    this.ativo = !this.ativo;
  }

}





 

