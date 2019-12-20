// Importando a biblioteca async e TestBest @angular/core/testing direto do angular 
import { TestBed } from '@angular/core/testing';

// Importando as rotas da diretiva ngIf
import { DiretivaNgifService } from './diretiva-ngif.service';

/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('DiretivaNgifService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DiretivaNgifService = TestBed.get(DiretivaNgifService);
    expect(service).toBeTruthy();
  });
});






