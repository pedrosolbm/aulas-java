/*
  Arquivo para testes na aplcação / servidor 
*/

// Importando a biblioteca async, ComponentFixure e TestBest @angular/core/testing direto do angular 
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

// Importando o componente meu-primeiro2 da pasta 
import { MeuPrimeiro2Component } from './meu-primeiro2.component';


describe('MeuPrimeiro2Component', () => {
  let component: MeuPrimeiro2Component;
  let fixture: ComponentFixture<MeuPrimeiro2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MeuPrimeiro2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MeuPrimeiro2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
