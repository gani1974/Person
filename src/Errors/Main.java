package Errors;

public class Main {
    public static void main(String[] args) {
        //Create first car
        Car car1 = new Car.Builder()
                .withName("Lada")
                .withColor("White")
                .build();
        Car car2 = new Car.Builder()
                .withName("Volvo")
                .withColor("Green")
                .withEngine(new Engine("Gaz engine"))
                .build();
        //Create third car
        Car car3 = new Car.Builder()
                .withName("Honda")
                .withColor("Yellow")
                .withEngine(new Engine("Dizel engine"))
                .build();

        System.out.println(car1.toString());
        car1.setColor("Black");
        System.out.println(car1.toString());
    }
}
