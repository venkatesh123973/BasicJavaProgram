//package Optional;
//
//import java.util.Optional;
//
//public class person {
//
//    private String name;
//    private Optional <Car> car;
//
//    public person(String name, Car car) {
//        super();
//        this.name = name;
//        this.car = Optional.of(car);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Optional<Car> getCar() {
//        return car;
//    }
//
//    public String getinsurance(person pe){
//
//        Optional<person> optperson =Optional.of(pe);
//        return optperson.flatMap(person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("one of the value is optionmal")
//    }
//}
