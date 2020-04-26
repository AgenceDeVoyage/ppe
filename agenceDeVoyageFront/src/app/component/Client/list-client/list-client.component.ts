import { Component, OnInit,ViewChild  } from '@angular/core';
import { ClientService } from 'src/app/service/client.service';
import { AddClientComponent } from './../add-client/add-client.component';
import { EditClientComponent } from '../edit-client/edit-client.component';
import {CrudService} from '../../../service/crud.service';


@Component({
  selector: 'app-list-client',
  templateUrl: './list-client.component.html',
  styleUrls: ['./list-client.component.scss']
})
export class ListClientComponent implements OnInit {
  readonly apiUrl= ' http://localhost:8089/Client';
  data = [];
  constructor(private CrudService:CrudService,
     ) { }
     getList(){
      return this.CrudService.getList(this.apiUrl).subscribe(result => {this.data=result,console.log("data =",this.data);});
     }
     test(id){
       console.log(id);
     }

  ngOnInit() {
    this.getList();
    
  }
  
  
  
  

}
