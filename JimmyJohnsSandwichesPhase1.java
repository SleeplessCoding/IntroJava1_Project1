/**
 * Course:   IT110 - Introduction to Programming
 * Filename: PizzasRUsPhase1.java
 * Professor: Bary W Pollack
 * 
 * Purpose:  Created a simple online ordering system
 *			 for Pizzas-R-Us customers
 */

import javax.swing.JOptionPane;

/**
 * @author Nicholas Weinold
 */
public class JimmyJohnsSandwichesPhase1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// declare variables
		String openingMsg, nameInputMsg, customerName, nameOutputMsg, 
			   returnInputMsg, customerReturn, orderInputMsg, customerOrder, orderOutputMsg, returnOutputMsg, 
			   greetingOutputMsg, outputMsg, side1InputMsg, customerSide1, side1OutputMsg, side2InputMsg, customerSide2, side2OutputMsg;

		// display opening message
		openingMsg = " Welcome to Jimmy John's Gourmet Sandwiches Online Ordering System \n"
				   + "                     It's a great day to order a Sandwich!";
		JOptionPane.showMessageDialog(null, openingMsg);

		// get required input using dialogs
		nameInputMsg   = "Please tell us your name: ";
		customerName   = JOptionPane.showInputDialog(nameInputMsg);
		returnInputMsg = "Have you ordered with us before (yes or no)? ";
		customerReturn = JOptionPane.showInputDialog(returnInputMsg);
		orderInputMsg  = "Please select a Sandwich: \n"
					   + "Ham & Cheese \n"
					   + "Roast Beef \n"
					   + "Tuna Salad \n"
					   + "Turkey Breast \n"
					   + "Veggie (Double Provolone) \n";
		customerOrder  = JOptionPane.showInputDialog(orderInputMsg);
		side1InputMsg   = "Would you like a cookie with that (yes or no)? ";
		customerSide1   = JOptionPane.showInputDialog(side1InputMsg);
		side2InputMsg   = "Would you like a pickle with that (yes or no)? ";
		customerSide2   = JOptionPane.showInputDialog(side2InputMsg);

		// build output strings
		nameOutputMsg     = "Welcome " + customerName + ".\n\n";
		returnOutputMsg   = "Returning customer status: " + customerReturn + "\n\n";
		orderOutputMsg    = "You have ordered a " + customerOrder + "\n";
		side1OutputMsg     = "w/ Cookie: " + customerSide1 + "\n";
		side2OutputMsg     = "w/ pickle: " + customerSide2 + "\n\n\n";
		greetingOutputMsg = "Thank you for visiting Jimmy John's Gourmet Sandwiches!" + "\n\n"
						  + "Your order should be ready in less than 5 minutes.\n";

		// create and display output string
		outputMsg = nameOutputMsg + returnOutputMsg + orderOutputMsg + side1OutputMsg + side2OutputMsg + greetingOutputMsg;
		JOptionPane.showMessageDialog(null, outputMsg);

		System.exit(0);
	} // end main()

} // end class PizzasRUsPhase1
