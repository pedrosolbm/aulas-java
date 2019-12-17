// Importando a biblioteca async, ComponentFixure e TestBest @angular/core/testing direto do angular 
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

// Importando o componente output-property.component da pasta
import { DataBindingComponent } from './data-binding.component';

describe('DataBindingComponent', () => {
  let component: DataBindingComponent;
  let fixture: ComponentFixture<DataBindingComponent>;

/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DataBindingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DataBindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
