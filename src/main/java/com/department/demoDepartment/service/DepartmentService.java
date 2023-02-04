package com.department.demoDepartment.service;

import com.department.demoDepartment.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

   public List<Department> getDepartment();

   public Department getDepartmentById(Long departmentID);

   public void deleteDepartmentByID(Long departmentID);

   public Department upadeteDepartment(Long departmentID, Department department);


  public Department getDepartmentByName(String Department);
}
