package DecoratorPattern;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    public String ingredients() {
        return pizza.ingredients() + " + cheese";
    }

    public Double cost() {
        return pizza.cost() + 1.0;
    }
}
