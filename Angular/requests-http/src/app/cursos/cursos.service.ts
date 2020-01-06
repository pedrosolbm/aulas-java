/**
 * Decorador que marca uma classe como disponível para ser fornecida e 
 * injetada como uma dependência da biblioteca do angular/core
 */
import { Injectable } from '@angular/core';

// importando a biblioteca que executa solicitações Http
import { HttpClient } from '@angular/common/http';

// Importando /fazendo a ligação com a variaveis id e nome de Cursos
import { Curso } from './curso';

/* O RxJS (Extensões Reativas para JavaScript) é uma biblioteca para programação 
   reativa usando observáveis ​​que facilita a composição de código assíncrono ou baseado 
   em retorno de chamada. */
import { tap, delay, take } from 'rxjs/operators';

import { environment } from '../../environments/environment';

@Injectable({
    providedIn: 'root'
  })

  // Método para utlizar/exportar essas funções no template
  export class CursosService {

    private readonly API = 'http://localhost:3000/cursos';

    // Construtor para as solicitações http
    constructor(private http: HttpClient) { }

    list() {
        return this.http.get<Curso[]>(this.API)
          .pipe(
            //delay(2000),
            tap(console.log)
          );
      }


    loadByID(id) {
        return this.http.get(`${this.API}/${id}`).pipe(take(1));
    }

    // Métodos de CRUD a seguir :

    create(curso) {
      return this.http.post(this.API, curso).pipe(take(1));
    }

    update(curso) {
      return this.http.put(`${this.API}/${curso.id}`, curso).pipe(take(1));
    }

    remove(id) {
      return this.http.delete(`${this.API}/${id}`).pipe(take(1));
    }

  }