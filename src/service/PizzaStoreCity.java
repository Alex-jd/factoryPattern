package service;

public abstract class PizzaStoreCity {
	
	public PizzaCity orderPizza (String type) {
		PizzaCity pizzaCity;
		
		pizzaCity = createPizza(type);
		
		pizzaCity.prepare();
		pizzaCity.bake();
		pizzaCity.cut();
		pizzaCity.box();
		
		return pizzaCity;
	}
	/**
	 * The FactoryMethod createPizza
	 * @param type
	 * @return
	 */
	protected abstract PizzaCity createPizza (String type);

}
