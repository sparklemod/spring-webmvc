package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private List<Car> cars = List.of(
            new Car("BMW", "X5", 55000.0),
            new Car("Audi", "A4", 42000.0),
            new Car("Mercedes", "C-Class", 48000.0),
            new Car("Volkswagen", "Passat", 35000.0),
            new Car("Hyundai", "Sonata", 27000.0)
    );

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }

        if (count <= 0) {
            return List.of();
        }

        return cars.subList(0, count);
    }
}