/**
 * Decorador Injectable que marca uma classe como disponível para ser fornecida e 
 * injetada como uma dependência, e EventEmitter para emitir eventos personalizados 
 * de forma síncrona ou assíncrona e registre manipuladores para esses eventos direto 
 * da biblioteca do angular/core
 */
import { EventEmitter, Injectable } from '@angular/core';

// Importando a classe da biblioteca @angular/core direto do angular 
import { LogService } from './../shared/log.service';

/*
 * Utilizando o componente e referênciando proveodor, 
 * qual o template sera usado
 */
@Injectable()

// Método para utlizar/exportar essas funções no template
export class CursosService {

    static criouNovoCurso = new EventEmitter<string>();

    emitirCursoCriado = new EventEmitter<string>();

    // declarando um vetor de strigs e inicializando
    private cursos: string[] = ['Angular', 'Java', 'Phonegap'];

    // contrutor parra reber por parametro um valor e mostralo na tela
    constructor(private logService: LogService){
        console.log('CursosService');
    }


    // método para retornar a lista de cursos em logService
    getCursos() {
        this.logService.consoleLog('Obtendo lista de cursos');
        return this.cursos;
    }

    // método para adicionar/criar a lista de cursos passada por parametro em logService
    addCurso(curso: string) {
        this.logService.consoleLog('Criando um novo curso ' + curso);
        this.cursos.push(curso);
        this.emitirCursoCriado.emit(curso);
        CursosService.criouNovoCurso.emit(curso);
    }
}
