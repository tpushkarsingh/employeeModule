import {Component, OnInit, ViewChild,AfterViewInit} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatTableDataSource} from '@angular/material/table';
import { ProductModel } from '../model/product.model';
import { HttpClientService } from '../service/http-client.service';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Employee } from '../model/employee-model';

@Component({
  selector: 'app-search-employee',
  templateUrl: './search-employee.component.html',
  styleUrls: ['./search-employee.component.css']
})
export class SearchEmployeeComponent implements  AfterViewInit  {
    employees: Employee[];
    elem: ProductModel[]= [];
constructor(private httpClientService: HttpClientService) { }
  displayedColumns: string[] = ['productCode', 'productName', 'productQuantity'];

   //displayedColumns: string[] = ['position', 'name', 'weight', 'symbol'];
   dataSource = new MatTableDataSource<ProductModel>(ELEMENT_DATA);

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;


  ngAfterViewInit() {

    this.httpClientService.getProduct().subscribe(
      res=>{
        this.elem.push(res);
        this.dataSource  = new MatTableDataSource(this.elem);
      }, error => console.error(error));

    this.dataSource.paginator = this.paginator;
  }
}

export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: ProductModel[] = [
  {productCode: 1, productName: 'Hydrogen', productQuantity: '1.0079'},
  {productCode: 2, productName: 'Helium', productQuantity: '4.0026'},
];
