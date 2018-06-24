package vik.selflearning.decoratorDesignPattern;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: ");
		System.out.println(pizza.getDescription());
		System.out.println("pizza cost: " + pizza.getCost());
	}

}
