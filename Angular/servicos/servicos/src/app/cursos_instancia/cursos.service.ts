/**
 * Decorador que marca uma classe como disponível para ser fornecida e 
 * injetada como uma dependência da biblioteca do angular/core
 */
import { Injectable } from '@angular/core';

@Injectable()

// Método para utlizar/exportar essas funções no template
export class CursosService {
    //método que retorna um vetor de Strings
    getCursos() {
        return ['Angular', 'Java', 'Phonegap'];
    }
}
