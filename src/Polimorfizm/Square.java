package Polimorfizm;

public class Square extends Shape{
    private String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}
