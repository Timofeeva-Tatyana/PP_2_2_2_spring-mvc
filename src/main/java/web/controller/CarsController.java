package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;

import java.util.Optional;

@Controller
public class CarsController {

    private final CarDaoImp carDaoImp;

    @Autowired
    public CarsController(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Optional<Integer> count, Model model) {
        model.addAttribute("cars", carDaoImp.showCars(count.orElse(0)));

        return "cars";
    }

}
