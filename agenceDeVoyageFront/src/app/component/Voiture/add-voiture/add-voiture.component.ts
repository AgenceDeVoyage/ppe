import { Component, OnInit, ɵConsole, Inject } from '@angular/core';
import {VoitureService} from '../../../service/voiture.service'
import { from } from 'rxjs';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Voiture } from 'src/app/models/voiture';
import {NgForm} from '@angular/forms';
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

}
