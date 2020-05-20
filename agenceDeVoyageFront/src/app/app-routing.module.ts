import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ListHotelComponent} from './component/Hotel/list-hotel/list-hotel.component';
import {ListVoyageComponent  } from './component/Voyage/list-voyage/list-voyage.component';
import { Routes, RouterModule } from '@angular/router';
import { ListClientComponent } from './component/Client/list-client/list-client.component';
import { ListVoitureComponent } from './component/voiture/list-voiture/list-voiture.component';
import { ListReservationComponent } from './component/Reservation/list-reservation/list-reservation.component';


const routes: Routes = [
  { path: 'listHotel', component:ListHotelComponent },
  { path: 'listVoyage', component: ListVoyageComponent },
  { path: 'listClient', component:ListClientComponent },
  { path: 'listVoiture', component: ListVoitureComponent },
  { path: 'listReservation', component: ListReservationComponent },
 
];




@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes),CommonModule 
  ]
})
export class AppRoutingModule { }
