import { Component, OnInit, Inject } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import {CrudService} from 'src/app/service/crud.service';
@Component({
  selector: 'app-edit-voyage',
  templateUrl: './edit-voyage.component.html',
  styleUrls: ['./edit-voyage.component.scss']
})
export class EditVoyageComponent implements OnInit {
  readonly apiUrl= ' http://localhost:8089/Voyage';

  angForm: FormGroup;
  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<EditVoyageComponent>,
    private CrudService:CrudService,
    @Inject(MAT_DIALOG_DATA) public data: any) {
      this.createForm();
     }


  
    createForm() {
      this.angForm = this.fb.group({
        id: ['',],
        nom: ['', Validators.required],
        description: ['', Validators.required],
        tarifP: ['', Validators.required],
        tarifBc: ['', Validators.required],
        tarifNc: ['', Validators.required],
        nb: ['', Validators.required],
        image: ['', Validators.required],
      });
      this.angForm.setValue({
        id: this.data.id,
        nom: this.data.nom,
        description:this.data.description,  
        tarifP:this.data.tarifP,
        tarifBc: this.data.tarifBc,
        tarifNc:this.data.tarifNc,
        nb:this.data.nb,
        image:this.data.image,

      });
    }
    
edit(angForm){
  this.CrudService.edit(this.apiUrl,angForm.value).subscribe(
    res =>console.log("res"+res)
  );
}
onClose(){
  this.dialogRef.close();
 
}
ngOnInit() {
console.log(this.data);
}
}
