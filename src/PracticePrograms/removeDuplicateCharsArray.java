package PracticePrograms;

import java.util.Scanner;

public class removeDuplicateCharsArray {
	public static String removeDuplicates(String input) {
		char[] charArray = input.toCharArray();
		String finalResult = "";
		for (int i=0; i<charArray.length; i++){
			if (finalResult.indexOf(charArray[i]) == -1){
				finalResult = finalResult + charArray[i];
			}
		}
		return finalResult;
	}
	
	public static void main(String[] args) {
		String finalResult = removeDuplicateCharsArray.removeDuplicates("Duppllicataee");
		System.out.println("New String: " +finalResult);
	}
}