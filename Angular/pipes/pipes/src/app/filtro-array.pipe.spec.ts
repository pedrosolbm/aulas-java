// Importando as funções que serão testadas de './filtro-array.pipe'
import { FiltroArrayPipe } from './filtro-array.pipe';

/*
 * Função que pega os atributos dos componentes criados e os atribui
 * nesse componete de teste
*/
describe('FiltroArrayPipe', () => {
  it('create an instance', () => {
    const pipe = new FiltroArrayPipe();
    expect(pipe).toBeTruthy();
  });
});
