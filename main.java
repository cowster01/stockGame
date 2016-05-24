/*
 * TODO:
 * Stock Simulator
 * user receives a certain amount of starter money
 * with this money stocks can be invested in
 * @Cowster01 - create the code that asks the user how many shares they wish to buy
 */
package intro;

//import APIs
import java.awt.Color;
import java.util.Scanner;

import org.dalton.DaltonDraw;
import org.dalton.DaltonStock;
import org.dalton.DaltonWii;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException;

public class stockSim {

	public static void main(String[] args) {

		//declare variables
		String input =  "";
		String choice = "";
		
		String potato = "Hello. To the World.";
		byte data[] = s.getBytes();
		Path p = Paths.get("./logfile.txt");
		
		
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
			frame.drawString("Check your Portfolio", 400, 300, 50, Color.blue);			
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
					//saves data of current till and amount of shares bought to data file
					try {
						FileWriter writer = new FileWriter("portfolio.txt", true);
						BufferedWriter bufferedWriter = new BufferedWriter(writer);
						bufferedWriter.write(money);
						bufferedWriter.write("\n\r");
						bufferedWriter.write(stock.lastPrice());
						bufferedWriter.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(input.equals("right")) {
					frame.clear();
				
					//pull txt file with stored data and read it
					FileReader reader = new FileReader("portfolio.txt");
					BufferedReader bufferedreader = new BufferedReader(reader);
					
					String line;
					
					while((line = bufferedReader.readLine()) != null) {
						//show portfolio
						frame.drawString(line, 550, 500, 100, Color.blue);
					}
					reader.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
				frame.render();
			}
		}



	}

}
