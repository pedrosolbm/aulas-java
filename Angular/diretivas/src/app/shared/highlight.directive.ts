import { OnInit } from '@angular/core';

import { Directive, HostListener, HostBinding, Input } from '@angular/core';


@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

    private backgroundColor;

    @Input() defaultColor = 'white';
    @Input('appHighlight') highlightColor = 'yellow';

  @HostListener('mouseenter') onMouseOver() {
      this.backgroundColor = this.highlightColor;
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.backgroundColor = this.defaultColor;
}


// SE NÃO PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
/* @HostBinding('style.backgroundColor') backgroundColor: string; */

// SE PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
@HostBinding('style.backgroundColor') get setColor() {
  return this.backgroundColor;
}

constructor() {}

ngOnInit() {
  this.backgroundColor = this.defaultColor;
}


}
