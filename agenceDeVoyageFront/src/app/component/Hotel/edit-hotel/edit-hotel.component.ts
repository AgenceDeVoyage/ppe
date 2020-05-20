import { Component, OnInit, Inject } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import {CrudService} from 'src/app/service/crud.service';
@Component({
  selector: 'app-edit-hotel',
  templateUrl: './edit-hotel.component.html',
  styleUrls: ['./edit-hotel.component.scss']
})
export class EditHotelComponent implements OnInit {
  readonly apiUrl= ' http://localhost:8089/Hotel';

  angForm: FormGroup;
  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<EditHotelComponent>,
    private CrudService:CrudService,
    @Inject(MAT_DIALOG_DATA) public data: any) {
      this.createForm();
     }


  
    createForm() {
      this.angForm = this.fb.group({
        idHotel: ['',],
        nom: ['', Validators.required],
        adresse: ['', Validators.required],
        mail: ['', Validators.required],
        nbEtoile: ['', Validators.required],
        image: ['', Validators.required],
      });
      this.angForm.setValue({
          idHotel :this.data.idHotel,
          nom :this.data.nom,
          adresse :this.data.adresse,
          nbEtoile:this.data.nbEtoile,
          mail :this.data.mail,
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