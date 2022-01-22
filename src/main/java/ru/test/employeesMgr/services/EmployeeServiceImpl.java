package ru.test.employeesMgr.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.employeesMgr.entities.Employee;
import ru.test.employeesMgr.repositories.EmployeeRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public void savePersonal(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void saveAllPersonal(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }

    @Override
    public List<Employee> allPersonal() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> allWorkPersonal(LocalDate data) {
        return employeeRepository.allWorkPersonal(data);
    }


}
