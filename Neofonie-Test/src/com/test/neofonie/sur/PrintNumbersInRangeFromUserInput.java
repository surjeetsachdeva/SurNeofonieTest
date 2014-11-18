package com.test.neofonie.sur;

import java.util.Scanner;

public class PrintNumbersInRangeFromUserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int firstIntegerUserInput;
		int secondIntegerUserInput;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first integer of the range: ");
		firstIntegerUserInput = userInput.nextInt();
		
		System.out.println("Enter the second integer of the range: ");
		secondIntegerUserInput = userInput.nextInt();
		
		for(int i = firstIntegerUserInput; i<=secondIntegerUserInput; i++) {
			if ( (i%3 == 0) && (i%5 != 0) ) {
				System.out.println("Fizz");
			} else if ( (i%3 != 0) && (i%5 == 0) ) {
				System.out.println("Buzz");
			} else if ((i%3 == 0) && (i%5 == 0)) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
