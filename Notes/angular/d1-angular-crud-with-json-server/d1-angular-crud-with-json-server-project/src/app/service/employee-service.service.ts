import { Employee } from './../model/employee.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {
  baseUrl: string = "http://localhost:3000";
  constructor(private http: HttpClient) {
  }
  getEmployees() {
    return this.http.get<Employee[]>(this.baseUrl + '/employees');
  }
  createUser(employee: Employee) {
    return this.http.post(this.baseUrl + '/employees', employee);
  }
}
