package test;

import factoryCity.NYStylePizzaStore;
import service.PizzaCity;
import service.PizzaStoreCity;

public class PizzaTestCity {
	
	public static void main(String[] args) {
		PizzaStoreCity nyStore = new NYStylePizzaStore();
		
		PizzaCity pizzaCity = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizzaCity.getName() + "\n");
	}

}
