// Importando uma classe da biblioteca TestBest @angular/core/testing direto do angular 
import { TestBed } from '@angular/core/testing';

//Importando as funções do serviço Log.service
import { LogService } from './log.service';

/* 
 * Funções que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('LogService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LogService = TestBed.get(LogService);
    expect(service).toBeTruthy();
  });
});
