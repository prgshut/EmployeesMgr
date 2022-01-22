package ru.test.employeesMgr.services;

import ru.test.employeesMgr.entities.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> findAll();
}
