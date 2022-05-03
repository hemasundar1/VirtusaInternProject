import { Component, OnInit } from '@angular/core';
import { LoginService } from '../auth/services/login.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(public loginservice: LoginService) { }

  ngOnInit(): void {
  }
  

  public logout()
  {
    this.loginservice.logout();
    window.location.reload();
  }

}