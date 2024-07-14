package PracticePrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AverageNumberOfLetters {

    public void averageNumberOfLetters(String str){
        String[] strArray = str.split(" ");
        int counter=0;
        int newCounter=0;
        Set<String> set = new LinkedHashSet<>();
        for(int i=0;i<strArray.length;i++){
            for(int j=0;j<strArray.length;j++){
                if(strArray[i].charAt(0)==strArray[j].charAt(0)){
                    counter+=strArray[j].length();
                    newCounter+=1;
                }
            }
            String result = "The average number of letters of "+strArray[i].charAt(0)+" is: "+(double)counter/newCounter;
            set.add(result);
            counter=0;
            newCounter=0;
        }
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args){
        AverageNumberOfLetters obj = new AverageNumberOfLetters();
        obj.averageNumberOfLetters("No now is definitely not the time");
    }
}