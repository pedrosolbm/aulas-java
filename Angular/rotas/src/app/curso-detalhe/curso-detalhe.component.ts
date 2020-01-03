import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

// import de subscription
// tslint:disable-next-line: import-blacklist
import { Subscription } from 'rxjs';

import { CursosService } from '../cursos/cursos.service';

@Component({
  selector: 'app-curso-detalhe',
  templateUrl: './curso-detalhe.component.html',
  styleUrls: ['./curso-detalhe.component.css']
})
export class CursoDetalheComponent implements OnInit {

  // variavvel criada para passar o número por interpolação ao template
  id: number;
  inscricao: Subscription;

  // Variavel curso criada para o exemplo de rota imperativa
  curso: any;

  // injeção de dependência para obter o valor de id e repassar ao template
  // também é feita a injeção do serviço CursosService (deve ser feito o import)
  // e também será injetada dependência da classe Router, que contém os métodos para redirecionamento (deve ser feito o import)
  constructor( private route: ActivatedRoute, private router: Router, private cursosService: CursosService ) { 
    // this.id = this.route.snapshot.params['id'];
  }

  // inscrição recebe o método subscribe para assinar as mudanças feitas no paraâmetro de route
  // dentro de subscribe, vai ser passado params, que é um objeto (no caso, do tipo any, pois não se sabe o que irá receber)
  // a função estabelece que a variavel id, do arquivo recebe o valor id do objeto params
  // this.route.params é do tipo de inscrição
  // dessa forma, será criada uma variável inscricao (do tipo subscription) ou seja vai retornar 
  // um objeto de inscrição que vai permitir que nos inscrevamos
  // deve ser feito um import do Subscription
  // quando o objeto for destruído (na função ngOndestroy) deve-se efetuar o unsubscribe para deixar de escutar as mudanças
  ngOnInit() {
    this.inscricao = this.route.params.subscribe(
      (params: any) => {
        this.id = params.id;


        // ESTA FUNÇÃO É CRIADA PARA O EXEMPLO DE ROTA IMPERATIVA, QUE RETORNA UM CURSO SE ENCONTRADO
        // OU RETORNA UM CURSO NÃO ENCONTRADO
        // curso vai comparar a informação de id do método getCurso que vem de CursosService com o id que está 
        // passando como parâmetro
        this.curso = this.cursosService.getCurso(this.id);

        // com a classe Router injetada, pode-se fazer a verificação se o curso consta como null
        // (não existente) e através do método navigate
        // podemos redirecionar para o caminho que está sendo passado dentro deste método
        // é necessário criar este componente "naoEncontrado"
        // uma vez que exista esse componente e a rota dele esteja criada em app.routing, podemos
        // endereçar esta rota se houver necessidade
        if (this.curso == null){
            this.router.navigate(['/naoEncontrado']); 
        } 
      }
    );
  }

  // função para desinscrever o objeto inscricao para deixar de escutar os eventos
  // tslint:disable-next-line: use-lifecycle-interface
  ngOnDestroy() {
    this.inscricao.unsubscribe();
  }

}
