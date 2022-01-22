package ru.test.employeesMgr.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.employeesMgr.component.HiringAndFiring;
import ru.test.employeesMgr.entities.Department;
import ru.test.employeesMgr.entities.Employee;
import ru.test.employeesMgr.services.DepartmentService;
import ru.test.employeesMgr.services.EmployeeService;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
public class Controller {
    private final EmployeeService employeeService;
    private final DepartmentService departmentService;
    private final HiringAndFiring hereAndFiring;

    @GetMapping(value = "/api/v1/start")
    public ResponseEntity<?> start() {
        hereAndFiring.startCreateEmployees();
        return ResponseEntity.ok("OK");
    }

    @GetMapping(value = "/api/v1/pers")
    private ResponseEntity<List<Employee>> allPersonal() {
        return ResponseEntity.ok(employeeService.allPersonal());
    }

    @GetMapping(value = "/api/v1/depart")
    private ResponseEntity<List<Department>> allDepart() {
        return ResponseEntity.ok(departmentService.findAll());
    }

}
