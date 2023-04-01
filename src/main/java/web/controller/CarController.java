package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;
import static web.model.Car.createListCars;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getListCars(@RequestParam (value = "count", defaultValue = "5") Integer count, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> listCar = carService.getCarsFromList(createListCars(), count);
        model.addAttribute("cars", listCar);
        return "/cars";
    }


}
