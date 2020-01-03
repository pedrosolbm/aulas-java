
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from './curso';
import { tap, delay, take } from 'rxjs/operators';
import { environment } from '../../environments/environment';

@Injectable({
    providedIn: 'root'
  })
  export class CursosService {

    private readonly API = 'http://localhost:3000/cursos';

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