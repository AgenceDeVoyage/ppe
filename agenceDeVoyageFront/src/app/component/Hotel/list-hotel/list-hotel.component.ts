import { Component, OnInit } from '@angular/core';
import {MatDialog,MatDialogConfig}from '@angular/material/dialog';
import { AddHotelComponent } from './../add-hotel/add-hotel.component';
import { EditHotelComponent } from './../edit-hotel/edit-hotel.component';
import { CrudService } from 'src/app/service/crud.service';
import { MatTableDataSource, MatSort, MatPaginator } from '@angular/material';
@Component({
  selector: 'app-list-hotel',
  templateUrl: './list-hotel.component.html',
  styleUrls: ['./list-hotel.component.scss']
})
export class ListHotelComponent implements OnInit {

  listData: MatTableDataSource<any>;
  displayedColumns: string[] = ['IdHotel', 'Nom','Adresse', 'Mail', 'NbEtoile','image','actions'];
   sort: MatSort;
  paginator: MatPaginator;
  searchKey: string;
  public data = [];
  readonly apiUrl= ' http://localhost:8089/Hotel';

 
  /* constructor(private CrudService:CrudService,
    private matDialog:MatDialog,private matDialog2:MatDialog ) { 
      this.matDialog.afterAllClosed.subscribe(result => {
        this.refershHotelList();
      });
      this.matDialog2.afterAllClosed.subscribe(result => {
        this.refershHotelList();
      });
    }

  ngOnInit() {
    this.refershHotelList();
    this.matDialog.afterAllClosed.subscribe(result => {
      this.refershHotelList();
    });
    this.matDialog2.afterAllClosed.subscribe(result => {
      this.refershHotelList();
    });
    
  }
  refershHotelList(){
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
    DialogConfig.width="40%";
    this.matDialog2.open(AddHotelComponent,DialogConfig);
    this.matDialog2.afterAllClosed.subscribe(result => {
      this.refershHotelList();
    });
  } */

  constructor(private CrudService:CrudService,
    private matDialog:MatDialog,private matDialog2:MatDialog ) { 
      this.matDialog.afterAllClosed.subscribe(result => {
        this.refershHotelList();
      });
      this.matDialog2.afterAllClosed.subscribe(result => {
        this.refershHotelList();
      });
    }

    ngOnInit() {
      this.refershHotelList();
      this.matDialog.afterAllClosed.subscribe(result => {
        this.refershHotelList();
      });
      this.matDialog2.afterAllClosed.subscribe(result => {
        this.refershHotelList();
      });
      
    }
    refershHotelList(){
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
    DialogConfig.width="40%";
    this.matDialog.open(AddHotelComponent,DialogConfig);
  }
  onEdit(row){
  
    const DialogConfig = new MatDialogConfig();
    DialogConfig.disableClose=true;
    DialogConfig.autoFocus=true;
    DialogConfig.width="40%";
    DialogConfig.data=row;
    this.matDialog.open(EditHotelComponent,DialogConfig); 
    this.matDialog.afterAllClosed.subscribe(result => {
      this.refershHotelList();
    });
    
  }
    
  
  

  onDelete(idHotel){
    this.CrudService.delete(this.apiUrl,idHotel)
      .subscribe(
        data => {
          console.log(data);
          this.refershHotelList();
        },
        error => console.log(error));
    }

  
}


















 
 
   
    
  



