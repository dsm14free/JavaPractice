package PracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
	public static void fibSeries(int totalNumbers) {
		int i=0;
		int j=1;
		int k=0;
		System.out.println("Enter the fibonacci series number:");
		try (Scanner input = new Scanner(System.in)) {
			int totNums = input.nextInt();
			int[] fibSeriesArray = new int[totNums];
			for (int x=0;x<totNums;x++) {
				k=i+j;
				i=j;
				j=k;
				fibSeriesArray[x]=k;
			}
			System.out.println("Fibonacci Series: "+Arrays.toString(fibSeriesArray));
//			int len1=fibSeriesArray.length;
		}
	}
	public static void main(String[] args) {
		FibonacciSeries.fibSeries(10);
	}
}