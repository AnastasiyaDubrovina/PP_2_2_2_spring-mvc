package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private int series;

    public Car(String brand, String model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public static List<Car> createListCars() {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("brand1", "model1", 1));
        listCars.add(new Car("brand2", "model2", 2));
        listCars.add(new Car("brand3", "model3", 3));
        listCars.add(new Car("brand4", "model4", 4));
        listCars.add(new Car("brand5", "model5", 5));
        return listCars;
    }

}
