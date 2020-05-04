import { Component, OnInit, ɵConsole, Inject } from '@angular/core';
import {VoitureService} from '../../../service/voiture.service'
import { from } from 'rxjs';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Voiture } from 'src/app/models/voiture';
import {NgForm} from '@angular/forms';
import {  FileUploader } from 'ng2-file-upload';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-add-voiture',
  templateUrl: './add-voiture.component.html',
  styleUrls: ['./add-voiture.component.scss']
})
export class AddVoitureComponent implements OnInit {
  angForm: FormGroup;
  


  constructor(private fb: FormBuilder,
    private VoitureService:VoitureService,
    public dialogRef: MatDialogRef<AddVoitureComponent>,
    ) {
    this.createForm();
   }
  

  ngOnInit() {
    
}
  createForm() {
    this.angForm = this.fb.group({
      matricule: ['', Validators.required],
      marque: ['', Validators.required],
      type: ['', Validators.required],
      capacite: ['', Validators.required],
      image: ['', Validators.required],

    });
  }
  
  get f(){
    return this.angForm.controls;
  }
  
  onClose(){
    this.dialogRef.close();
  }  
  add(matricule, marque, type,capacite,image){
    let v = new Voiture(matricule, marque, type,capacite,image);
    this.VoitureService.onCreate(v);
    this.dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    }); 

  }
  fileToUpload: File = null;
  handleFileInput(files: FileList) {
    this.fileToUpload = files.item(0);
}

}
