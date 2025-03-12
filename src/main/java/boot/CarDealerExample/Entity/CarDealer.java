package boot.CarDealerExample.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDealer {

    @Id
    @UuidGenerator
    @Column(nullable = false)
    private String uuid;

    @Column
    private String location;

    @Column
    @OneToMany(mappedBy = "carDealer",
                cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)
    private List<CarBrand> carBrandList;

}
