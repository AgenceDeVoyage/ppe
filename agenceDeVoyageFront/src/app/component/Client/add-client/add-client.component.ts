import { Component, OnInit, Inject } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material';
import { from } from 'rxjs';
import { Router } from '@angular/router';
import { Client } from 'src/app/models/client';

import { CrudService } from 'src/app/service/crud.service';

@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrls: ['./add-client.component.scss']
})

export class AddClientComponent implements OnInit {
  angForm: FormGroup;
  readonly apiUrl= ' http://localhost:8089/Client';


  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<AddClientComponent>,
    private CrudService:CrudService,
    @Inject(MAT_DIALOG_DATA) public data: any
   // private router: Router
    ) {
      this.createForm();
     }
     createForm() {
      this.angForm = this.fb.group({
        nom: ['', Validators.required],
        prenom: ['', Validators.required],
        mail: ['', Validators.required]
      });
    }
    onClose(){
     console.log("close");
       this.dialogRef.close();
    }
    add( nom, prenom,mail ){
const obj = {
 "nom": nom,
 "prenom": prenom, 
 "mail": mail
    };
      this.CrudService.add(this.apiUrl,obj ).subscribe(
        data =>console.log(data)
      );  
      this.dialogRef.close();
    //  this.gotoList();

    }
 ngOnInit() {
 }

}