package ru.test.employeesMgr.utils;

import ru.test.employeesMgr.entities.Employee;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Firing {
    private static Random random = new Random();

    public static List<Employee> firing(List<Employee> workEmployee, LocalDate currentDate, int maxFiring) {
        var listEmployee = new LinkedList<Employee>();
        var countFiring = 1 + random.nextInt(maxFiring - 1);
        if (!workEmployee.isEmpty()) {
            if (workEmployee.size() > countFiring) {
                for (int i = 0; i < countFiring; i++) {
                    var idFiring = random.nextInt(workEmployee.size() - 1);
                    var firing = workEmployee.get(idFiring);
                    firing.setFiredTime(currentDate);
                    listEmployee.add(firing);

                }
            } else {
                for (Employee em : workEmployee) {
                    em.setFiredTime(currentDate);
                    listEmployee.add(em);
                }
            }
        }
        return listEmployee;
    }

}
