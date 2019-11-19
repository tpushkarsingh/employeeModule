import {Component, OnInit, ViewChild} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatTableDataSource} from '@angular/material/table';
import { ProductModel } from '../model/product.model';
import { HttpClientService } from '../service/http-client.service';
import { HttpClient,HttpHeaders } from '@angular/common/http';
@Component({
  selector: 'app-search-employee',
  templateUrl: './search-employee.component.html',
  styleUrls: ['./search-employee.component.css']
})
export class SearchEmployeeComponent implements OnInit {
constructor(private httpClientService: HttpClientService) { }
  displayedColumns: string[] = ['productCode', 'productName', 'currentQuantity'];


  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  ELEMENT_DATA: ProductModel[];

  ngOnInit() {
    debugger;

    dataSource = new MatTableDataSource<ProductModel>(ELEMENT_DATA);
    this.dataSource.paginator = this.paginator;
  }
}
