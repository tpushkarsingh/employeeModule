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
    @Column(name="manufacturer",nullable = false)
    private String manufacturer;
    @Column(name="current_quantity",nullable = false)
    private String currentQuantity ;
    @Column(name="product_code",nullable = false)
    private String productCode;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(String currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
