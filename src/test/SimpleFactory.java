package test;

import simpleFactoryIdiom.PizzaStore;
import simpleFactoryIdiom.SimplePizzaFactory;

public class SimpleFactory {
	
	public static void main(String[] args) {
		
		PizzaStore pizza = new PizzaStore(new SimplePizzaFactory());
		
		pizza.orderPizza("veggie");
	}

}
