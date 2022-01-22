package ru.test.employeesMgr.utils;

import ru.test.employeesMgr.entities.Department;
import ru.test.employeesMgr.entities.Employee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;

public class Hiring {
    private static Random random = new Random();

    public static Employee hiring(List<Department> allDepartment, LocalDate currentDate, LocalDate endHireTime) {
        var daysLeftHire = (int) ChronoUnit.DAYS.between(currentDate, endHireTime);
        var day = random.nextInt(daysLeftHire);
        var dayHire = currentDate.plusDays(day);
        var randomIdDepartment = random.nextInt(allDepartment.size() - 1);
        var department = allDepartment.get(randomIdDepartment);
        return new Employee(dayHire, department);

    }

}
