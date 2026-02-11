package DecoratorPattern;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza pizza){
        super(pizza);
    }
    public String ingredients() {
        return pizza.ingredients() + " + olive";
    }

    public Double cost() {
        return pizza.cost() + 7.0;
    }
}
