import { Component, OnInit,ViewChild  } from '@angular/core';
import { MatTableDataSource, MatSort, MatPaginator,MatDialogRef } from '@angular/material';
import { ClientService } from 'src/app/service/client.service';
import {MatDialog,MatDialogConfig}from '@angular/material/dialog';
import { AddClientComponent } from './../add-client/add-client.component';
import { EditClientComponent } from '../edit-client/edit-client.component';


@Component({
  selector: 'app-list-client',
  templateUrl: './list-client.component.html',
  styleUrls: ['./list-client.component.scss']
})
export class ListClientComponent implements OnInit {
  listData: MatTableDataSource<any>;
  displayedColumns: string[] = ['id', 'mail', 'nom', 'prenom','actions'];
   sort: MatSort;
  paginator: MatPaginator;
  searchKey: string;
  public data = [];

  constructor(private clientservice:ClientService,
    private matDialog:MatDialog,private matDialog2:MatDialog ) { 
      this.matDialog.afterAllClosed.subscribe(result => {
        this.refershClientList();
      });
      this.matDialog2.afterAllClosed.subscribe(result => {
        this.refershClientList();
      });
    }

  ngOnInit() {
    this.refershClientList();
    this.matDialog.afterAllClosed.subscribe(result => {
      this.refershClientList();
    });
    this.matDialog2.afterAllClosed.subscribe(result => {
      this.refershClientList();
    });
    
  }
  refershClientList(){
    this.clientservice.getClientList().subscribe((results) =>  {
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
  onCreate(){
    const DialogConfig = new MatDialogConfig();
    DialogConfig.disableClose=true;
    DialogConfig.autoFocus=true;
    DialogConfig.width="40%";
    this.matDialog2.open(AddClientComponent,DialogConfig);
    this.matDialog2.afterAllClosed.subscribe(result => {
      this.refershClientList();
    });
  }
  onEdit(id,nom,prenom,mail){
    const obj = {
      "id" :id,
      "nom": nom,
      "prenom": prenom, 
      "mail": mail
         };
    const DialogConfig = new MatDialogConfig();
    DialogConfig.disableClose=true;
    DialogConfig.autoFocus=true;
    DialogConfig.width="40%";
    DialogConfig.data=obj;
    this.matDialog.open(EditClientComponent,DialogConfig); 
    this.matDialog.afterAllClosed.subscribe(result => {
      this.refershClientList();
    });
    
  }

  onDelete(id){
    this.clientservice.onDelete(id)
      .subscribe(
        data => {
          console.log(data);
          this.refershClientList();
        },
        error => console.log(error));
    }
 

}
