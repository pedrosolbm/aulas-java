import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoNaoEncontradaComponent } from './info-nao-encontrada.component';

describe('InfoNaoEncontradaComponent', () => {
  let component: InfoNaoEncontradaComponent;
  let fixture: ComponentFixture<InfoNaoEncontradaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InfoNaoEncontradaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoNaoEncontradaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
