// Importando um componente da biblioteca @angular/core direto do angular 
import { Component } from '@angular/core';

//importando a biblioteca do NgBootstrap de @ng-bootstrap/ng-bootstrap
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

// Utilizando o componente e referênciando Selector e qual o template
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

// Método para utlizar/exportar essas funções no template
export class AppComponent {
  title = 'diretivas';
}