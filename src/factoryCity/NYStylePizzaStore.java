package factoryCity;

import service.PizzaCity;
import service.PizzaStoreCity;


public class NYStylePizzaStore extends PizzaStoreCity {

	/**
	 * The implementation of the FactoryMethod createPizza
	 */
	@Override
	protected PizzaCity createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}
		/*else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamiPizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggieiPizza();
		}*/
		else return null;
	}

}
