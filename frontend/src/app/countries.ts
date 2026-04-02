import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Country } from './country.model';

@Injectable({
  providedIn: 'root'
})
export class CountriesService {

  private apiUrl = 'http://localhost:8080/countries';

  constructor(private http: HttpClient) {}

  getCountries(): Observable<Country[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
}
