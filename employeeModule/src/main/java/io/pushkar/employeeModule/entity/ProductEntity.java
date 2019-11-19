package io.pushkar.employeeModule.entity;

import javax.persistence.*;


@Entity
@Table(name = "product_detail")
public class ProductEntity {

    @Id
    @Column(name = "product_code", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Integer productCode;
    @Column(name="product_name",unique = true, nullable =false)
    private  String productName;
    @Column(name="current_quantity",unique = true, nullable =false)
    private  String productQuantity;


    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }
}
