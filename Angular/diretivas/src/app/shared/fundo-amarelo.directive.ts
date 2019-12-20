import { Directive, ElementRef, Renderer2 } from '@angular/core';


@Directive({
  selector: 'p[appFundoAmarelo]'
})
export class FundoAmareloDirective {

  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2
    ) {

    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'yellow');
  }
}
