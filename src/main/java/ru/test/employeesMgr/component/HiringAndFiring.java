package ru.test.employeesMgr.component;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.test.employeesMgr.dispatcher.DispatcherService;
import ru.test.employeesMgr.services.DepartmentService;
import ru.test.employeesMgr.services.EmployeeService;
import ru.test.employeesMgr.utils.Firing;
import ru.test.employeesMgr.utils.Hiring;

import java.time.LocalDate;
import java.util.Random;

@Component
@AllArgsConstructor
public class HiringAndFiring {
    private static final LocalDate START_HIRE_TIME = LocalDate.of(2022, 01, 01);
    private static final LocalDate END_HIRE_TIME = LocalDate.of(2023, 01, 01);
    private static final int MAX_FIRING = 3;
    private static final long TIME_SLEEP = 1000;
    private final EmployeeService employeeService;
    private final DepartmentService departmentService;
    private final DispatcherService dispatcherService;


    public void startCreateEmployees() {
        var currentDate = START_HIRE_TIME;
        Random random = new Random();
        int countHiring = 0;
        do {
            var allDepartment = departmentService.findAll();
            var employee = Hiring.hiring(allDepartment, currentDate, END_HIRE_TIME);
            employeeService.savePersonal(employee);
            countHiring++;
            dispatcherService.reportHire(employee,currentDate);

            if (countHiring % 5 == 0) {
                var workEmployee = employeeService.allWorkPersonal(currentDate);
                var listFiring = Firing.firing(workEmployee, currentDate, MAX_FIRING);
                employeeService.saveAllPersonal(listFiring);
                dispatcherService.reportFire(listFiring,currentDate);
            }

            currentDate = currentDate.plusDays(1);
            try {
                Thread.sleep(TIME_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (END_HIRE_TIME.compareTo(currentDate) != 0);

    }
}
