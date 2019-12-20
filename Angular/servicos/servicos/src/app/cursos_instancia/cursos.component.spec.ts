// Importando as classes das bibliotecas ComponetFixture , async e TestBest, 
// @angular/core/testing direto do angular 

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

//Importando as funções do serviço cursos.component
import { CursosComponent } from './cursos.component';

/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('CursosComponent', () => {
  let component: CursosComponent;
  let fixture: ComponentFixture<CursosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CursosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CursosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
