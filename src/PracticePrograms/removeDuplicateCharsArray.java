package PracticePrograms;

import java.util.Scanner;

public class removeDuplicateCharsArray {
	public static void removeDuplicates() {
		try (Scanner input = new Scanner(System.in)){
			System.out.println("Enter the String:");
			String str = input.next();
			char[] charArray = str.toCharArray();
			String newString = "";
			
			for (char value: charArray) {
				if (newString.indexOf(value)==-1) {
					newString+=value;
				}
			}
			System.out.println("The new String is: "+newString);
		}
		return finalResult;
	}
	
	public static void main(String[] args) {
		String finalResult = removeDuplicateCharsArray.removeDuplicates("Duppllicataee");
		System.out.println("New String: " +finalResult);
	}
}