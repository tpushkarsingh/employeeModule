package io.pushkar.employeeModule.service;

import io.pushkar.employeeModule.model.Employee;
import io.pushkar.employeeModule.model.ProductDetail;

import java.util.List;

public interface EmployeeService {

    public List<Employee> fetchAllEmployee();
    public boolean addEmployee(Employee employee);
    public boolean deleteEmployee(Integer empId);

    public List<ProductDetail> fetchAllProductDetail();
}
