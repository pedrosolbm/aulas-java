// Como usaremos o Input property, precisamos importar
import { Directive, Input, TemplateRef, ViewContainerRef } from '@angular/core';

@Directive({
  // tslint:disable-next-line: directive-selector
  selector: '[ngElse]'
})
export class NgElseDirective {


  @Input() set ngElse(condition: boolean) {
    if (!condition) {
      this.viewContainerRef.createEmbeddedView(this.templateRef);
    } else { 
      this.viewContainerRef.clear();
    }
  }

  constructor(
    private templateRef: TemplateRef<any>,
    private viewContainerRef: ViewContainerRef) { }

}


