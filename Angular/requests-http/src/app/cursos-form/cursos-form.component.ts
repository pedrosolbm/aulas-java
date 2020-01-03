import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CursosService } from '../cursos/cursos.service';
import { Location } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { map, switchMap, exhaustMap } from 'rxjs/operators';

@Component({
  selector: 'app-cursos-form',
  templateUrl: './cursos-form.component.html',
  styleUrls: ['./cursos-form.component.css']
})
export class CursosFormComponent implements OnInit {

  form: FormGroup;

  submitted = false

  constructor(private fb: FormBuilder, private service: CursosService, private location: Location, private route: ActivatedRoute) { }


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
