package miskelllil.demo.controllers;

import miskelllil.demo.entities.Employee;
import miskelllil.demo.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employees")
@CrossOrigin
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public ResponseEntity<List<Employee>> findAllEmployees(){
        ResponseEntity<List<Employee>> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees.getBody() , HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Employee> updateStatutEmployee(@RequestBody Employee empl){
        ResponseEntity<Employee> employeeUpdated = employeeService.updateStatutEmployee(empl.getId());
        return new ResponseEntity<>(employeeUpdated.getBody(), HttpStatus.OK);
    }


}
