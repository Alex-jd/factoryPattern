package simpleFactoryIdiom;

import service.Pizza;

public class SimplePizzaFactory {
	
	public Pizza createPizza (String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamiPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggieiPizza();
		}
		
		return pizza;
	}

}
