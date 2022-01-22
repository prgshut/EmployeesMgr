package ru.test.employeesMgr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import ru.test.employeesMgr.entities.Employee;

import java.time.LocalDate;

@Getter
@ToString
public class EmployeeDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("hire_time")
    private LocalDate hireTime;
    @JsonProperty("hire_fime")
    private LocalDate firedTime;
    @JsonProperty("department")
    private String department;
    @JsonProperty("working_day")
    private LocalDate workingDay;

    public EmployeeDto(Employee employee, LocalDate workingDay){
        this.id = employee.getId();
        this.hireTime = employee.getHireTime();
        this.firedTime = employee.getFiredTime();
        this.department = employee.getDepartment().getName();
        this.workingDay = workingDay;
    }
}
