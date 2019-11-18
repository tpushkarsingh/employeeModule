package io.pushkar.employeeModule.entity;


import javax.persistence.*;

@Entity
@Table(name = "emp_detail")
public class EmployeeEntity {
    @Id
    @Column(name = "emp_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="designation",nullable = false)
    private String designation;
    @Column(name="salary",nullable = false)
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
