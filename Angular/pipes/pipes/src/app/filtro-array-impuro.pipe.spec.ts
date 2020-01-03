// Importando as funções que serão testadas de './filtro-array-impuro.pipe'
import { FiltroArrayImpuroPipe } from './filtro-array-impuro.pipe';

/*
 * Função que pega os atributos dos componentes criados e os atribui
 * nesse componete de teste
*/
describe('FiltroArrayImpuroPipe', () => {
  it('create an instance', () => {
    const pipe = new FiltroArrayImpuroPipe();
    expect(pipe).toBeTruthy();
  });
});
