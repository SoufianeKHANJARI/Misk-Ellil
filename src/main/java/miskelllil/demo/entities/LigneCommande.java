package miskelllil.demo.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LigneCommande {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne()
    @JoinColumn(name="idTicket")
    private Ticket ticket;
    @ManyToOne()
    @JoinColumn(name="idProduct")
    private Product product;



}
