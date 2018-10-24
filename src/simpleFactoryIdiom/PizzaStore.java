package simpleFactoryIdiom;

import service.Pizza;

public class PizzaStore {
	
	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza (String type) {
		Pizza pizza;
		
		pizza = factory.createPizza(type);
		
		pizza.getDescription();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		
		return pizza;
	}

}
