import { Component, OnInit } from '@angular/core';
import {MatDialog,MatDialogConfig}from '@angular/material/dialog';
import { AddVoitureComponent } from './../add-voiture/add-voiture.component';
import { VoitureService } from 'src/app/service/voiture.service';
import { MatTableDataSource, MatSort, MatPaginator } from '@angular/material';
import { EditVoitureComponent } from '../edit-voiture/edit-voiture.component';
import {DomSanitizer,SafeUrl,SafeResourceUrl} from '@angular/platform-browser';
@Component({
  selector: 'app-list-voiture',
  templateUrl: './list-voiture.component.html',
  styleUrls: ['./list-voiture.component.scss']
})
export class ListVoitureComponent implements OnInit {
  listData: MatTableDataSource<any>;
  displayedColumns: string[] = ['matricule', 'capacite', 'marque', 'type','image','actions'];
   sort: MatSort;
  paginator: MatPaginator;
  searchKey: string;
  public data = [];
  public page = this.data.length;
  imgURL: any;
  constructor(private matDialog:MatDialog,
    private sanitizer :DomSanitizer,
    private voitureService:VoitureService) { 
      this.imgURL ="D:/dev/mohamed/ppe/agencedevoyageBack/src/main/resources/upload/";
    }

  ngOnInit() {
    this.refershVoitureList();
  }

  onCreate(){
    const DialogConfig = new MatDialogConfig();
    DialogConfig.disableClose=true;
    DialogConfig.autoFocus=true;
    DialogConfig.width="40%";
    this.matDialog.open(AddVoitureComponent,DialogConfig);
  }
  onEdit(row){
  
    const DialogConfig = new MatDialogConfig();
    DialogConfig.disableClose=true;
    DialogConfig.autoFocus=true;
    DialogConfig.width="40%";
    DialogConfig.data=row;
    this.matDialog.open(EditVoitureComponent,DialogConfig); 
    this.matDialog.afterAllClosed.subscribe(result => {
      this.refershVoitureList();
    });
    
  }
  refershVoitureList(){
    this.voitureService.getVoitureList().subscribe((results) =>  {
      this.data = results;
      this.listData = new MatTableDataSource(this.data);
      console.log("data =" + JSON.stringify(results));
      console.log("nb "+this.data.length);
    })
  }
  onDelete(matricule){
    console.log(matricule);
    //this.clientservice.onDelete(id);
    //this.refershClientList();
    //console.log("delete");
    this.voitureService.onDelete(matricule)
      .subscribe(
        data => {
          console.log(data);
          this.refershVoitureList();
        },
        error => console.log(error));
    }
}
