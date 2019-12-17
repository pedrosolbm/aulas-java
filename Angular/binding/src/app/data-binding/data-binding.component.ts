import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {


  url: String = 'http://serratec.com';

  cursoAngular: boolean = true;

  urlImagem = 'http://lorempixel.com/400/200/nature/';

  valorAtual: string = '';

  valorSalvo;

  isMouseOver: boolean = false;

  nomeDoCurso: string = 'Angular';

  nome: string = 'abc';

  pessoa: any = {
    nome: 'def',
    idade: 20
  };

  valorInicial = 15;

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

  constructor() { }

  ngOnInit() {
  }

}
