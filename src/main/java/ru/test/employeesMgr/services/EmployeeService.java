package ru.test.employeesMgr.services;

import ru.test.employeesMgr.entities.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeService {

    public void savePersonal(Employee employee);

    public void saveAllPersonal(List<Employee> employees);

    public List<Employee> allPersonal();

    public List<Employee> allWorkPersonal(LocalDate data);
}
