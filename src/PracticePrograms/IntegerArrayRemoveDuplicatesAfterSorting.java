package PracticePrograms;

import java.util.Arrays;

public class IntegerArrayRemoveDuplicatesAfterSorting {

    public void removeDuplicatesAfterSorting(int[] intArray){
        int temp=0;
        for(int i=0;i<intArray.length-1;i++){
            for(int j=0;j<intArray.length-i-1;j++){
                if(intArray[j]>intArray[j+1]){
                    temp=intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                }
            }
        }

        System.out.println("The sorted integer array is: "+Arrays.toString(intArray));

        int min=0;
        for(int i=1;i<intArray.length;i++){
            if(intArray[min]!=intArray[i]){
                min++;
                intArray[min]=intArray[i];
            }
        }

        System.out.println("The sorted integer arrays after removing duplicates are: "+Arrays.toString(Arrays.copyOfRange(intArray, 0, min+1)));
        String newIntArray = Arrays.toString(Arrays.copyOfRange(intArray, 0, min+1));
        System.out.println(newIntArray);
    }

    public static void main(String[] args){
        IntegerArrayRemoveDuplicatesAfterSorting obj = new IntegerArrayRemoveDuplicatesAfterSorting();
        obj.removeDuplicatesAfterSorting(new int[] {2,6,1,5,34,2,6,8,45,9,45});
    }
}
