import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../service/employee-service.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
//import { Router } from '@angular/router';

@Component({
  selector: 'app-add-emp',
  templateUrl: './add-emp.component.html',
  styleUrls: ['./add-emp.component.css']
})
export class AddEmpComponent implements OnInit {
  empformlabel: string = 'Add Employee';

  constructor(
    private formBuilder: FormBuilder,
    //private router: Router,
    private empService: EmployeeServiceService
  ) {}

  addForm: FormGroup;

  ngOnInit() {

    this.addForm = this.formBuilder.group({
      id: [],
      employee_name: ['', Validators.required],
      employee_salary: ['', [Validators.required, Validators.maxLength(3)]],
      employee_age: ['', [Validators.required, Validators.maxLength(3)]]
    });
  }
  onSubmit() {
    console.log('Employee details sent to server!');
    this.empService.createUser(this.addForm.value)
      .subscribe(data => {
        console.log("Data Saved!");
       // this.router.navigate(['list-emp']);
       }
      //,
      //   error => {
      //     console.log("Error occured " + error);
      //     //alert(error);
      //   }
      );
  }
}
