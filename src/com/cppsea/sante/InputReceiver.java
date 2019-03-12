package com.cppsea.sante;

import java.util.Scanner;

class InputReceiver {
	public static int getOptionFromChoices(String[] menu) {
		if(menu.length == 0) {
			// throw some kind of exception
		} else {
			Scanner userInput = new Scanner(System.in);
			
			int preValidUserChoice;
			int menuNumber = 1;
			
			while(true) {
				userInput.reset();
				
				for(String menuOption : menu) {
					System.out.println(menuNumber + ") " + menuOption);
					menuNumber++;
				}
				System.out.print("Please select a number from above: ");
			
				preValidUserChoice = Integer.parseInt(userInput.nextLine());
				
				if(preValidUserChoice > 0 && preValidUserChoice <= menu.length) {
					userInput.close();
					return preValidUserChoice;
				} else {
					System.out.println("Sorry, please enter a number between 1 and " + menu.length + ".");
				}
			}
			
		}
		
		return -1;
	}
}

