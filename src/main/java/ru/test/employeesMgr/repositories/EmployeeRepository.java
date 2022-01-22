package ru.test.employeesMgr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.test.employeesMgr.entities.Employee;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.hireTime<=?1 and e.firedTime is NULL ")
    List<Employee> allWorkPersonal(LocalDate data);
}
