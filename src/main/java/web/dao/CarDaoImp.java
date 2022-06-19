package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private static final List<Car> CARS;

    static {
        CARS = new ArrayList<>();
        CARS.add(new Car("red", "BWB", "V8"));
        CARS.add(new Car("white", "Mercedes", "V6"));
        CARS.add(new Car("black", "AUDI", "V4"));
        CARS.add(new Car("yellow", "Lada", "V4"));
        CARS.add(new Car("red", "Porshe", "V10"));
    }

    @Override
    public List<Car> showCars(Integer count) {
        if (count == 0 || count > CARS.size()) {
            return CARS;
        } else {
            return CARS.stream().limit(count).collect(Collectors.toList());

        }
    }
}
