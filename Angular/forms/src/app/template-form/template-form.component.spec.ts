// Importando as bibliotecas, ComponentFixture, async e TestBest @angular/core/testing direto do angular
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

//Importamdo os componetes do aplicação que serão testados
import { TemplateFormComponent } from './template-form.component';

/*
 * Funções que pegam os atributos dos componentes criados e os atribui
 * nesse componete de teste
*/
describe('TemplateFormComponent', () => {
  let component: TemplateFormComponent;
  let fixture: ComponentFixture<TemplateFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TemplateFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplateFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
