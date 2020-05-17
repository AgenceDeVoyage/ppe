import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { AppComponent } from './app.component';
import { AddClientComponent } from './component/Client/add-client/add-client.component';
import { ListClientComponent } from './component/Client/list-client/list-client.component';
import { ListReservationComponent } from './component/Reservation/list-reservation/list-reservation.component';
import { AddReservationComponent } from './component/Reservation/add-reservation/add-reservation.component';
import { AddVoitureComponent } from './component/voiture/add-voiture/add-voiture.component';
import { ListVoitureComponent } from './component/voiture/list-voiture/list-voiture.component';
import {ClientService} from './service/client.service';
import {VoitureService} from './service/voiture.service';
import {ReservationService} from './service/reservation.service';
// import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { MatDialogModule, MatDialogRef} from '@angular/material';
import {MatFormFieldModule} from '@angular/material/form-field';
import {HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule,FormsModule } from '@angular/forms';
import { FileUploadModule } from 'ng2-file-upload';
import {MatTableModule} from '@angular/material/table';
import { DatePipe } from '@angular/common';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatInputModule} from '@angular/material';
import { EditClientComponent } from './component/Client/edit-client/edit-client.component';
import { AppRoutingModule } from './app-routing.module';
import { EditVoitureComponent } from './component/voiture/edit-voiture/edit-voiture.component';

@NgModule({
  declarations: [
    AppComponent,
    AddClientComponent,
    ListClientComponent,
    ListReservationComponent,
    AddReservationComponent,
    AddVoitureComponent,
    ListVoitureComponent,
    EditClientComponent,
    EditVoitureComponent,
    
    
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    NoopAnimationsModule,
    MatDialogModule,
    MatFormFieldModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    FileUploadModule,
    MatTableModule,
    MatButtonModule,
    MatIconModule,
    MatPaginatorModule,MatInputModule, AppRoutingModule,
    

  ],
  providers: [ClientService,VoitureService,ReservationService,DatePipe,ListClientComponent],
  bootstrap: [AppComponent],
  entryComponents:[AddVoitureComponent,AddClientComponent,EditClientComponent,EditVoitureComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA ] 
})
export class AppModule { }
