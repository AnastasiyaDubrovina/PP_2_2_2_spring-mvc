package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCarsFromList(List<Car> listCar, Integer count) {
        return listCar.stream().limit(count).toList();
    }
}
