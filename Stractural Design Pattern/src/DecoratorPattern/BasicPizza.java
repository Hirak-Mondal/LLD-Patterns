package DecoratorPattern;

public class BasicPizza implements Pizza{

    @Override
    public String ingredients() {
        return "Basic pizza";
    }

    @Override
    public Double cost() {
        return 5.0;
    }
}
