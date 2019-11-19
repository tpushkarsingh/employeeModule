package io.pushkar.employeeModule.repository;

import io.pushkar.employeeModule.entity.EmployeeEntity;
import io.pushkar.employeeModule.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

}
