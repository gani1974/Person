package Polimorfizm;

public class Circle extends Shape{
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}
