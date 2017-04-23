package factoryCity;

import service.PizzaCity;

public class NYStyleCheesePizza extends PizzaCity{
	
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
