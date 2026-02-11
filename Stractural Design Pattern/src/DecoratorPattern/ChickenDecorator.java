package DecoratorPattern;

public class ChickenDecorator extends PizzaDecorator{
    public ChickenDecorator(Pizza pizza){
        super(pizza);
    }

    public String ingredients() {
        return pizza.ingredients() + " + chicken";
    }

    public Double cost() {
        return pizza.cost() + 12.0;
    }
}
