import {Component, OnInit, ViewChild} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import { CrudService } from 'src/app/service/crud.service';
import {MatDialog,MatDialogConfig}from '@angular/material/dialog';
import { MatTableDataSource, MatSort } from '@angular/material';
import { AddReservationComponent } from './../../Reservation/add-reservation/add-reservation.component';

@Component({
  selector: 'app-list-reservation',
  templateUrl: './list-reservation.component.html',
  styleUrls: ['./list-reservation.component.scss']
})
export class ListReservationComponent implements OnInit {
  listData: MatTableDataSource<any>;
  displayedColumns: string[] = ['id', 'nom', 'Matricule', 'dateReservation','dateRetour','actions'];
   sort: MatSort;
  paginator: MatPaginator;
  searchKey: string;
  public data = [];
  readonly apiUrl= ' http://localhost:8089/Reservation';

  constructor(private CrudService:CrudService,
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
     onCreate(){
      const DialogConfig = new MatDialogConfig();
      DialogConfig.disableClose=true;
      DialogConfig.autoFocus=true;
      DialogConfig.width="40%";
      this.matDialog2.open(AddReservationComponent,DialogConfig);
      this.matDialog2.afterAllClosed.subscribe(result => {
        this.refershClientList();
      });
    }
  
    onDelete(id){
      this.CrudService.delete(this.apiUrl,id)
        .subscribe(
          data => {
            console.log(data);
            this.refershClientList();
          },
          error => console.log(error));
      }
}
