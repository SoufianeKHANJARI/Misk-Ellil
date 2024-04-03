package miskelllil.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Mesa {

    @Id
    @GeneratedValue
    private Long id;
    private Short numTable;
    private String emplacement;
    private String nombreChaise;
    private Boolean isReserved;
    private Boolean isDispo;


}
