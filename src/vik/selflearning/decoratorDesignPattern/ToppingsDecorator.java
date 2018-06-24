package vik.selflearning.decoratorDesignPattern;

abstract class ToppingsDecorator implements Pizza{
	
	private Pizza pizza;
	
	public ToppingsDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public double getCost() {
		return pizza.getCost();
	}

}
