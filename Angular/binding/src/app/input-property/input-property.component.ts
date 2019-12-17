// Importando os componentes da biblioteca @angular/core direto do angular 
import { Component, OnInit, Input} from '@angular/core';

// Importando os componentes da biblioteca @angular/core direto do angular 
@Component({
  selector: 'app-curso',
    // Template da página 
  templateUrl: './input-property.component.html',
   // Estilo que será usado nessa página
  styleUrls: ['./input-property.component.css']
})

// Método para utlizar essas funções no template quando a página iniciar
export class InputPropertyComponent implements OnInit {

  //Atribui um nome ao curso
  @Input('nome') nomeCurso = '';

  //Implementa um construtor
  constructor() { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

}
