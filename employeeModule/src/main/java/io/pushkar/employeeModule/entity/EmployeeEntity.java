package io.pushkar.employeeModule.entity;


import javax.persistence.*;

@Entity
@Table(name = "emp_detail")
public class EmployeeEntity {
    @Id
    @Column(name = "emp_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    private String name;

    private String designation;

    private int salary;

    private String manufacturer;

    private String currentQuantity ;

    private String productCode;
    public String getName() {
        return name;
    }
    @Column(name="name",nullable = false)
    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }
    @Column(name="designation",nullable = false)
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
    @Column(name="salary",nullable = false)
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    @Column(name="manufacturer",nullable = false)
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCurrentQuantity() {
        return currentQuantity;
    }
    @Column(name="current_quantity",nullable = false)
    public void setCurrentQuantity(String currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public String getProductCode() {
        return productCode;
    }
    @Column(name="product_code",nullable = false)
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
