// import { CursosService } from './../../../../primeiro-projeto/src/app/cursos/cursos.service';
import { Component, OnInit } from '@angular/core';

// importação da classe CursosService, também deve indicar o caminho da classe
// como está na mesma pasta basta indicar o arquivo (não precisa da extensão)
import { CursosService } from './cursos.service';

@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.css']
})
export class CursosComponent implements OnInit {

  // variavel array de strings para lista de cursos
  // Será preenchida com alguns itens para verificação da iteração no template
  // o ideal é ter uma lista dinâmica, não estática como a abaixo
  // informações seriam retiradas do servidor
  // por isso será criada uma classe serviços
  // esta lista será criada na classe CursosService
  cursos: string[] = [];

  // Queremos que o componente chame o método da classe de serviço e que o retorno do método
  // seja atribuido a variável cursos
  // cria uma variavel do tipo CursosService
  // está comentada porque estamos usando no cosntrutor
  // cursosService: CursosService;

  // No Construtor, criaremos uma instância da classe CursosService na variavel
  // Construtor é a primeira coisa a ser executada, para criar os objetos
  // será feita a injeção de dependência (passada como parametro, no construtor)
  // usando um private, já estamos declarando a variavel no construtor
  constructor(private cursosService: CursosService) {}

  // Metódo ngOnInit será responsável por inicializar os conteúdos
  // executará após o construtor construir o que estiver programado
  // variavel cursos, do componente, vai receber o retorno do método getCursos
  // da classe CursosService
  // função subscribe serve para que o componente se increva para receber os eventos
  // de emitirCursoCriado que está em CursosService
  // componente será notificado quando for emitido um novo valor
  // usa o Objeto CursosService para acessar a variavel static no serviço CursosService
  // criouNovoCurso não tem acesso a emitirCursoCriado, porque só pode ser acessado via instância
  // podemos então usar só o subscribe
  // a lógica para recebimento é adicionar o curso que foi enviado via EventEmitter
  // para a variavel interna do arquivo
  ngOnInit() {
      this.cursos = this.cursosService.getCursos();
      CursosService.criouNovoCurso.subscribe(
      curso => this.cursos.push(curso)
    );
  }

}
