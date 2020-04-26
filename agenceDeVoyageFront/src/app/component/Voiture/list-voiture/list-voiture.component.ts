import { Component, OnInit } from '@angular/core';
import { AddVoitureComponent } from './../add-voiture/add-voiture.component';
import { VoitureService } from 'src/app/service/voiture.service';
@Component({
  selector: 'app-list-voiture',
  templateUrl: './list-voiture.component.html',
  styleUrls: ['./list-voiture.component.scss']
})
export class ListVoitureComponent implements OnInit {
  displayedColumns: string[] = ['matricule', 'capacite', 'marque', 'type','image','actions'];
  searchKey: string;
  public data = [];
  public page = this.data.length;
  constructor(
    private voitureService:VoitureService) { }

  ngOnInit() {
  }

 
}
