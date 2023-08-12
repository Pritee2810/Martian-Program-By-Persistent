package exceptionHandling;

import java.util.Scanner;

public class CustomException {
	static void validateInput(int number) throws InvalidInputException{
		if(number > 999) {
			throw new InvalidInputException("Exception");
		}
		System.out.println("Valid Input");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number less than 1000: ");
		int number = scanner.nextInt();
		try {
			validateInput(number);
		}
		catch(InvalidInputException e) {
			System.out.println("Caught exception -  Input is greater than 100");
		}
	}
}

class InvalidInputException extends Exception{
	InvalidInputException(String exceptionText){
		super(exceptionText);
	}
}
