// Exercise 33

package OOP.Ex28_36;

public class SportCar extends Car implements LoudCar{

    // Exercise 34
    // Begin
    public SportCar(String producer, String model, String color, Engine engine) {
        super(producer, model, color, 2, engine);
    }
    // End

    public SportCar(String producer, String model, String color, Integer seatsNumber, Engine engine) {
        super(producer, model, color, seatsNumber, engine);
    }

    @Override
    public String loudSound() {
        return "Wroom, wroom - measured 95 dB";
    }

    @Override
    public String toString() {
        return "SportCar" +  super.toString();
    }
}
