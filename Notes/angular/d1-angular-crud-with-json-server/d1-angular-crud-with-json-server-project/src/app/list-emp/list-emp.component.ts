import { EmployeeServiceService } from './../service/employee-service.service';
import { ProductService } from './../service/product.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit, AfterViewInit } from '@angular/core';
import { Employee } from '../model/employee.model';
import { Product } from '../model/Product.model'

@Component({
  selector: 'app-list-emp',
  templateUrl: './list-emp.component.html',
  styleUrls: ['./list-emp.component.css']
})
export class ListEmpComponent implements OnInit {
  employees: Employee[] = [{}];
  products: Product[] = [{}];
  // var testemployee = this.employees;
  // public employees: Employee[] = [{
  //   "id": 34,
  //   "employee_name": "Peter",
  //   "employee_salary": 45,
  //   "employee_age": 50
  // }];

  // the HttpClient is dependency injected into the component.

  constructor(private http: HttpClient, private productService: ProductService, private employeeService: EmployeeServiceService) {
    // this.http.get<Employee[]>('http://localhost:3000/employees')
    //   .subscribe((employees: Employee[]) => {
    //     this.employees = employees;
    //   });
    //   console.log(this.employees);
    console.log("ListEmpComponent Constructor");
  }

  ngOnInit() {
    this.productService.getProducts().subscribe((products: Product[]) => { this.products = products });
    this.employeeService.getEmployees().subscribe((employees: Employee[]) => { this.employees = employees });
  }
  loadBackendData() {
    //directly calling the endpoint, instead of using service.
    console.log("ListEmpComponent ngOnInit" + this.employees);
    this.http.get<Employee[]>('http://localhost:3000/employees')
      .subscribe((data: Employee[]) => {
        //console.log("data : " + JSON.stringify(data));
        this.employees = data;
        // console.log("this.employees : " + this.employees);
        //console.log("Inside");
        console.log("Inside : " + this.employees);
      });
    console.log("Outside : " + this.employees);
    //this.test();
    // setTimeout(function () {
    //   console.log("st : " +  this.employees)
    // } , 2000)

    this.http.get<Product[]>("http://localhost:1234/products").subscribe((productData => {
      this.products = productData;
    }));
  }
  // test(){
  //   var testemployee = this.employees;
  //         setTimeout(function () {
  //     console.log("st : " +  testemployee)
  //   } , 2000)
  // }
  // clicked(){
  //   var testemployee = this.employees;
  //   console.log("clicked  : " + this.employees);
  //   setInterval(function(){
  //     var employees: Employee[] = [{
  //         "id": 34,
  //         "employee_name": "Peter",
  //         "employee_salary": 45,
  //         "employee_age": 50
  //       }];
  //       console.log("testemployee" + testemployee);
  //       console.log("this.employees" + employees)},1000);

  // }
}
