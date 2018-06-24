package vik.selflearning.decoratorDesignPattern;

public class TomatoSauce extends ToppingsDecorator {

	private Pizza pizza;
	public TomatoSauce(Pizza pizza) {
		super(pizza);
		this.pizza = pizza;
		System.out.println("Added tomato sauce");
	}
	
	public String getDescription() {
		return pizza.getDescription()+", Tomato Sauce";
	}
	
	public double getCost() {
		return pizza.getCost() + 1.00;
	}
}
