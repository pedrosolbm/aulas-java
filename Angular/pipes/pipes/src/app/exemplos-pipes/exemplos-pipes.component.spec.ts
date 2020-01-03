// Importando as bibliotecas, ComponentFixture, async e TestBest @angular/core/testing direto do angular
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

//Importamdo os componetes do aplicação que serão testados
import { ExemplosPipesComponent } from './exemplos-pipes.component';

/*
 * Funções que pegam os atributos dos componentes criados e os atribui
 * nesse componete de teste
*/
describe('ExemplosPipesComponent', () => {
  let component: ExemplosPipesComponent;
  let fixture: ComponentFixture<ExemplosPipesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExemplosPipesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExemplosPipesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
