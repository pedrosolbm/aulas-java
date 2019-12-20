// Importando as classes das bibliotecas ComponetFixture , async e TestBest, 
// @angular/core/testing direto do angular 
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

//Importando as funções do serviço receber-curso-criado.component
import { ReceberCursoCriadoComponent } from './receber-curso-criado.component';

/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('ReceberCursoCriadoComponent', () => {
  let component: ReceberCursoCriadoComponent;
  let fixture: ComponentFixture<ReceberCursoCriadoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReceberCursoCriadoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReceberCursoCriadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
