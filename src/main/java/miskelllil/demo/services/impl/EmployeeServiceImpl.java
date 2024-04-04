package miskelllil.demo.services.impl;

import miskelllil.demo.entities.Employee;
import miskelllil.demo.repositories.EmployeeRepo;
import miskelllil.demo.repositories.LigneCommandeRepo;
import miskelllil.demo.services.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    @Override
    public ResponseEntity<List<Employee>> findAllEmployees() {
        List<Employee> employees = employeeRepo.findAll();
        return ResponseEntity.ok(employees);
    }

    @Override
    public ResponseEntity<Employee> updateStatutEmployee(Long idEmployee) {
        Optional<Employee> emp = this.employeeRepo.findById(idEmployee);
        if(emp != null){
            Employee saveEmployee = new Employee();
            //// instance des objets : (Utilitaires) les elements du classe du source vers target
            BeanUtils.copyProperties(emp,saveEmployee);
            saveEmployee.setStatus(!emp.get().getStatus());
            return ResponseEntity.ok(saveEmployee);
        }
        return null;

        /* 2eme methode
        emp.get().setStatus(!emp.get().getStatus());
        return this.employeeRepo.save(emp.get());*/

    }
/*
    @Override
    public ResponseEntity<Employee> updateServiceEmployee(Long idEmployee) {

        Optional<Employee> emp = this.employeeRepo.findById(idEmployee);
        if(emp != null){
            Employee saveEmployee = new Employee();
            //// instance des objets : (Utilitaires) les elements du classe du source vers target
            BeanUtils.copyProperties(emp,saveEmployee);
            saveEmployee.set(!emp.get().getStatus());
            return ResponseEntity.ok(saveEmployee);
        }
        return null;
    }*/
}
