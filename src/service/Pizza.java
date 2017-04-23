package service;

public abstract class Pizza {
	
	public String description = "";
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	
	public abstract void getDescription();
	

}
