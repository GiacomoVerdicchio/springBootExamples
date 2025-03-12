package boot.CarDealerExample.service;

import boot.CarDealerExample.Entity.CarBrand;
import boot.CarDealerExample.Entity.CarDealer;
import boot.CarDealerExample.repository.CarDealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarDealerService {

    @Autowired
    CarDealerRepository carDealerRepository;



    public void addCarDealer(String location){
        CarDealer carDealer = new CarDealer();
        carDealer.setLocation(location);
        carDealerRepository.save(carDealer);
    }

    public void addCarBrand(String uuid, String brandName) {
        Optional<CarDealer> carDealerOptional = carDealerRepository.findByUuid(uuid);
        if(carDealerOptional.isPresent()){
            CarDealer carDealer = carDealerOptional.get();
            List<CarBrand> list = carDealer.getCarBrandList();

            CarBrand carBrand = new CarBrand();
            carBrand.setBrandName(brandName);

            list.add(carBrand);
            carDealer.setCarBrandList(list);
            carDealerRepository.save(carDealer);
        }
    }
}
