//Importando a diretiva que será testada
import { HighlightDirective } from './highlight.directive';

/* 
 * Função que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('HighlightDirective', () => {
  it('should create an instance', () => {
    const directive = new HighlightDirective();
    expect(directive).toBeTruthy();
  });
});
