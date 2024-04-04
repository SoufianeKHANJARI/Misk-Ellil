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
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String productName;
    private Long productPrice;
    private Long productTVA;
    private String productUnity;
    private int productStock;
    private Boolean isPlatJour;
    private Boolean isDispo;


}
