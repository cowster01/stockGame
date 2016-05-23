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
		DaltonDraw frame = new DaltonDraw();
		DaltonWii mote = new DaltonWii("002147EE2B3E");

		System.out.println("Hello. This is a test.");
		while(true) {
			frame.drawString("Welcome to the Stock Simulator 3000", 350, 100, 50, Color.red);
			frame.drawString("Buy a Stock", 100, 300, 50, Color.blue);
			frame.drawEllipse(10, 10, 100, 400, 0, Color.MAGENTA);
			frame.render();
			input = mote.next(); //get input
			frame.drawString(input, 550, 500, 100, Color.red);




			frame.render();
			if (input.equals("left")) {
				frame.drawString("YOU'RE RIGHT", 300, 300, 100, Color.blue);
				frame.render();
			}
		}



	}

}
