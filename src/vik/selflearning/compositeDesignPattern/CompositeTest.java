package vik.selflearning.compositeDesignPattern;

public class CompositeTest {

	public static void main(String[] args) {
		
		Component ram = new Leaf("Ram", 5000);
		Component mouse = new Leaf("Mouse", 500);
		Component monitor = new Leaf("Monitor", 8000);
		Component hdd = new Leaf("HDD", 7000);

		Composite ph = new Composite("Pheripheral");
		Composite cabinet = new Composite("Cabinet");
		ph.addComponent(mouse);
		ph.addComponent(monitor);

		cabinet.addComponent(hdd);
		cabinet.addComponent(ram);

		Composite computer = new Composite("Computer");
		computer.addComponent(ph);
		computer.addComponent(cabinet);

		computer.showPrice();
	}
}
