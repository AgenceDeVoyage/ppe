import { Component, OnInit, Inject } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import {ClientService} from '../../../service/client.service';
import { from } from 'rxjs';


@Component({
  selector: 'app-edit-client',
  templateUrl: './edit-client.component.html',
  styleUrls: ['./edit-client.component.scss']
})
export class EditClientComponent implements OnInit {
  angForm: FormGroup;
  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<EditClientComponent>,
    private ClientService:ClientService,
    @Inject(MAT_DIALOG_DATA) public data: any) {
      this.createForm();
     }
    createForm() {
      this.angForm = this.fb.group({
        id: ['',],
        nom: ['', Validators.required],
        prenom: ['', Validators.required],
        mail: ['', Validators.required]
      });
      this.angForm.setValue({
          id :this.data.id,
          nom :this.data.nom,
          prenom :this.data.prenom,
          mail :this.data.mail
      });
    }
    onClose(){
      console.log("close");
        this.dialogRef.close();
     }
     edit( id,nom, prenom,mail){
      this.ClientService.onEdit(id,nom, prenom,mail).subscribe(
        data =>console.log(data)
      );  
      this.dialogRef.close();

    }
  ngOnInit() {
    console.log(this.data);
  }

}
