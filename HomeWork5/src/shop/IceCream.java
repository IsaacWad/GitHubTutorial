package shop;

/**
 * 
 * @author isaac IceCream Class construct object and get final price for
 *         IceCream desert Item
 */

public class IceCream extends DessertItem {
	int price;

	/*
	 * constructor this.name and price get value thru parameters
	 * 
	 * @param name
	 * 
	 * @param cost
	 * 
	 */
	public IceCream(String name, int cost) {
		this.name = name;
		price = cost;

	}

	/*
	 * constructor overload for sub class
	 * 
	 * @param flavour
	 * 
	 * @param cost
	 * 
	 * @param topping
	 * 
	 * @param toppingCost
	 */
	public IceCream(String flavour, int cost, String topping, int toppingCost) {

	}

	/*
	 * return the integer price when just icecream is ordered no toppings
	 * 
	 * @return price
	 */
	public int getCost() {
		return (price);
	}

}
