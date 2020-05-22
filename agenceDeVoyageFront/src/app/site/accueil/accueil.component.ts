import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import  *  as  data  from  '../../data.json';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.scss']
})
export class AccueilComponent implements OnInit {
  constructor(private router: Router) { }

  ngOnInit() {
    console.log(data);

  }

}
