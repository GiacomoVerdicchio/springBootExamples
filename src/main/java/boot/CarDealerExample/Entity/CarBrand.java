package boot.CarDealerExample.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CarBrand {

    @Id
    @UuidGenerator
    @Column(nullable = false)
    private String uuid;

    @Column
    private String brandName;

    @ManyToOne
    @JoinColumn()
    private CarDealer carDealer;
}
