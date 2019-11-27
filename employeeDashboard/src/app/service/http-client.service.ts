import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Employee } from '../model/employee-model';
import { ProductModel } from '../model/product.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private httpClient:HttpClient) { }

  public getEmployee(){
    let userName='pushkar';
    let password='tempid';
    console.log("test call");
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(userName + ':' + password) });

    return this.httpClient.get<Employee[]>('http://localhost:8080/employees/fetchAllEmployees',{headers});
  }

public getProduct():Observable<any>{
  let userName='pushkar';
  let password='tempid';
  const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(userName + ':' + password) });

  return this.httpClient.get<ProductModel[]>('http://localhost:8080/employees/fetchProductDetail',{headers});
}
  public deleteEmployee(employee){
    let userName='pushkar'
    let password='tempid'
    console.log('inside the deleteEmployee service');
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(userName + ':' + password) });
    debugger;
    return this.httpClient.delete<Employee>('http://localhost:8080/employees/deleteEmployee/'+employee.empId,{headers});
  }

  public createEmployee(employee){
    debugger;
    let userName='pushkar'
    let password='tempid'
    console.log('inside the createEmployee service');
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(userName + ':' + password) });

    return this.httpClient.post<Employee>("http://localhost:8080/employees/createEmployee", employee,{headers});

  }

}
