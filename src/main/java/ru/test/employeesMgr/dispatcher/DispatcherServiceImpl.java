package ru.test.employeesMgr.dispatcher;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.test.employeesMgr.dto.EmployeeDto;
import ru.test.employeesMgr.entities.Employee;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;

@Service
public class DispatcherServiceImpl implements DispatcherService {
    private RestTemplate restTemplate ;
    private final static String uri = "http://localhost:8289/logger/api/v1/";

    @PostConstruct
    private void init(){
        restTemplate = new RestTemplate();
    }

    @Override
    public void reportHire(Employee employee, LocalDate workingDay) {
        var sendUri = uri + "hiring";
        restTemplate.postForObject(sendUri, new EmployeeDto(employee,workingDay), Void.class);

    }

    @Override
    public void reportFire(List<Employee> employees, LocalDate workingDay) {
        for (Employee employee : employees) {
            reportFire(employee,workingDay);
        }
    }

    @Override
    public void reportFire(Employee employee, LocalDate workingDay) {
        var sendUri = uri + "firing";
        restTemplate.postForObject(sendUri, new EmployeeDto(employee,workingDay), Void.class);
    }
}
