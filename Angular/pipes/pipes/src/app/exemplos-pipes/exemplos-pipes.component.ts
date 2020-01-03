// Importando um componente da biblioteca @angular/core direto do angular
// e a biblioteca OmInit para ser usada quando a página iniciar
import { Component, OnInit } from '@angular/core';

// importando classes das biblioteca rxjs do @angular e utilizando
// para programação reativa usando observáveis ​​que facilita a composição
// de código assíncrono ou baseado em retorno de chamada
import { interval } from 'rxjs';
import { map } from 'rxjs/operators';


// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-exemplos-pipes',
  templateUrl: './exemplos-pipes.component.html',
  styleUrls: ['./exemplos-pipes.component.css']
})

// Método para utlizar/exportar essas funções no template
export class ExemplosPipesComponent implements OnInit {

  // MÉTODO UTILIZANDO PROMISE
  valorAsync = new Promise((resolve, reject) => {
    setTimeout(() => resolve('Valor assíncrono'), 2000);
  });

  // MÉTODO UTILIZANDO OBSERVABLE
  valorAsync2 = interval(2000)
  .pipe(
    map(valor => 'Valor assíncrono 2')
  );

  //Implementa um construtor
  constructor() { }

  // Declarando um vetor livros e incializando-o
  livros: string[] = ['Java', 'Angular'];

  // Declarando o filtro , que será utlizado a baixo
  filtro: string;

  // declarando o objeto livro , com seus atributos
  livro: any = {
    titulo: 'Learning JavaScript Data Structures and Algorithms 2nd ed',
    rating: 4.54321,
    numeroPaginas: 314,
    preco: 44.99,
    dataLancamento: new Date(2016, 5, 23),
    url: 'http://a.co/glqjpRP'
  };

  // função passada por parametro para pegar esse valor e adicionar
  // um livro e adiciona-lo ao vetor criado anteriormente
  addCurso(valor) {
    this.livros.push(valor);
    console.log(this.livros);
  }

  // Declarando uma função para obter os cursos e retorna-los ja com um filtro
  // utilizando uma lógica para retornar ele no padrão CamelCase
  obterCursos() {

    if (this.livros.length === 0 || this.filtro === undefined
    || this.filtro.trim() === '') {
      return this.livros;
    }

    return this.livros.filter(
       v => v.toLocaleLowerCase().includes(this.filtro.toLocaleLowerCase())
    );
  }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

}
