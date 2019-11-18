import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { HttpClientService } from './http-client.service';
//import {User} from '../model/user';
export class User{
  constructor(
    public status:string,
     ) {}

}
@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private httpClient:HttpClient) { }

  authenticate(userName, password){
    if(userName === "pushkar" && password==="tempid"){
      sessionStorage.setItem('userName',userName);
      return true;
    }
    //else{
      //return false;

    //}
    //const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(userName + ':' + password) });
    //debugger;
    //return this.httpClient.get<User>('http://localhost:8080/employees/validateLogin',{headers}).pipe(
     //map(
       //userData => {
        //sessionStorage.setItem('userName',userName);
        //return userData;
       //}
     //)

    //);
  }

  isUserLoggedIn(){
    let user = sessionStorage.getItem('userName');
    return !(user===null);
  }

  logout(){
    sessionStorage.removeItem('userName');
  }

}
