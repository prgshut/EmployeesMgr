package ru.test.employeesMgr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.employeesMgr.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
