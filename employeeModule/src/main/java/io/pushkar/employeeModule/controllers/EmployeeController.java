package io.pushkar.employeeModule.controllers;

import io.pushkar.employeeModule.model.Employee;
import io.pushkar.employeeModule.model.ProductDetail;
import io.pushkar.employeeModule.model.User;
import io.pushkar.employeeModule.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employees")
public class EmployeeController {

    //private List<Employee> employees = createList();

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/fetchAllEmployees",produces = "application/json")
    public List<Employee> firstPage(){
        return employeeService.fetchAllEmployee();
    }

    @GetMapping(path ="/fetchProductDetail",produces ="application/json")
    public List<ProductDetail> findProduct(){

        return  employeeService.fetchAllProductDetail();

    }

    @GetMapping(path="/validateLogin" )
    public User validateLogin() {
        try {
            //throw new RuntimeException();
            return new User("createEmployeeUser successfully authenticated");
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"User Not autheticated;");
        }
    }

    @DeleteMapping(path="deleteEmployee/{id}")
    public Boolean deleteEmployee(@PathVariable("id") String id){

        return employeeService.deleteEmployee(Integer.parseInt(id));
    }

    @PostMapping(path = "/createEmployee")
    public Employee create(@RequestBody Employee user){
        employeeService.addEmployee(user);
        System.out.println(user);
        return user;
    }

    /*private List<Employee> createList() {
        List<Employee> tempEmployees = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("emp1");
        emp1.setDesignation("manager");
        emp1.setEmpId("1");
        emp1.setSalary(3000);

        Employee emp2 = new Employee();
        emp2.setName("emp2");
        emp2.setDesignation("developer");
        emp2.setEmpId("2");
        emp2.setSalary(3000);
        tempEmployees.add(emp1);
        tempEmployees.add(emp2);
        return tempEmployees;
    }*/

}
