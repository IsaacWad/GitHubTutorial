package shop;

/**
 * 
 * @author isaac Cookie Class construct object and get final price for cookie
 *         desert Item
 */

public class Cookie extends DessertItem {
	int numCookies = 0;
	int cost = 0;
	double costPerCookie;
	int dozenCookies = 12;
	String calculation = "";

	/**
	 * constructor
	 * 
	 * @param name
	 * @param amount
	 * @param pricePerDozen post a desseritem created. numCookies and cost per
	 *                      cookie and this.name is initialized thru the parameter
	 */

	public Cookie(String name, int amount, double pricePerDozen) {

		numCookies = amount;
		costPerCookie = pricePerDozen / dozenCookies;
		calculation = amount + " @ " + pricePerDozen / 100 + " /dz.";
		this.name = calculation + " \n" + name;

	}

	/*
	 * calculate by numCookies * costPerCookie pre: none
	 * 
	 * @return cost
	 * 
	 */
	public int getCost() {

		cost = (int) Math.round(numCookies * costPerCookie);
		return (cost);

	}

}
