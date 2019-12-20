/**
 * Importando os serviços ElementRef e Rederer2 de @angular/core para manipular a DOM,
 * HostListener para  escutar e fornece um método manipulador para executar quando esse 
 * evento ocorrer e HostBinding que marca uma propriedade DOM como uma propriedade de 
 * ligação ao host e fornece as informações
 * 
 */
import { Directive, HostListener, ElementRef, Renderer2, HostBinding } from '@angular/core';

// Utilizando Directive para dizer qual o Selectot dessa Diretiva
@Directive({
  selector: '[appHighlightMouse]'
})

// Função para iniar os serviços chamados no Import
export class HighlightMouseDirective {

  // contructor que chama os serviços e injeta eles em variaveis
  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2) { }
    private backgroundColor;

  // Utilizando um evento para HostListener e atribuindo o resultado "yellow"
  @HostListener('mouseenter') onMouseOver() {
      this.backgroundColor = 'yellow';
  }
  // Utilizando um evento para HostListener e atribuindo o resultado "white"
  @HostListener('mouseleave') onMouseLeave() {
    this.backgroundColor = 'white';
}

// SE NÃO PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
/* @HostBinding('style.backgroundColor') backgroundColor: string; */

// // SE PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
@HostBinding('style.backgroundColor') get setColor() {
  return this.backgroundColor;
}

}
