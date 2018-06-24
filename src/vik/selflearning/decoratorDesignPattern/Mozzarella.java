package vik.selflearning.decoratorDesignPattern;

public class Mozzarella extends ToppingsDecorator {

	private Pizza pizza;
	
	public Mozzarella(Pizza pizza) {
		super(pizza);
		this.pizza = pizza;
		System.out.println("Added mozzarella");
	}
	
	public String getDescription() {
		return pizza.getDescription()+", Mozzarella";
	}
	
	public double getCost() {
		return pizza.getCost() + 2.00;
	}
}
