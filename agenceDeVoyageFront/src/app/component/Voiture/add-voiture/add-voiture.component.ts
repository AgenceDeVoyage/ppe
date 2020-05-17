import { Component, OnInit, ɵConsole, Inject } from '@angular/core';
import {VoitureService} from '../../../service/voiture.service'
import {CrudService} from '../../../service/crud.service'
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
  readonly apiUrl= ' http://localhost:8089/Voiture';
  public selectedFile;
  public event1;
  imgURL: any;
  receivedImageData: any;
  base64Data: any;
  convertedImage: any;


  constructor(private fb: FormBuilder,
    private VoitureService:VoitureService,
    public dialogRef: MatDialogRef<AddVoitureComponent>,
    private CrudService:CrudService
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
  onClose(){
    this.dialogRef.close();
  }  
  public  onFileChanged(event) {
    console.log(event);
    this.selectedFile = event.target.files[0];

    // Below part is used to display the selected image
    let reader = new FileReader();
    reader.readAsDataURL(event.target.files[0]);
    reader.onload = (event2) => {
      this.imgURL = reader.result;
  };

 }


 // This part is for uploading

  add(matricule, marque, type,capacite,image){
    const uploadData = new FormData();
    uploadData.append('myFile', this.selectedFile, this.selectedFile.name);
    const obj = {
      "matricule": matricule,
      "marque": marque,
      "type": type, 
      "capacite": capacite,
      "image": "img"
     };

    
     const v = new Voiture(matricule, marque, type,capacite,"image");
     this.CrudService.add(this.apiUrl,obj).subscribe(
     data=> console.log(data)
      /*  res => {console.log(res);
        this.receivedImageData = res;
        this.base64Data = this.receivedImageData.image;
        this.convertedImage = 'data:image/jpeg;base64,' + this.base64Data; },
err => console.log('Error Occured duringng saving: ' + err) */
    );  
    this.dialogRef.close();
    this.dialogRef.afterClosed().subscribe(
      data =>console.log(data)
    );


  }

}
