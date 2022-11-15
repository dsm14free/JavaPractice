package InterviewQuestions;

import java.util.Scanner;

public class EvenOrOdd {
	public static void determineNumber() {
		try (Scanner input = new Scanner(System.in)){
			System.out.println("Enter a number:");
			double num = input.nextDouble();
			
			if (num % 2 == 1) {
				System.out.println("Number is Odd: "+num);
			}
			else if (num % 2 == 0){
				System.out.println("Number is Even: "+num);
			}
		}
		
	}
	
	public static void main(String[] args) {
		EvenOrOdd.determineNumber();
	}
}
