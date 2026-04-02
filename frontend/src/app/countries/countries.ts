import { CountriesService } from '../countries';
import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Country } from '../country.model';

@Component({
  selector: 'app-countries',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './countries.html'
})
export class Countries implements OnInit {

  countries: Country[] = [];

  constructor(private countriesService: CountriesService) {}

  ngOnInit(): void {
    this.countriesService.getCountries().subscribe(data => {
      this.countries = data;
    });
  }
}
