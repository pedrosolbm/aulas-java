// Importando os componentes da biblioteca @angular/core direto do angular 
import { Component, OnInit, Input, Output, EventEmitter, ViewChild, ElementRef} from '@angular/core';

// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-contador',
  // Template da página 
  templateUrl: './output-property.component.html',
  // Estilo que será usado nessa página
  styleUrls: ['./output-property.component.css']
})

// Método para utlizar essas funções no template
export class OutputPropertyComponent implements OnInit {

  @Input() valor = 0;

  @Output() mudouValor: any = new EventEmitter();

  @ViewChild('campoInput', {static: true}) campoValorInput: ElementRef;

//lógica para decrementar os valores digitados
  incrementa() {
    this.campoValorInput.nativeElement.value++;
    this.mudouValor.emit({novoValor: this.valor});
  }
// lógica para decrementar os valores digitados
  decrementa() {
    this.campoValorInput.nativeElement.value--;
    this.mudouValor.emit({novoValor: this.valor});
  }

  //Implementa um construtor
  constructor() { }
  //métodos ngOnInit para carregar elemetos na página quando ela iniciar
  ngOnInit() {
  }

}
