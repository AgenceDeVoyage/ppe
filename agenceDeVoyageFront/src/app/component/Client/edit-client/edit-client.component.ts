import { Component, OnInit, Inject } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { from } from 'rxjs';
import { Client } from 'src/app/models/client';

import { CrudService } from 'src/app/service/crud.service';

@Component({
  selector: 'app-edit-client',
  templateUrl: './edit-client.component.html',
  styleUrls: ['./edit-client.component.scss']
})
export class EditClientComponent implements OnInit {
  angForm: FormGroup;
  readonly apiUrl= ' http://localhost:8089/Client';

  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<EditClientComponent>,
    private CrudService:CrudService,
    @Inject(MAT_DIALOG_DATA) public data: any) {
      this.createForm();
     }
    createForm() {
      this.angForm = this.fb.group({
        id: ['',],
        nom: ['', Validators.required],
        prenom: ['', Validators.required],
        mail: ['', Validators.required],
        civilite: ['', Validators.required],
        genre: ['', Validators.required],
        nationalite: ['', Validators.required],
        idPassport: ['', Validators.required],
        dateExp: ['', Validators.required],
      });
      this.angForm.setValue({
          id :this.data.id,
          nom :this.data.nom,
          prenom :this.data.prenom,
          mail :this.data.mail,
          genre:this.data.genre,

          nationalite:this.data.nationalite,
        
          civilite :this.data.civilite,
          idPassport:this.data.idPassport,
          dateExp:this.data.dateExp,
      });
    }
    onClose(){
      console.log("close");
        this.dialogRef.close();
     }
  
 
     /*  const obj = {
        "id":id,
        "nom": nom,
        "prenom": prenom, 
        "mail": mail,
        "civilite":civilite,
        "genre":genre,
  "nationalite":nationalite,
 "idPassport":idPassport,
 "dateExp":dateExp,
           }; */ 
           edit(angForm){
            this.CrudService.edit(this.apiUrl,angForm.value).subscribe(
              res =>console.log("res"+res)
            );
          }


 

    
  ngOnInit() {
    console.log(this.data);
  }

}