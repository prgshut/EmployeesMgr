package ru.test.employeesMgr.dispatcher;

import ru.test.employeesMgr.entities.Employee;

import java.time.LocalDate;
import java.util.List;

public interface DispatcherService {

    public void reportHire(Employee employee, LocalDate workingDay);
    public void reportFire(List<Employee> employees, LocalDate workingDay);
    public void reportFire(Employee employee, LocalDate workingDay);

}
