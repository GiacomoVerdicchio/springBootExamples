package boot.CarDealerExample.controller;

import boot.CarDealerExample.service.CarDealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/carDealerExample")
public class CarDealerController {

    @Autowired
    private CarDealerService carDealerService;

    @PostMapping(value = "/addCarDealer")
    public String addANewCarDealer(@RequestParam String location)
    {
        carDealerService.addCarDealer(location);
        return "200, created";
    }



    @PostMapping(value = "/addBrandToCarDealer")
    public String addANewBrand(@RequestParam String brandName, @RequestParam String uuid)
    {
        carDealerService.addCarBrand(uuid,brandName);
        return "200, added";
    }
}
