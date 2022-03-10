package leitepaulo.springbootexpert.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "total_value", length = 20, precision = 2)
    private BigDecimal totalValue;

    @OneToMany(mappedBy = "purchase")
    private List<PurchaseItem> items;

}