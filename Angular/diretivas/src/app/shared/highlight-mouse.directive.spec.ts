//Importando a diretiva que será testada
import { HighlightMouseDirective } from './highlight-mouse.directive';

/* 
 * Função que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('HighlightMouseDirective', () => {
  it('should create an instance', () => {
    const directive = new HighlightMouseDirective();
    expect(directive).toBeTruthy();
  });
});
