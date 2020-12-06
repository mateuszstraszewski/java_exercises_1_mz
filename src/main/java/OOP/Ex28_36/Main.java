package OOP.Ex28_36;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test message");
        Engine sportEngine = new Engine(3.5D, 450, 15.5D);
        SportCar sportCar = new SportCar("Lamborghini", "Murcielago", "yellow", 2, sportEngine);
    }
}
