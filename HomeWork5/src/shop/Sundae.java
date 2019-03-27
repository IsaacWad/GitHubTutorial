package shop;

/**
 * 
 * @author isaac Sundae Class construct object and get final price for sundae
 *         desert Item
 */

public class Sundae extends IceCream {
	int finalPrice = 0;
	int price = 0;
	int toppingPrice = 0;

	/*
	 * constructor if constructor in iceCream is overloaded object will get created
	 * 
	 * @param name
	 * 
	 * @param cost
	 * 
	 * @param topping
	 * 
	 * @param topping cost this.name, topping cost, cost get from parameters
	 */
	public Sundae(String name, int cost, String topping, int toppingCost) {
		super(name, cost, topping, toppingCost);
		this.name = topping + " Sundae with \n" + name;
		toppingPrice = toppingCost;
		price = cost;

	}

	/**
	 * gets finalPrice by adding price to toppingPrice
	 * 
	 * @return finalPrice
	 */
	public int getCost() {
		finalPrice = price + toppingPrice;
		return (finalPrice);
	}

}
