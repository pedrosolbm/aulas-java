// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qual o estilo sera usado
@Component({
  selector: 'app-diretiva-ngfor',
  templateUrl: './diretiva-ngfor.component.html',
  styleUrls: ['./diretiva-ngfor.component.css']
})

// Método para utlizar/exportar essas funções no template
export class DiretivaNgforComponent implements OnInit {

  // declarando um vetor de strings 
  cursos: string[] = ['Angular', 'Java', 'Phonegap'];

  //Implementa um construtor
  constructor() { }

   //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
    for (let i = 0; i < this.cursos.length; i++) {
      const curso = this.cursos[i];
    }
  }

}








