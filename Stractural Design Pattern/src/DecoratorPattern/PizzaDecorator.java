package DecoratorPattern;

/// Main abstract decorator class
abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String ingredients() {
        return pizza.ingredients();
    }

    @Override
    public Double cost() {
        return pizza.cost();
    }
}
