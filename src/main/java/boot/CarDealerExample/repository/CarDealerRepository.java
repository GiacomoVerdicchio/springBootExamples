package boot.CarDealerExample.repository;

import boot.CarDealerExample.Entity.CarDealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarDealerRepository extends JpaRepository< CarDealer, String> {
    Optional<CarDealer> findByUuid(String uuid);
}
