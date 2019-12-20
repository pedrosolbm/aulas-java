// Importando os serviços ElementRef e Rederer2 de @angular/core para manipular a DOM
import { Directive, ElementRef, Renderer2 } from '@angular/core';

// Utilizando Directive para dizer qual o Selectot dessa Diretiva
@Directive({
  selector: 'p[appFundoAmarelo]'
})

// Função para iniar os serviços chamados no Import
export class FundoAmareloDirective {

  // contructor que chama os serviços e injeta eles em variaveis
  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2
    ) {

         // método para atribuir/ incrementar qual estilo sera utilizado no elemento no DOM
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'yellow');
  }
}
