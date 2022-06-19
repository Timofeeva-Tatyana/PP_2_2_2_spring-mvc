package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService{
    private CarDao carDao;

    @Override
    public List<Car> showCars(Integer count) {
        return carDao.showCars(count);
    }
}
