/**
 * Decorador que marca uma classe como disponível para ser fornecida e 
 * injetada como uma dependência da biblioteca do angular/core
 */
import { Injectable } from '@angular/core';

/*
 * Utilizando o componente e referênciando proveodor, 
 * qual o template sera usado
 */
@Injectable({
  providedIn: 'root'
})

// Método para utlizar/exportar essas funções no template
export class SettingsService {

   //Implementa um construtor
  constructor() { }

  //Método que retorna qual local da linguagem desejada
  getLocale() {
    return 'pt-BR';
  }
}
