package restaurant;

public abstract class Sandwich implements SandwichInterface {
	public enum Bread {CIABATTA, MEXICAN_BREAD}
	public enum MainIngredient {CARNITAS, SALAMI}
	
	protected int price; 
	protected Bread bread;
	protected MainIngredient mainIng;
	
}
