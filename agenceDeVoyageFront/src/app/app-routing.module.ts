import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddClientComponent } from './component/Client/add-client/add-client.component';
import { ListClientComponent } from './component/Client/list-client/list-client.component';
import { ListReservationComponent } from './component/Reservation/list-reservation/list-reservation.component';
import { AddReservationComponent } from './component/Reservation/add-reservation/add-reservation.component';
import { AddVoitureComponent } from './component/voiture/add-voiture/add-voiture.component';
import { ListVoitureComponent } from './component/voiture/list-voiture/list-voiture.component';
import {ClientService} from './service/client.service';
import {VoitureService} from './service/voiture.service';
import {ReservationService} from './service/reservation.service';

const routes: Routes = [
  { path: 'List-Client-Component', component: ListClientComponent },
  { path: 'List-Voiture-Component', component: ListVoitureComponent },
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
