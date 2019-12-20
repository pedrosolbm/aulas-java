// Importando uma classe da biblioteca @angular/core direto do angular 
import { Component } from '@angular/core';

// Utilizando o componente e referênciando Selector, qual o template e qual estilo sera usado
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

// Método para utlizar/exportar essas funções no template
export class AppComponent {
  title = 'servicos';
}
