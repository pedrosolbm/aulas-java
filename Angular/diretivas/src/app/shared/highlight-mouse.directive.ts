
import { Directive, HostListener, ElementRef, Renderer2, HostBinding } from '@angular/core';

@Directive({
  selector: '[appHighlightMouse]'
})
export class HighlightMouseDirective {

  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2) { }
    private backgroundColor;

  @HostListener('mouseenter') onMouseOver() {
      this.backgroundColor = 'yellow';
  }

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
