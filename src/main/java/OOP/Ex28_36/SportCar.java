// Exercise 33

package OOP.Ex28_36;

public class SportCar extends Car implements LoudCar{

    public SportCar(String producer, String model, String color, Integer seatsNumber, Engine engine) {
        super(producer, model, color, seatsNumber, engine);
    }

    @Override
    public String loudSound() {
        return "Wroom, wroom - measured 95 dB";
    }
}
