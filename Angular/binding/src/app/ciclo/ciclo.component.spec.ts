// Importando a biblioteca async, ComponentFixure e TestBest @angular/core/testing direto do angular 
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

// Importando o componente output-property.component da pasta
import { CicloComponent } from './ciclo.component';

/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('CicloComponent', () => {
  let component: CicloComponent;
  let fixture: ComponentFixture<CicloComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CicloComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CicloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
