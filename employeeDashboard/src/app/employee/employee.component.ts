import { Component, OnInit } from '@angular/core';
import { HttpClientService } from '../service/http-client.service';
import { Employee } from '../model/employee-model';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees: Employee[];

  constructor(private httpClientService: HttpClientService) { }
  //Employee emp = new Employee()

  ngOnInit() {
    this.httpClientService.getEmployee().subscribe(
      res=>{this.employees=res;}


    );
  }

  deleteEmployee(employee:Employee): void{

      this.httpClientService.deleteEmployee(employee).subscribe(
        data=>{
          this.employees = this.employees.filter(u => u!==employee);
        }
      )
  }
}
