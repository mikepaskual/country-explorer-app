import { Component } from '@angular/core';
import { Countries } from './countries/countries';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Countries],
  template: `<app-countries></app-countries>`
})
export class App {}
