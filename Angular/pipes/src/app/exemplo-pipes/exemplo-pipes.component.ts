import { Component, OnInit } from '@angular/core';

import { interval } from 'rxjs';
import { map } from 'rxjs/operators';
import { temporaryAllocator } from '@angular/compiler/src/render3/view/util';
import { parseLazyRoute } from '@angular/compiler/src/aot/lazy_routes';

@Component({
  selector: 'app-exemplo-pipes',
  templateUrl: './exemplo-pipes.component.html',
  styleUrls: ['./exemplo-pipes.component.css']
})
export class ExemploPipesComponent implements OnInit {

  /*  
  METODO UTILIZANDO PROMISE
  Promessa qua vai enviar e recever algo de volta
  informação de async instacia um metodo Promise
  passando alguns paramentros , resolve e reject
  valor asyncrono serve para assim que fazemos um requisicao
  e uma vez que as informações forem ficando prontas a partir de um tempo time put.
  2000ms ou 2 segundos é o tempo setado para receber de volta as informacoes. 
  */

  valorAsync = new Promise((resolve, reject) => {
    setTimeout(() => resolve('Valor assíncrono'), 2000);
  });
/* 
  METODO UTILIZANDO OBSERVABLE

  utilizando o observavle e usa uma função pipe q retorna varios tipos de informações
  no caso configura dse  uma função o rxjx que faz um mapeamento as informações que serão passados atraves de um evento e atribuidas
  para a variavel valorAsync2-
 */
  valorAsync2 = interval(2000)
  .pipe(
    map(valor => 'Valor assíncrono 2')
  );


  constructor() { }

  livros: string[] = ['Java', 'Angular'];

  filtro: string;

  livro: any = {
    titulo: 'Learning JavaScript Data Structures and Algorithms 2nd ed',
    rating: 4.54321,
    numeroPaginas: 314,
    preco: 44.99,
    dataLancamento: new Date(2016, 5, 23),
    url: 'http://a.co/glqjpRP'
  };

  addCurso(valor) {
    this.livros.push(valor);
    console.log(this.livros);
  }

  obterCursos() {

    if (this.livros.length === 0 || this.filtro === undefined || this.filtro.trim() === '') {
      return this.livros;
    }

    return this.livros.filter(
       v => v.toLocaleLowerCase().includes(this.filtro.toLocaleLowerCase())
    );
  }

  ngOnInit() {
  }

}
