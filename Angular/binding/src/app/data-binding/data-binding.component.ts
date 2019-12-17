// Importando os componentes da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})

// Método para utlizar essas funções no template quando ela iniciar
export class DataBindingComponent implements OnInit {

  // atribui a url o endereço
  url: String = 'http://serratec.com';

  // ayribui um valor boleano a cusoAngular
  cursoAngular: boolean = true;

  // atribui a url o endereço
  urlImagem = 'http://lorempixel.com/400/200/nature/';

  // ayribui uma string a valorAtual
  valorAtual: string = '';

  //Somente declara um variavel sem atribuir nada a ela
  valorSalvo;

  // ayribui um valor boleano a isMouseOver
  isMouseOver: boolean = false;

  // ayribui uma string a nomeDoCurso
  nomeDoCurso: string = 'Angular';

  // ayribui uma string a nome
  nome: string = 'abc';

  //Classe com seus atributos
  pessoa: any = {
    nome: 'def',
    idade: 20
  };

  valorInicial = 15;

  /**
   * Métodos a seguir para implementar as variaveis declaradas anteriormente
   */
  getValor() {
    return 1;
  }

  getCurtirCurso() {
    return true;
  }

  botaoClicado() {
    alert('Botão clicado');
  }

  onKeyUp(evento: KeyboardEvent) {
    this.valorAtual = (<HTMLInputElement> evento.target).value;
  }

  salvarValor(valor) {
    this.valorSalvo = valor;
  }

  onMouseOverOut() {
    this.isMouseOver = !this.isMouseOver;
  }

  onMudouValor(evento) {
    console.log(evento.novoValor);
  }

  //Implementa um construtor
  constructor() { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

}
