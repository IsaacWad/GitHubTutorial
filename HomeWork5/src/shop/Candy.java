package shop;

/**
 * 
 * @author isaac Candy class construct object and get final price for Candy
 *         desert Item
 * 
 */

public class Candy extends DessertItem {
	String candyType = "";
	double weight = 0;
	double costPerPound = 0;
	int totalCost = 0;
	String calculation = "";

	/**
	 * constructor
	 * 
	 * @param name
	 * @param amount
	 * @param cost   post: a dessertItem created. weight, cost per pound, and
	 *               this.name is initialized thru parameters
	 */
	public Candy(String name, double amount, int cost) {
		// cost = weight per pound
		// weight

		weight = amount;
		costPerPound = cost;
		calculation = amount + " lbs. @ " + costPerPound / 100 + " /lb";
		this.name = calculation + "  \n" + name;

	}
	/*
	 * calculate by using weight*costPerPound cost when abstract class in
	 * dessertItem is called. pre:none post:return in totalCost
	 * 
	 * @return totalCost
	 * 
	 */

	public int getCost() {
		// just for the mean time will have to change later

		totalCost = (int) Math.round(weight * costPerPound);
		return (totalCost);

	}

}
