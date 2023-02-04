package com.department.demoDepartment.service;


import com.department.demoDepartment.entity.Department;
import com.department.demoDepartment.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department saveDepartment(Department department) {

      return  departmentRepo.save(department);

    }

    @Override
    public List<Department> getDepartment() {
        return departmentRepo.findAll();

    }

    @Override
    public Department getDepartmentById(Long departmentID) {
        return  departmentRepo.findById(departmentID).get();
    }

    @Override
    public void deleteDepartmentByID(Long departmentID) {
         departmentRepo.deleteById(departmentID);
    }

    @Override
    public Department upadeteDepartment(Long departmentID, Department department) {

        Department updateDb = departmentRepo.findById(departmentID).get();

        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            updateDb.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            updateDb.setDepartmentAddress(department.getDepartmentAddress());
        }
        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            updateDb.setDepartmentCode(department.getDepartmentCode());
        }


        return departmentRepo.save(updateDb);
    }

    @Override
    public Department  getDepartmentByName(String departmentName){
        return departmentRepo.findByDepartmentNameIgnoreCase(departmentName);
    }


}
