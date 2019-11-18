import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../service/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
userName='';
password='';
invalidLogin=false;
  constructor(private router: Router,
  private authenticationService: AuthenticationService) { }

  ngOnInit() {
  }

  checkLogin(){
    if(this.authenticationService.authenticate(this.userName,this.password)){
      this.router.navigate(['employee'])
      this.invalidLogin = false
    }
    else{
      this.invalidLogin = true;
    }
  }

}
