package patterns.factorydesignpattern;

public class Car implements Vehicle{
    @Override
    public String type() {
        return "Car";
    }
}
