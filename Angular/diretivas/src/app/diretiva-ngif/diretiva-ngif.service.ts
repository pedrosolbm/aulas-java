// Importando um componente da biblioteca @angular/core direto do angular 
import { Injectable } from '@angular/core';

/*
 * Utilizando o componente e referênciando Selector, 
 * qual o template e qual estilo sera usado
 */
@Injectable({
  providedIn: 'root'
})

// Método para utlizar/exportar essas funções no template
export class DiretivaNgifService {

  //Implementa um construtor
  constructor() { }
}
