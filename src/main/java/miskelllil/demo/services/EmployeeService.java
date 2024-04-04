package miskelllil.demo.services;

import miskelllil.demo.entities.Employee;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    ResponseEntity<List<Employee>> findAllEmployees();
    ResponseEntity<Employee> updateStatutEmployee(Long idEmployee);

   /* ResponseEntity<Employee> updateServiceEmployee(Long idEmployee, Employee employee);*/
}
