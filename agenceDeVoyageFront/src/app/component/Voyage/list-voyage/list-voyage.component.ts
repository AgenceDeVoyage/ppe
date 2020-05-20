import { Component, OnInit } from '@angular/core';
import {MatDialog,MatDialogConfig}from '@angular/material/dialog';
import { AddVoyageComponent } from './../add-voyage/add-voyage.component';
import { EditVoyageComponent } from './../edit-voyage/edit-voyage.component';
import { CrudService } from 'src/app/service/crud.service';
import { MatTableDataSource, MatSort, MatPaginator } from '@angular/material';

@Component({
  selector: 'app-list-voyage',
  templateUrl: './list-voyage.component.html',
  styleUrls: ['./list-voyage.component.scss']
})
export class ListVoyageComponent implements OnInit {
  listData: MatTableDataSource<any>;
  displayedColumns: string[] = ['Id','Nom','Description','TarifP','TarifBc','TarifNc','Nb','image','actions'];
   sort: MatSort;
  paginator: MatPaginator;
  searchKey: string;
  public data = [];
  readonly apiUrl= ' http://localhost:8089/Voyage';

  constructor(private CrudService:CrudService,
    private matDialog:MatDialog,private matDialog2:MatDialog ) { 
      this.matDialog.afterAllClosed.subscribe(result => {
        this.refershVoyageList();
      });
      this.matDialog2.afterAllClosed.subscribe(result => {
        this.refershVoyageList();
      });
    }

    ngOnInit() {
      this.refershVoyageList();
      this.matDialog.afterAllClosed.subscribe(result => {
        this.refershVoyageList();
      });
      this.matDialog2.afterAllClosed.subscribe(result => {
        this.refershVoyageList();
      });
      
    }
    refershVoyageList(){
      this.CrudService.getList(this.apiUrl).subscribe((results) =>  {
        this.data = results;
        this.listData = new MatTableDataSource(this.data);
        console.log("data =" + JSON.stringify(results));
        console.log("nb "+this.data.length);
      })
      
    }
    onSearchClear() {
      this.searchKey = "";
      this.applyFilter();
    }
  
    applyFilter() {
      this.listData.filter = this.searchKey.trim().toLowerCase();
    }
     getList(){
      return this.CrudService.getList(this.apiUrl).subscribe(result => {this.data=result,console.log("data =",this.data);});
     }
     test(id){
       console.log(id);
     }

  onCreate(){
    const DialogConfig = new MatDialogConfig();
    DialogConfig.disableClose=true;
    DialogConfig.autoFocus=true;
    DialogConfig.width="35%";
    DialogConfig.height="90%";

    this.matDialog.open(AddVoyageComponent,DialogConfig);
  }
  onEdit(row){
  
    const DialogConfig = new MatDialogConfig(); 
    DialogConfig.disableClose=true;
    DialogConfig.autoFocus=true;
    DialogConfig.width="35%";
    DialogConfig.height="90%";
    DialogConfig.data=row;
    this.matDialog.open(EditVoyageComponent,DialogConfig); 
    this.matDialog.afterAllClosed.subscribe(result => {
      this.refershVoyageList();
    });
    
  }
    
  
  

  onDelete(id){
    this.CrudService.delete(this.apiUrl,id)
      .subscribe(
        data => {
          console.log(data);
          this.refershVoyageList();
        },
        error => console.log(error));
    }

  
}








