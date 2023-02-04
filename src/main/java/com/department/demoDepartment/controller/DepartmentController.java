package com.department.demoDepartment.controller;

import com.department.demoDepartment.entity.Department;
import com.department.demoDepartment.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/save")
    public Department saveDepartment(@Valid @RequestBody Department department){

        return  departmentService.saveDepartment(department);




  }

    @GetMapping("/get")
    public List<Department> getDepartment(){
        return departmentService.getDepartment();
     }

     @GetMapping("/getdepartment/{id}")
     public Department getDepartmentById(@PathVariable("id") Long departmentID){

        return  departmentService.getDepartmentById(departmentID);

     }

     @DeleteMapping("/delete/{id}")
     public String deleteDepartment(@PathVariable("id") Long departmentID){

         departmentService.deleteDepartmentByID(departmentID);
         return "Department Delete successfully";
     }

     @PutMapping("/update/{id}")
     public Department upadteDepartment(@PathVariable("id") Long  departmentID,@RequestBody Department department){

        return departmentService.upadeteDepartment(departmentID,department);
     }

     @GetMapping("/department/name/{name}")
     public Department getDepartmentbyname(@PathVariable("name") String departmentName){

        return departmentService.getDepartmentByName(departmentName);

     }


}
