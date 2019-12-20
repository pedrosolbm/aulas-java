//Importando a diretiva que será testada
import { NgElseDirective } from './ng-else.directive';

/* 
 * Função que pegam os atributos dos componentes criados e os atribui 
 * nesse componete de teste 
*/
describe('NgElseDirective', () => {
  it('should create an instance', () => {
    const directive = new NgElseDirective();
    expect(directive).toBeTruthy();
  });
});
