package com.test.neofonie.sur;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PrintNumbersFromUserInputAndWriteToFile {
	
	public static void main(String[] args) {
		
		FileOutputStream fileOutputStream = null;
		File file;
		
		int firstIntegerUserInput;
		int secondIntegerUserInput;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first integer of the range: ");
		firstIntegerUserInput = userInput.nextInt();
		
		System.out.println("Enter the second integer of the range: ");
		secondIntegerUserInput = userInput.nextInt();
		
		String fizzString = "Fizz\n";
		byte[] fizzStringInBytes = fizzString.getBytes();
		
		String buzzString = "Buzz\n";
		byte[] buzzStringInBytes = buzzString.getBytes();
		
		String fizzBuzzString = "FizzBuzz\n";
		byte[] fizzBuzzStringInBytes = fizzBuzzString.getBytes();
		
		try {
			
			file = new File("PrintedNumbersBasedUponUserInput.txt");
			
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
						
			fileOutputStream = new FileOutputStream(file);
			
			for(int i = firstIntegerUserInput; i<=secondIntegerUserInput; i++) {
				if ( (i%3 == 0) && (i%5 != 0) ) {		
					fileOutputStream.write(fizzStringInBytes);					
				} else if ( (i%3 != 0) && (i%5 == 0) ) {
					fileOutputStream.write(buzzStringInBytes);
				} else if ((i%3 == 0) && (i%5 == 0)) {
					fileOutputStream.write(fizzBuzzStringInBytes);
				} else {
					String strValueOfCounter = i+"\n";
					byte[] strValueOfCounterInBytes = strValueOfCounter.getBytes();					 
					fileOutputStream.write(strValueOfCounterInBytes);
				}
			}
			
			fileOutputStream.flush();
			fileOutputStream.close();
			
		}catch (IOException e) {
				e.printStackTrace();
		} finally {
				try {
					if (fileOutputStream != null) {
						fileOutputStream.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
