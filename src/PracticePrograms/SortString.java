package PracticePrograms;

import java.util.Arrays;

public class SortString {

    public void sortString(String str){
        int counter=0;
        String[] strArray = new String[str.length()];
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)>str.charAt(j)){
                    counter+=1;
                }
            }
            strArray[counter]=String.valueOf(str.charAt(i));
            counter=0;
        }
        System.out.println("The sorted string is: "+ Arrays.toString(strArray));

        StringBuilder strBldr = new StringBuilder(str.length());
        for(int k=0;k<strArray.length;k++){
            strBldr.append(strArray[k]);
        }

        System.out.println("The sorted string is: "+strBldr);

    }

    public static void main(String[] args){
        SortString obj = new SortString();
        obj.sortString("dsjaxz");
    }
}