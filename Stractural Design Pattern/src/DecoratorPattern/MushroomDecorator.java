package DecoratorPattern;

public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza pizza){
        super(pizza);
    }

    public String ingredients() {
        return pizza.ingredients() + " + mashrom";
    }

    public Double cost() {
        return pizza.cost() + 2.0;
    }
}
