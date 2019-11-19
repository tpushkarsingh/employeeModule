package io.pushkar.employeeModule.mapper;

import io.pushkar.employeeModule.entity.EmployeeEntity;
import io.pushkar.employeeModule.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public Employee mapEntityToObject(EmployeeEntity entity){
        Employee emp =new Employee();
        emp.setEmpId(entity.getEmpId());
        emp.setSalary(entity.getSalary());
        emp.setDesignation(entity.getDesignation());
        emp.setName(entity.getName());
        emp.setCurrentQuantity(entity.getCurrentQuantity());
        emp.setManufacturer(entity.getManufacturer());
        emp.setProductCode(entity.getProductCode());
        return emp;

    }

    public EmployeeEntity mapObjectToEntity(Employee emp){
        EmployeeEntity ent =new EmployeeEntity();
        ent.setEmpId(emp.getEmpId());
        ent.setSalary(emp.getSalary());
        ent.setDesignation(emp.getDesignation());
        ent.setName(emp.getName());
        return ent;

    }

}
