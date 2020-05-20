import { NgModule, Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { ListClientComponent } from './component/Client/list-client/list-client.component';
import { ListVoitureComponent } from './component/voiture/list-voiture/list-voiture.component';
import { ListReservationComponent } from './component/Reservation/list-reservation/list-reservation.component';
import { AddReservationComponent } from './component/Reservation/add-reservation/add-reservation.component';

const routes: Routes = [
  { path: 'listClient', component:ListClientComponent },
  { path: 'listVoiture', component: ListVoitureComponent },
  { path: 'listReservation', component: ListReservationComponent },
  { path: 'addReservation', component: AddReservationComponent },

];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes),CommonModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
