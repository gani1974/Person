package Errors;

abstract public class Car {
    public Engine engine;
    private String color;
    private String name;

    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder{
        private Car car;

        public Builder(){
            car = new Car() {
                @Override
                void open() {
                    System.out.println("Car is open");
                }
            };
        }

        public Builder withName(String name){
            car.name = name;
            return this;
        }

        public Builder withColor(String color){
            car.color = color;
            return this;
        }

        public Builder withEngine(Engine engine){
            car.engine = engine;
            return this;
        }

        public Car build(){
            return car;
        }
    }

}
