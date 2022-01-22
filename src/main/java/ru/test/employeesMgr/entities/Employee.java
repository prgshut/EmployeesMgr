package ru.test.employeesMgr.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "hire_time")
    private LocalDate hireTime;
    @Column(name = "fired_time")
    private LocalDate firedTime;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee(LocalDate hireTime, Department department) {
        this.hireTime = hireTime;
        this.department = department;
    }

}
