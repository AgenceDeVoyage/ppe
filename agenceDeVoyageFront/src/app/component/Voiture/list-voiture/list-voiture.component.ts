import { Component, OnInit } from '@angular/core';
import {MatDialog,MatDialogConfig}from '@angular/material/dialog';
import { AddVoitureComponent } from '../add-voiture/add-voiture.component';
import { MatTableDataSource, MatSort, MatPaginator } from '@angular/material';
import { EditVoitureComponent } from '../edit-voiture/edit-voiture.component';
import { CrudService } from 'src/app/service/crud.service';
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
  readonly apiUrl= ' http://localhost:8089/Voiture';

 
  constructor(private matDialog:MatDialog,
    private CrudService :CrudService) { }

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
    this.CrudService.getList(this.apiUrl).subscribe((results) =>  {
      this.data = results;
      this.listData = new MatTableDataSource(this.data);
      console.log("data =" + JSON.stringify(results));
      console.log("nb "+this.data.length);
    })
  }
  onDelete(matricule){
    this.CrudService.delete(this.apiUrl,matricule)
      .subscribe(
        data => {
          console.log(data);
          this.refershVoitureList();
        },
        error => console.log(error));
    }

}
