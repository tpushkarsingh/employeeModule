package io.pushkar.employeeModule.service.Impl;

import io.pushkar.employeeModule.entity.EmployeeEntity;
import io.pushkar.employeeModule.entity.ProductEntity;
import io.pushkar.employeeModule.mapper.Mapper;
import io.pushkar.employeeModule.model.Employee;
import io.pushkar.employeeModule.model.ProductDetail;
import io.pushkar.employeeModule.repository.EmployeeRepository;
import io.pushkar.employeeModule.repository.ProductRepository;
import io.pushkar.employeeModule.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private Mapper mapper;

    @Autowired
    private ProductRepository ProductRepository;

    @Override
    public List<Employee> fetchAllEmployee() {
        List<EmployeeEntity> ent = repository.findAll();
       return ent.stream().map(s->mapper.mapEntityToObject(s)).collect(Collectors.toList());
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if(repository.save(mapper.mapObjectToEntity(employee))!=null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean deleteEmployee(Integer empId){
        repository.deleteById(empId);
            return true;
    }

    @Override
    public List<ProductDetail> fetchAllProductDetail(){
        List<ProductEntity> productEntityList=ProductRepository.findAll();
        //String str="abc";
  List<ProductDetail> productDetailList=new ArrayList<>();
  for (int i=0;i<productEntityList.size();i++){
      ProductDetail productDetail=new ProductDetail();
      productDetail.setProductCode(productEntityList.get(i).getProductCode());
      productDetail.setProductName(productEntityList.get(i).getProductName());
      productDetail.setProductQuantity(productEntityList.get(i).getProductQuantity());
      productDetailList.add( productDetail);
  }
  return productDetailList;
    }

}
