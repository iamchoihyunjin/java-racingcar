package racing.io;

import racing.model.Car;

import java.util.List;

public class OutputView {

    public static void view(List<Car> cars) {
        cars.forEach(OutputView::printForCount);
        System.out.println();
    }

    private static void printForCount(Car car) {
        System.out.println(new String(new char[car.getPosition()]).replace("\0", "-"));
    }
}
