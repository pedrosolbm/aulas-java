// Importando um componente da biblioteca @angular/core direto do angular 
import { Component } from '@angular/core';

// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

// Método para utlizar essas funções no template
export class AppComponent {
  title = 'primeiro-projeto';
}
