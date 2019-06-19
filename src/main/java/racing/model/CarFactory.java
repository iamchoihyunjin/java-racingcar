package racing.model;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static List<Car> createByCount(int count) {
        List<Car> cars = new ArrayList<>();
        for (; count != 0; count--) {
            cars.add(new Car());
        }
        return cars;
    }
}
