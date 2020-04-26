import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
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
    private ClientService:ClientService,
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
   
  ngOnInit() {
    
  }

}
