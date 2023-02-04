package com.department.demoDepartment.repository;

import com.department.demoDepartment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {

    public Department findByDepartmentName(String departmentName);
    public Department findByDepartmentNameIgnoreCase(String departmentName);



}

