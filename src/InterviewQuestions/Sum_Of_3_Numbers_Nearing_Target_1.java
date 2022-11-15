package InterviewQuestions;

import java.util.Scanner;

public class Sum_Of_3_Numbers_Nearing_Target_1 {
	
	public static int[] sumNearingTarget() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number of integers to be passed.");
			int numOfElements = input.nextInt();
			int[] intArray = new int[numOfElements];
			System.out.println("Please enter "+numOfElements+" numbers: ");
			for (int i=0;i<intArray.length;i++) {
				intArray[i] = input.nextInt();
			}
			input.close();
			return intArray;
		}
	}
	
	public static void outputNum(int[] intArray) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the target number.");
//			int targetElement = input.nextInt();
			int targetElement = 23;
			int totalElements = 0;
			int x = 0;
			int diff = 0;
			int intArrayLength = intArray.length;
			System.out.println("Target Element: "+targetElement);
			for (int i=0;i<intArrayLength-2;i++) {
				for (int j=i+1;j<intArrayLength-1;j++) {
					for (int k=i+2;k<intArrayLength;k++) {
						totalElements = totalElements + 1;
					}
				}
			}
			
			int[] newInputArray = new int[totalElements];
			
			for (int i=0;i<intArrayLength-2;i++) {
				for (int j=i+1;j<intArrayLength-1;j++) {
					for (int k=i+2;k<intArrayLength;k++) {
						int sum=intArray[i] + intArray[j] + intArray[k];
						System.out.println("Printing the sum of "+i+", "+j+", "+k+": "+sum);
						
						newInputArray[x] = sum;
						x++;
//						if (i == intArrayLength-3 && j == intArrayLength-2 && k == intArrayLength-1) {
//							int sumArray[] = new int[totalElements];
//							System.out.println("Num Array: "+sumArray);
//						}
					}
				}
			}
			System.out.println("Total Elements: "+newInputArray.length);
			int[] resInputArray = new int[newInputArray.length];
			
			for (int i=0;i<newInputArray.length;i++) {
				resInputArray[i] = targetElement - newInputArray[i];
				System.out.println("Difference of the target element with the sum number: " +resInputArray[i]);
			}
			
			for (int i=0;i<resInputArray.length-1;i++) {
				if (resInputArray[i] < resInputArray[i+1]) {
					diff = resInputArray[i];
				}
			}
			System.out.println("Nearest Element is: "+diff);
		}

	}
	
	public static void main(String[] args) {
		
		int[] intArray = Sum_Of_3_Numbers_Nearing_Target_1.sumNearingTarget();
		Sum_Of_3_Numbers_Nearing_Target_1.outputNum(intArray);
	}
}
