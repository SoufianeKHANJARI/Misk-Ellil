package miskelllil.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Employee {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String phone;
    private String mail;
    private String role;
    private Boolean status;
    private String slot;
    private String gender;

/// On va le remplacer par BeanUtils   ( instance des objets):
    /*public Employee(Employee employee) {
        this.idEmployee= employee.idEmployee;

    }*/
}
