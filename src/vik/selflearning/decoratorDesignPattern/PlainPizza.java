package vik.selflearning.decoratorDesignPattern;

public class PlainPizza implements Pizza{

	public PlainPizza() {
		System.out.println("Added dough");
	}
	@Override
	public String getDescription() {
		return "Plain Pizza";
	}

	@Override
	public double getCost() {
		return 10.00;
	}

}
