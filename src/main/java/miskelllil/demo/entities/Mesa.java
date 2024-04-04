package miskelllil.demo.entities;


import jakarta.persistence.*;
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
    @Column(unique = true)
    private Short numTable;
    private String emplacement;
    private String nombreChaise;
    private Boolean isReserved;
    private Boolean isDispo;


}
