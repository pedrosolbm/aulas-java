// Importando a biblioteca async, ComponentFixure e TestBest @angular/core/testing direto do angular
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

// Importando o componente output-property.component da pasta 
import { InputPropertyComponent } from './input-property.component';

/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('InputPropertyComponent', () => {
  let component: InputPropertyComponent;
  let fixture: ComponentFixture<InputPropertyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InputPropertyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InputPropertyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
