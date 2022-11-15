package InterviewQuestions;

import java.util.Scanner;

public class removeDuplicateChars {
	public static void remDupChars() {
		try (Scanner input = new Scanner(System.in)){
			System.out.println("Enter the string:");
			String str = input.next();
			int len = str.length();
			char[] charArray = str.toCharArray();
			StringBuilder strBldr = new StringBuilder(len);
			for (int i=0;i<len-1;i++) {
				for (int j=i+1;j<len;j++) {
					if (charArray[i] != charArray[j]) {
						strBldr.append(charArray[i]);
						
					}
				}
				if (charArray[i] != charArray[i+1]) {
					strBldr.append(charArray[i]);
				}
			}
			strBldr.append(str.charAt(len-1));
			System.out.println("Word after removing duplicate characters is: "+strBldr);
		}
	}
	
	public static void main(String[] args) {
		removeDuplicateChars.remDupChars();
	}
}
