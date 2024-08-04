package PracticePrograms;

import java.util.Arrays;

public class StringArraySortRemoveDuplicate {

    public void stringArraySortRemDupl(String[] strArray){
        String tempStr="";
        for(int i=0;i<strArray.length-1;i++){
            for(int j=0;j<strArray.length-i-1;j++){
                if(strArray[j].compareTo(strArray[j+1])>0){
                    tempStr=strArray[j];
                    strArray[j]=strArray[j+1];
                    strArray[j+1]=tempStr;
                }
            }
        }
        System.out.println("The sorted string array is: "+ Arrays.toString(strArray));

        int min=0;
        for(int i=1;i<strArray.length;i++){
            if(!strArray[min].equalsIgnoreCase(strArray[i])){
                min++;
                strArray[min]=strArray[i];
            }
        }

        System.out.println("The sorted and non-duplicate string array is: "+Arrays.toString(Arrays.copyOfRange(strArray, 0, min+1)));
    }

    public static void main(String[] args){
        StringArraySortRemoveDuplicate obj = new StringArraySortRemoveDuplicate();
        obj.stringArraySortRemDupl(new String[] {"tiger", "lion", "horse", "elephant", "giraffe", "lion", "tiger"});
    }
}
