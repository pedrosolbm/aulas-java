// Importando um componente da biblioteca @angular/core direto do angular 
import { Component, OnInit } from '@angular/core';

// importando as bibliotecas para edição dos formulários
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

// Linhas a seguir fazem a ligação com os serviços Http criados
import { CursosService } from '../cursos/cursos.service';

// Importando a biblioteca com um serviço que os aplicativos podem 
// usar para interagir com o URL de um navegador.
import { Location } from '@angular/common';

/* O ActivedRoute fornece acesso as informações sobre uma rota associada a um 
*  componente carregado em uma ligação. Usado para percorrer a árvore de rotas e 
*  extrair informações dos nós.
*/ 
import { ActivatedRoute } from '@angular/router';

/* O RxJS (Extensões Reativas para JavaScript) é uma biblioteca para programação 
   reativa usando observáveis ​​que facilita a composição de código assíncrono ou baseado 
   em retorno de chamada. */
import { map, switchMap, exhaustMap } from 'rxjs/operators';

// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-cursos-form',
  templateUrl: './cursos-form.component.html',
  styleUrls: ['./cursos-form.component.css']
})

// Método para utlizar/exportar essas funções no template
export class CursosFormComponent implements OnInit {

  form: FormGroup;

  submitted = false

  // Construtor para a montagem do formulário
  constructor(private fb: FormBuilder, private service: CursosService, private location: Location, private route: ActivatedRoute) { }

  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {

      this.route.params
      .pipe(
        map((params: any) => params['id']),
        switchMap(id => this.service.loadByID(id))
      )
      .subscribe(curso => this.updateForm(curso));
        
    this.form = this.fb.group({
      id: [null],
      nome:[null, [Validators.required, Validators.minLength(3), Validators.maxLength(250)]]
    });
  }

  updateForm(curso) {
    this.form.patchValue({
      id: curso.id,
      nome: curso.nome
    })
  }

  hasError(field: string) {
    return this.form.get(field).errors;
  }
  

  onSubmit() {
    this.submitted = true;
    console.log(this.form.value);
    if (this.form.valid) {
      console.log('submit');
      if (this.form.value.id) {
        this.service.update(this.form.value).subscribe(
          success => { 
          alert('Update Completo'),
            this.location.back();
          },
          error => alert('Erro ao atualizar o curso, tente novamente')  
        );
      } else {
        this.service.create(this.form.value).subscribe(
          success => { 
            alert('Curso criado com sucesso!!'),
            this.location.back();
          },
          error => alert(error)  
        );
      }

    }

  }

  onCancel() {
    this.submitted = false;
    this.form.reset();
   console.log('onCancel');
  }
}
