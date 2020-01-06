import { Component, OnInit, ElementRef } from '@angular/core';
@Component({
  selector: 'app-home-logada',
  templateUrl: './home-logada.component.html',
  styleUrls: ['./home-logada.component.css']
})
export class HomeLogadaComponent implements OnInit {
  // statusCliente;
  // saldoCliente;
  // limeteCliente;
  // saldoParcial;
  // valorParcela;
  // saldoBruto;
  // saldoPoupanca;
  getCadastro;
  nameCliente;
  constructor(private el: ElementRef) { }

  ngOnInit() {
    console.log(this.el.nativeElement);
    // this.statusCliente = [
    //   {
    //     saldo: '0,00',
    //     limite: '1.000',
    //     saldoParcial: '0,00',
    //     valorParcela: '250,00',
    //     saldoBruto: '0,00',
    //     saldoPoupanca: '0,00'
    //   }
    // ];
    this.getCadastro = JSON.parse(localStorage.getItem('cadastro'));
    this.nameCliente = this.getCadastro['nome'];
    console.log(this.nameCliente);
  }
  // Criar serviço para consumir
  // pegaSaldo() {
  //   this.statusCliente.forEach(item => {
  //     this.saldoCliente = item.saldo;
  //     console.log(`limite do cliente ${this.saldoCliente}`);
  //   });
  // }
  // pegaLimite() {
  //   this.statusCliente.forEach(item => {
  //     this.limeteCliente = item.limite;
  //     console.log(`limite do cliente ${this.limeteCliente}`);
  //   });
  // }

  // pegasaldoParcial() {
  //   this.statusCliente.forEach(item => {
  //     this.saldoParcial = item.saldoParcial;
  //     console.log(`saldoParcial do cliente ${this.saldoParcial}`);
  //   });
  // }
  // pegavalorParcela() {
  //   this.statusCliente.forEach(item => {
  //     this.valorParcela = item.valorParcela;
  //     console.log(`saldoParcial do cliente ${this.valorParcela}`);
  //   });
  // }
  // pegasaldoBruto() {
  //   this.statusCliente.forEach(item => {
  //     this.saldoBruto = item.saldoBruto;
  //     console.log(`saldoBruto do cliente ${this.saldoBruto}`);
  //   });
  // }
  // pegasaldoPoupanca() {
  //   this.statusCliente.forEach(item => {
  //     this.saldoPoupanca = item.saldoPoupanca;
  //     console.log(`saldoPoupanca do cliente ${this.saldoPoupanca}`);
  //   });
  // }

  // ngAfterContentChecked() {
  //   this.pegaSaldo();
  //   this.pegaLimite();
  //   this.pegasaldoBruto();
  //   this.pegasaldoParcial();
  //   this.pegavalorParcela();
  //   this.pegasaldoPoupanca();
  // }
}
