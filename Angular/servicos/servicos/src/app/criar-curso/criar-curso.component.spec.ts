// Importando as classes das bibliotecas ComponetFixture , async e TestBest, 
// @angular/core/testing direto do angular 
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

//Importando as funções do serviço criar-cursos.component
import { CriarCursoComponent } from './criar-curso.component';

/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('CriarCursoComponent', () => {
  let component: CriarCursoComponent;
  let fixture: ComponentFixture<CriarCursoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CriarCursoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CriarCursoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
