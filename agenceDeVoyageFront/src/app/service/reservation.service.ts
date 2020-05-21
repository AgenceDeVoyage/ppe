import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class ReservationService {
  readonly apiUrl= ' http://localhost:8089/Reservation';

  constructor(private http: HttpClient) { }
  delete(id:number){
    return this.http.delete(this.apiUrl+'/delete/'+id);
  }
}
