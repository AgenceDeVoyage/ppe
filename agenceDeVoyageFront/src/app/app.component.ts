import { Component } from '@angular/core';
import  *  as  data  from  './data.json';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  show: boolean = true;
  title = 'agencedevoyageFront';
  
}
