import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Voiture } from '../models/voiture';
@Injectable({
  providedIn: 'root'
})
export class VoitureService {
  readonly apiUrl= ' http://localhost:8089/Voiture';
  constructor(private http: HttpClient) { }
  getVoitureList():Observable<Voiture[]>{
    return this.http.get<Voiture[]>(this.apiUrl +'/get/');
  }
  onCreate(v :Voiture){
   /*  const formdata: FormData = new FormData();  
    formdata.append( 'matricule',matricule);   
    formdata.append( 'marque',marque);
    formdata.append( 'type',type);
    formdata.append( 'capacite',capacite);
    formdata.append('image', image);  

    const obj = {
      "matricule": matricule,
      "marque": marque,
      "type": type, 
      "capacite": capacite,
      "image": image
     }; */
     console.log("service"+v);
     this.http.post('this.apiUrl/add',v);
  }
  onDelete(id:number){
    return this.http.delete(this.apiUrl+'/delete/'+id);
  }
  onEdit(id, nom, prenom,mail){
    const obj = {
      "id" :id,
      "nom": nom,
      "prenom": prenom, 
      "mail": mail
         };
     this.http.put(`${this.apiUrl}/edit`, obj,{
      observe:'events' 
     })
       .subscribe(event => console.log(event));
  }

}
