import java.util.Objects;

public class Car {
    int brand;
    String model;
    int volum;
    int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand == car.brand && volum == car.volum && year == car.year && Objects.equals(model, car.model);
    }
  }




