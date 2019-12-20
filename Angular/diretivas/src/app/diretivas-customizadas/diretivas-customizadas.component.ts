// Importando um componente da biblioteca @angular/core direto do angular
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-diretivas-customizadas',
  templateUrl: './diretivas-customizadas.component.html',
  styleUrls: ['./diretivas-customizadas.component.css']
})

// Método para utlizar/exportar essas funções no template
export class DiretivasCustomizadasComponent implements OnInit {

  mostrarCursos = false;

  //Implementa um construtor
  constructor() { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

    // método para atribuir/ incrementar o atributo ".mostraCursos" 
  onMostrarCursos() {
    this.mostrarCursos = !this.mostrarCursos;
  }

}


 

