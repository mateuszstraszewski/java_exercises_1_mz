package OOP.Ex28_36;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test message");
        Engine sportEngine = new Engine(3.5D, 450, 15.5D);
        Engine engineKia = new Engine(3.3D, 335, 8.1D);
        SportCar sportCar1 = new SportCar("Lamborghini", "Murcielago", "yellow", 2, sportEngine);

        System.out.println(sportCar1.loudSound());
        SportCar sportCar2 = new SportCar("Kia", "Stinger", "red", engineKia);
        System.out.println(sportCar2.toString());

    }
}
