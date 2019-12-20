// Como usaremos o Input property, precisamos importar

/**
 * Importando os serviços ElementRef e Rederer2 de @angular/core para manipular a DOM,
 * HostListener para  escutar e fornece um método manipulador para executar quando esse 
 * evento ocorrer e HostBinding que marca uma propriedade DOM como uma propriedade de 
 * ligação ao host e fornece as informações
 * 
 */
import { Directive, Input, TemplateRef, ViewContainerRef } from '@angular/core';

// Utilizando Directive para dizer qual o Selectot dessa Diretiva
@Directive({
  // tslint:disable-next-line: directive-selector
  selector: '[ngElse]'
})

// Função para iniar os serviços chamados no Import
export class NgElseDirective {


  // Declarando uma condição para a viewContainerRef realizar açoões na DOM
  @Input() set ngElse(condition: boolean) {
    if (!condition) {
      this.viewContainerRef.createEmbeddedView(this.templateRef);
    } else { 
      this.viewContainerRef.clear();
    }
  }

  // contructor que chama os serviços e injeta eles em variaveis
  constructor(
    private templateRef: TemplateRef<any>,
    private viewContainerRef: ViewContainerRef) { }

}


