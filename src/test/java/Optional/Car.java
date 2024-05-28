package Optional;

import java.util.Optional;

public class Car {

    private String name;
    private Optional<Insurance> insurance;

    public String getName() {

        return name;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public Car(String name, Insurance insurance) {
        super();
        this.name = name;
        this.insurance = Optional.of(insurance);
    }
}
