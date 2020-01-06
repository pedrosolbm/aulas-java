// Import Components
import { AuthService } from './login/auth.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
// Determina como o COMPONENT deve ser processado, instanciado e usado no tempo de execução.
export class AppComponent {
  title = 'app works!';

  mostrarMenu: boolean = false;

  constructor(private authService: AuthService) {

  }

  ngOnInit(){
    this.authService.mostrarMenuEmitter.subscribe(
      mostrar => this.mostrarMenu = mostrar
    );
  }
}
