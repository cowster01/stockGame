/*
 * TODO:
 * give user instructions
 * countdown from 5
 * give two tickers
 * give countdown from 5
 * within time user has to pick which stock is higher 
 * tell if user is right or wrong
 * then repeat
 */
package intro;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

import org.dalton.DaltonDraw;
import org.dalton.DaltonStock;
import org.dalton.DaltonWii;

public class stockGameCPK {


	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String choice = "";
		String potato = "";
		DaltonStock apple = new DaltonStock("AAPL");
		DaltonStock microsoft = new DaltonStock("MSFT");
		DaltonWii mote = new DaltonWii("002147F07A31");
		System.out.println(apple.lastprice);
		System.out.println("Type in a stock you wish to look up:");
		choice = input.nextLine();
		
		DaltonStock userStock = new DaltonStock(choice);
		
		System.out.println("The current price of" + choice + "is " + userStock + ".");


		DaltonDraw frame = new DaltonDraw();



		while (true) {
			frame.clear();
			//display two stocks
			frame.drawString("Apple", 100, 100, 100, Color.red);
			frame.drawString("Microsoft", 880, 100, 100, Color.red);

			potato = mote.next(); //get input
			frame.drawString(potato, 550, 500, 100, Color.red);




			frame.render();
			if (input.equals("left")) {
				frame.drawString("YOU'RE RIGHT", 300, 300, 100, Color.blue);
				frame.render();
			}
		}
	}

}
