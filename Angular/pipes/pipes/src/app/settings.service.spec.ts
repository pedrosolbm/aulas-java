// Importando a biblioteca TestBest @angular/core/testing direto do angular
import { TestBed } from '@angular/core/testing';

//Importamdo os serviços da aplicação que serão utilizados abaixo
import { SettingsService } from './settings.service';

/*
 * Função que pega os atributos dos componentes criados e os atribui
 * nesse componete de teste
*/
describe('SettingsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SettingsService = TestBed.get(SettingsService);
    expect(service).toBeTruthy();
  });
});
