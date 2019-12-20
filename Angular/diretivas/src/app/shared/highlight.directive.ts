// Importando um componente da biblioteca @angular/core direto do angular
import { OnInit } from '@angular/core';

/**
 * Importando os serviços ElementRef e Rederer2 de @angular/core para manipular a DOM,
 * HostListener para  escutar e fornece um método manipulador para executar quando esse 
 * evento ocorrer e HostBinding que marca uma propriedade DOM como uma propriedade de 
 * ligação ao host e fornece as informações
 * 
 */
import { Directive, HostListener, HostBinding, Input } from '@angular/core';

// Utilizando Directive para dizer qual o Selectot dessa Diretiva
@Directive({
  selector: '[appHighlight]'
})

// Função para iniar os serviços chamados no Import
export class HighlightDirective {

    //declarando uma variavel
    private backgroundColor;

    // declarando a variavel e injetando uma cor a ela
    @Input() defaultColor = 'white';

    // realiza o mesmo que a linha anterior porem na varivel ja criada
    @Input('appHighlight') highlightColor = 'yellow'; 

  // Utilizando um evento para HostListener e atribuindo o resultado "yellow" da highlightColor
  @HostListener('mouseenter') onMouseOver() {
      this.backgroundColor = this.highlightColor;
  }

  // Utilizando um evento para HostListener e atribuindo a defaultColor que é "white"
  @HostListener('mouseleave') onMouseLeave() {
    this.backgroundColor = this.defaultColor;
}


// SE NÃO PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
/* @HostBinding('style.backgroundColor') backgroundColor: string; */

// SE PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
@HostBinding('style.backgroundColor') get setColor() {
  return this.backgroundColor;
}


//Implementa um construtor
constructor() {}

//métodos ngOnInit para carregar elemetos na página quando ela iniciar
ngOnInit() {
  this.backgroundColor = this.defaultColor;
}


}
