package PracticePrograms;

import java.util.Arrays;

public class CompareString {

    public void compareString(String str, String str1){
        char[] charArray_1 = str.toCharArray();
        char[] charArray_2 = str1.toCharArray();
        int counter = 0;
        if(str.length() == str1.length()){
            for(int i=0;i<str.length();i++){
                if(charArray_1[i] == charArray_2[i]){
                    counter+=1;
//                    continue;
                }
            }
            System.out.println("Counter: "+counter);
            if(counter == str.length()){
                System.out.println("The strings are equal");
            }else{
                System.out.println("The strings are unequal");
            }
        }else{
            System.out.println("The strings are unequal1");
        }


    }

    public static void main(String[] args){
        String str = "This is a new String";
        String[] strArray = str.split(" ");
        System.out.println(strArray[1]);
        System.out.println(Arrays.toString(strArray));

        CompareString obj = new CompareString();
        obj.compareString("heelo", "hello");
    }
}
