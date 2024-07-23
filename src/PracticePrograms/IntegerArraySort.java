package PracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntegerArraySort {

    public void sortIntegerArray(int[] intArray){
        int temp=0;
        int counter=0;
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

        for(int j=0;j<intArray.length-1;j++){
            if(intArray[j]==intArray[j+1]){
                counter+=1;
            }
        }

        int[] newIntArray = new int[intArray.length-3];
        List<Integer> list = new ArrayList<>();
        for(int k=0;k<intArray.length;k++){
            if(k==intArray.length-1){
                list.add(intArray[k]);
            }else{
                if(intArray[k]!=intArray[k+1]){
                    list.add(intArray[k]);
                }
            }
        }
        Iterator<Integer> iterator = list.iterator();

        for(int m=0;m<newIntArray.length;m++){
            newIntArray[m] = iterator.next();
        }

        System.out.println("The sorted integer array after removing duplicates is: "+Arrays.toString(newIntArray));
    }

    public static void main(String[] args){
        IntegerArraySort obj = new IntegerArraySort();
        obj.sortIntegerArray(new int[] {2,5,2,82,3,5,45,3,7,9});
    }
}


