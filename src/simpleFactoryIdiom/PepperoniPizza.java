package simpleFactoryIdiom;

import service.Pizza;

public class PepperoniPizza extends Pizza{
	
	private String description = "pepperoni";
	
	@Override
	public void prepare() {
		System.out.println("Pizza prepare");
		
	}

	@Override
	public void bake() {
		System.out.println("Pizza bake");
		
	}

	@Override
	public void cut() {
		System.out.println("Pizza cut");
		
	}
	
	@Override
	public void getDescription() {
		System.out.println(description);
	}

}
