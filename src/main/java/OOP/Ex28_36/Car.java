package OOP.Ex28_36;

public abstract class Car {
    private String producer, model, color;
    private Integer seatsNumber;
    private Engine engine;  //composition

    public void setEngine(Engine engineCreated) {
        this.engine = engineCreated;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Car(String producer, String model, String color,
               Integer seatsNumber, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }
}
