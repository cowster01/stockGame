/*
 * TODO:
 * Stock Simulator
 * user receives a certain amount of starter money
 * with this money stocks can be invested in
 * 
 */
package intro;

import java.awt.Color;
import java.util.Scanner;

import org.dalton.DaltonDraw;
import org.dalton.DaltonStock;
import org.dalton.DaltonWii;


public class stockSim {

	public static void main(String[] args) {

		//declare variables
		String input =  "";
		String choice = "";
		
		//set starting money
		int money = 50000;
		
		//declare frame and Wii remote
		DaltonDraw frame = new DaltonDraw();
		DaltonWii mote = new DaltonWii("002147EE2B3E");

		//intialize stock variables
		DaltonStock apple = new DaltonStock("AAPL");
		

		while(true) {
			frame.drawString("Welcome to the Stock Simulator 3000", 350, 100, 50, Color.red);
			
			//NOTE: use AAPL stock only for now
			frame.drawString("Buy a Stock", 100, 300, 50, Color.blue);
			frame.drawEllipse(10, 10, 100, 400, 0, Color.MAGENTA);
			frame.render();
			input = mote.next(); //get input
			frame.drawString(input, 550, 500, 100, Color.red);
			
			//if user swipes left w/ mote
			if (input.equals("left")) {
				//clears frame
				frame.clear();
				//ask user how many shares to buy - LATER FEATURE TO ADD
				//frame.drawString("How many shares would you like to purchase?", 100, 300, 50, Color.blue);
				
				frame.drawString("Confirmation: You would like to buy 1 share of Apple?(press 'A' to confirm, 'B' to go back.", 550, 500, 100, Color.blue);
				frame.render();
				
				input = mote.next();
				if(input.equals("A")) {
					frame.clear();
					money = money - stock.lastPrice();
					//displays current till
					frame.drawString("You now own 1 share of Apple. Current till: $" + money + ".", 100, 300, 50, Color.blue);
				}
				frame.render();
			}
		}



	}

}
