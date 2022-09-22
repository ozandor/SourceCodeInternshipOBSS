package com.obss.ngg;

import java.util.Scanner;

import java.util.Random;

/** Class to play Number Guess Game with user input.
 * 
 * @author Ozan Doruk YAVUZ
*/
public class NumberGuessGame {
	
	public static void main(String[] args) {
		
		int userGuess; // Counts the number of guesses made.
		int exit; // Integer that holds the exit condition.
		boolean userWin; // Boolean that holds if user win the game or not.
		
		Random rnd = new Random();
		Scanner scnr = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to Number Guess Game! Number is between 0-100.");
		
		while(true) { // Game loop
			
			int randomNum = rnd.nextInt(101);
			
			System.out.println("\nEnter 0 to play. Another number to quit the game.");
			exit = scnr.nextInt();
			
			if(exit != 0){ // Exit condition.
				
				break;
				
			}
			
			userWin = false; // Changes to true if user wins the game.
			
			for(int guessMade = 0; guessMade < 5; ++guessMade) { 
			// User has 5 number of guesses. After 5 false guess, user loses the game.
				
				System.out.println("\nPlease Enter Your " + (guessMade+1) +". guess: "); 
				userGuess = scnr.nextInt();
				
				if(userGuess == randomNum) {
					
					System.out.println("\nCongratulations! You won the game.");
					
					userWin = true;
					
					break;
				}else if(userGuess > randomNum) {
					
					System.out.println("\nYour guess is higher than random number.");
					
				}else {
					
					System.out.println("\nYour guess is lower than random number.");
				}
				
					
			}
			
			if(!userWin) {
				
				System.out.println("\nYou lose the game. The number was:" + randomNum + " Try again.");
				
			}
			
			
		}
		
		System.out.println("Game ended. End of the program.");
		
		
	}
	
	
}
