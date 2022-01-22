package ru.test.employeesMgr.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.employeesMgr.entities.Department;
import ru.test.employeesMgr.repositories.DepartmentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceIml implements DepartmentService {
    private final DepartmentRepository departmentRepository;


    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
