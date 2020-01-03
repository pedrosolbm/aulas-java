// importando a CamelCasePipe que será usada para testes
import { CamelCasePipe } from './camel-case.pipe';

/*
 * Funções que pegam os atributos dos componentes criados e os atribui
 * nesse componete de teste
*/
describe('CamelCasePipe', () => {
  it('create an instance', () => {
    const pipe = new CamelCasePipe();
    expect(pipe).toBeTruthy();
  });
});
