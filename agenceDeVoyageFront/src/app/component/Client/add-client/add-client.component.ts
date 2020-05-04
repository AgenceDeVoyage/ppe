import { Component, OnInit, Inject } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material';
import {ClientService} from '../../../service/client.service';
import { from } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrls: ['./add-client.component.scss']
})
export class AddClientComponent implements OnInit {
  angForm: FormGroup;

  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<AddClientComponent>,
    private ClientService:ClientService,
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
    add( nom, prenom,mail){
      this.ClientService.onCreate(nom, prenom,mail).subscribe(
        data =>console.log(data)
      );  
      this.dialogRef.close();
    //  this.gotoList();

    }
    
    /* gotoList() {
      this.router.navigate(['/']);
    } */
  ngOnInit() {
    
  }

}
