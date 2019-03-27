package shop;

/*
 * Checkout Class
 * list of methods that allow that collect info such as totalprice of items and tax
 * to be printed on receipt when called
 * 
 */
import java.util.ArrayList;

public class Checkout {

	ArrayList<DessertItem> list = new ArrayList<DessertItem>();

	/**
	 * Clears the list of dessert items from order pre: none post: The ArrayList
	 * list is cleared
	 */
	public void clear() {
		list.clear();

	}

	/**
	 * Add new DesertItem to list of dessert items pre: item is a desert item object
	 * 
	 * @param item post: added the item to the last index of list
	 */
	public void enterItem(DessertItem item) {
		list.add(item);

	}

	/**
	 * Calculate the total number of dessertItems in the list pre: none post:
	 * returns the int totalItems
	 */
	public int numberOfItems() {

		int totalItems = 0;
		totalItems = list.size();

		return (totalItems);

	}

	/**
	 * Creates a string the represents object in checkout pre: none post: returns
	 * string final receipt
	 */
	public String toString() {

		String itemName = "";
		String itemCost = "";
		String storeName = " ";
		String reciept = "";
		String finalReciept = "";
		String tax = "";
		String totalCost = "";

		storeName = "     " + DessertShoppe.STORE_NAME + "      \n\n";

		for (int i = 0; i < list.size(); i++) {

			itemName = list.get(i).getName();
			itemCost = DessertShoppe.cents2dollarsAndCents(list.get(i).getCost());
			reciept = reciept + String.format("%-25s %6s%n", itemName, itemCost);

		}

		tax = DessertShoppe.cents2dollarsAndCents(totalTax());
		totalCost = DessertShoppe.cents2dollarsAndCents(totalTax() + totalCost());

		finalReciept = storeName + reciept + "\n" + "Tax" + "            " + tax + " \n" + "Total Cost " + "         "
				+ totalCost;

		return (finalReciept);

	}

	/**
	 * calculates the total cost of all items on the list pre:none post:returns a in
	 * total by adding all the prices of index i of list in for loop after referring
	 * to object of index i in list use getCost method to get object cost.
	 * 
	 * @return
	 */

	public int totalCost() {

		int total = 0;

		for (int i = 0; i < list.size(); i++) {
			total = total + (list.get(i).getCost());
		}
		return (total);
	}

	/**
	 * calculates the total tax on totalcost pre: calculate totalCost post: returns
	 * tax amount by getting TAX_Rate from dessertShoppe and multiplying to total
	 * 
	 * @return
	 */
	public int totalTax() {

		int taxAmount = 0;
		double taxPercent = DessertShoppe.TAX_RATE / 100;
		int total = 0;

		total = totalCost();
		taxAmount = (int) (Math.round(total * taxPercent));

		return (taxAmount);

	}

}
