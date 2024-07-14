package PracticePrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountLettersNumber {

    public void countLetters(int[] intArray){
        Set<Integer> set = new HashSet<>();
        int tempNum=0;
        int counter=0;
        for(int i=0;i<intArray.length;i++){
            set.add(intArray[i]);
        }
        System.out.println("The integers are: "+set);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            tempNum=iterator.next();
            for(int j=0;j<intArray.length;j++){
                if(tempNum==intArray[j]){
                    counter+=1;
                }
            }
            System.out.println("The count of "+tempNum+" is: "+counter);
            counter=0;
        }
    }

    public static void main(String[] args){
        CountLettersNumber obj = new CountLettersNumber();
        obj.countLetters(new int[] {1, 1, 1, 3, 3, 4, 5, 5, 6, 9, 7, 3, 4});
    }
}


//Input:
//int[] arr = {1, 1, 1, 3, 3, 4, 5, 5, 6, 9, 7, 3, 4};
//Output:
//Frequency of 1 is : 3
//Frequency of 3 is : 3
//Frequency of 4 is : 2
//Frequency of 5 is : 2
//Frequency of 6 is : 2