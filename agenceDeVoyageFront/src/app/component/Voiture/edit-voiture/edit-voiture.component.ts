import { Component, OnInit, Inject } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { CrudService } from 'src/app/service/crud.service';
import { Voiture } from 'src/app/models/voiture';

@Component({
  selector: 'app-edit-voiture',
  templateUrl: './edit-voiture.component.html',
  styleUrls: ['./edit-voiture.component.scss']
})
export class EditVoitureComponent implements OnInit {
  angForm: FormGroup;
  readonly apiUrl= ' http://localhost:8089/Voiture';

  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<EditVoitureComponent>,
    private CrudService:CrudService,
    @Inject(MAT_DIALOG_DATA) public data: any) {
      this.createForm();
     }
     createForm() {
      this.angForm = this.fb.group({
        matricule: [''],
        marque: ['', Validators.required],
        type: ['', Validators.required],
        capacite: ['', Validators.required],
        image: ['', Validators.required],
      });
      this.angForm.setValue({
        matricule :this.data.matricule,
        marque :this.data.marque,
        type :this.data.type,
        capacite :this.data.capacite,
        image :this.data.image
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
