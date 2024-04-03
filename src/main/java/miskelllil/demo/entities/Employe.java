package miskelllil.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Employe {
    @GeneratedValue
    @Id
    private Long idEmploye;
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private String role;


}
