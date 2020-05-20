import { Component, OnInit, ɵConsole, Inject } from '@angular/core';
import {CrudService} from '../../../service/crud.service'
import { from } from 'rxjs';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Hotel } from 'src/app/models/hotel';
import {NgForm} from '@angular/forms';
import {  FileUploader } from 'ng2-file-upload';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-add-hotel',
  templateUrl: './add-hotel.component.html',
  styleUrls: ['./add-hotel.component.scss']
})
export class AddHotelComponent implements OnInit {
  angForm: FormGroup;
  readonly apiUrl= ' http://localhost:8089/Hotel';
  public selectedFile;
  public event1;
  imgURL: any;
  receivedImageData: any;
  base64Data: any;
  convertedImage: any;


  
  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<AddHotelComponent>,
    private CrudService:CrudService,
    @Inject(MAT_DIALOG_DATA) public data: any
   // private router: Router
    ) {
      this.createForm();
     }
     createForm() {
      this.angForm = this.fb.group({
        nom: ['', Validators.required],
        adresse: ['', Validators.required],
        mail: ['', Validators.required],
        nbEtoile: ['', Validators.required],
        image: ['', Validators.required],
       


        
      });
    }
    onClose(){
     console.log("close");
       this.dialogRef.close();
    }
    add( nom,adresse,mail,nbEtoile,image ){

const obj = {
 "nom": nom,
 "adresse": adresse, 
 "mail": mail,
 "nbEtoile": nbEtoile, 
 "image": image, 

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