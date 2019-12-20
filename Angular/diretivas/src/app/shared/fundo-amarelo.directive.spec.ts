//Importando a diretiva que será testada
import { FundoAmareloDirective } from './fundo-amarelo.directive';

/* 
 * Função que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('FundoAmareloDirective', () => {
  it('should create an instance', () => {
    const directive = new FundoAmareloDirective();
    expect(directive).toBeTruthy();
  });
});
