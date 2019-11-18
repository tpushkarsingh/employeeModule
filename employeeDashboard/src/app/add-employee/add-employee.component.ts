import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee-model';
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
employee: Employee = new Employee();

  constructor(private httpClientService: HttpClientService) { }

  ngOnInit() {
  }

  createEmployee():void{
    debugger;
    this.httpClientService.createEmployee(this.employee).
      subscribe(data=>{

          alert('Employee created successfully');
      });

  }

}
