package miskelllil.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket {
    @Id
    @GeneratedValue
    private Long id ;
    private LocalDate date;
    private Double TTC;
    private Double THT;
    private Double TVA;
    private Double TRemise;
    @ManyToOne
    @JoinColumn(name = "idTable")
    private Mesa mesa;




}
