package Polimorfizm;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red");
        Square square = new Square("blue");
        Triangle triangle = new Triangle("green");

        circle.draw();
        square.draw();
        triangle.draw();

        Shape[] shapes = {circle,square,triangle};
        shapes[0].draw();
        shapes[1].draw();
        shapes[2].draw();

    }
}
