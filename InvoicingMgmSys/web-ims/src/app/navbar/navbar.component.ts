import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/observable/of';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  login$: Observable<boolean> | undefined;
  constructor() { }

  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.login$ = Observable.of(true);
  }
  // tslint:disable-next-line:typedef
  logout() {
    this.login$ = Observable.of(false);
}
}
