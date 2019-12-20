// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qual estilo sera usado

@Component({
  selector: 'app-diretiva-ngif',
  templateUrl: './diretiva-ngif.component.html',
  styleUrls: ['./diretiva-ngif.component.css']
})

// Método para utlizar/exportar essas funções no template
export class DiretivaNgifComponent implements OnInit {

  // ceclarando um vetor de Strings
  cursos: string[] = [];

  // declarando uma variável booleana
  mostrarCursos: boolean = false;

    //Implementa um construtor
  constructor() { }

   //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

  onMostrarCursos(){
    this.mostrarCursos = !this.mostrarCursos;
  }

}