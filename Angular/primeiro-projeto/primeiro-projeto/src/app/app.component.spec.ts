
// Importando a biblioteca async e TestBest @angular/core/testing direto do angular 
import { async, TestBed } from '@angular/core/testing';

// Importando as rotas a serem atribuidas no modulo testing
import { RouterTestingModule } from '@angular/router/testing';

//Importamdo os componetes do aplicação
import { AppComponent } from './app.component';


/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'primeiro-projeto'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('primeiro-projeto');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('.content span').textContent).toContain('primeiro-projeto app is running!');
  });
});
