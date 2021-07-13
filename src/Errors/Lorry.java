package Errors;

public class Lorry extends Car implements Moveable {

    void open() {
        System.out.println("Car is open");
    }

    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}
