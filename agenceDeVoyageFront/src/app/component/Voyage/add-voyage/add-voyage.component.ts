import { Component, OnInit, ɵConsole, Inject } from '@angular/core';
import {CrudService} from '../../../service/crud.service'
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Voyage } from 'src/app/models/voyage';
import {NgForm} from '@angular/forms';
import {  FileUploader } from 'ng2-file-upload';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-add-voyage',
  templateUrl: './add-voyage.component.html',
  styleUrls: ['./add-voyage.component.scss']
})
export class AddVoyageComponent implements OnInit {
  angForm: FormGroup;
  readonly apiUrl= ' http://localhost:8089/Voyage';
  public selectedFile;
  public event1;
  imgURL: any;
  receivedImageData: any;
  base64Data: any;
  convertedImage: any;


  
  constructor(private fb: FormBuilder,
    public dialogRef: MatDialogRef<AddVoyageComponent>,
    private CrudService:CrudService,
    @Inject(MAT_DIALOG_DATA) public data: any
   // private router: Router
    ) {
      this.createForm();
     }
     createForm() {
      this.angForm = this.fb.group({
        nom: ['', Validators.required],
        description: ['', Validators.required],
        tarifP: ['', Validators.required],
        tarifBc: ['', Validators.required],
        tarifNc: ['', Validators.required],
        nb: ['', Validators.required],
        image: ['', Validators.required],
            
        
      });
    }
    onClose(){
     console.log("close");
       this.dialogRef.close();
    }
    add(nom,description,tarifP,tarifBc,tarifNc,nb,image){

const obj = {
 "nom": nom,
 "description": description, 
 "tarifP": tarifP,
 "tarifBc": tarifBc,
 "tarifNc": tarifNc,
 "nb": nb, 
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