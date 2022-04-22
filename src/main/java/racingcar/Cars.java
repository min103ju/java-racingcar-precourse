package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final String SEPARATOR = ",";
    private List<Car> cars;

    public Cars(String carNames) {
        String[] splitCarNames = carNames.split(SEPARATOR);
        this.cars = convertCar(splitCarNames);
    }

    private List<Car> convertCar(String[] splitCarNames) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < splitCarNames.length; i++) {
            cars.add(new Car(splitCarNames[i]));
        }
        return cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public int getCarsSize() {
        return this.cars.size();
    }
}
