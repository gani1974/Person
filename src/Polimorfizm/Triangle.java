package Polimorfizm;

public class Triangle extends Shape{
    private String color;

    public Triangle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник");
    }
}
