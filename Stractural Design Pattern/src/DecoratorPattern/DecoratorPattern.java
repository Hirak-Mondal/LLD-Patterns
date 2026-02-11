package DecoratorPattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.ingredients());
        System.out.println(pizza.cost());

        Pizza pizza2 = new OliveDecorator(new CheeseDecorator(new ChickenDecorator(new BasicPizza())));
        System.out.println(pizza2.ingredients());
        System.out.println(pizza2.cost());

    }
}
