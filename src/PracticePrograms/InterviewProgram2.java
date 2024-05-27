package PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterviewProgram2 {
    // Create a List to store numbers from 1 to 100 and Print only the prime numbers

    public void printPrimeNumbers(){
        int finalNum=0;
        int counter=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=100;i++){
            list.add(i);
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            int num = Integer.parseInt(iterator.next().toString());
            if(num==1){
                System.out.println("The number is not a prime number: "+num);
            }else if(num>1 && num <=9){
                for(int i=2;i<num;i++){
                    if(num%i==0){
                        counter+=1;
                    }
                }
                if(counter==0){
                    System.out.println("The number is a prime number: "+num);
                }else{
                    System.out.println("The number is not a prime number: "+num);
                    counter=0;
                }
            }else{
                if(num%2==0 || num%3==0 || num%4==0 || num%5==0 || num%6==0 || num%7==0 || num%8==0 || num%9==0){
                    System.out.println("The number is not a prime number: "+num);
                }else{
                    System.out.println("The number is a prime number: "+num);
                }
            }
        }
    }
    public static void main(String[] args){
        InterviewProgram2 obj = new InterviewProgram2();
        obj.printPrimeNumbers();
    }
}


//        for(int i=1;i<=100;i++){
//            list.add(i);
//        }
//        for(int i : list){
//            if(i==2 || i==3 ||i==4 || i==5 || i==6 || i==7 || i==8 || i==9){
//                for(int j=2; j<=9;j++){
//
//                }
//            }else{
//                if(i%2 ==0 || i%3 ==0 || i%4 ==0 || i%5 ==0 || i%6 ==0 || i%7 ==0 || i%8 ==0 || i%9 ==0 ){
//                    System.out.println("The number is not a prime number"+i);
//                }else{
//                    System.out.println("The number is a prime number"+i);
//                }
//            }
//
//        }
//        String str = list.toString();
//        System.out.println(str);
//        String[] strArray = str.split(",");
//        StringBuilder strBldr = new StringBuilder();
//
//        System.out.println(strArray);
//        System.out.println(strArray[1]);
//        for(int i=0;i<strArray.length;i++){
//            if(Integer.parseInt(strArray[i])%2 == 0 || Integer.parseInt(strArray[i])%3 == 0 || Integer.parseInt(strArray[i])%4 == 0 || Integer.parseInt(strArray[i])%5 == 0 || Integer.parseInt(strArray[i])%6 == 0 || Integer.parseInt(strArray[i])%7 == 0 || Integer.parseInt(strArray[i])%8 == 0 || Integer.parseInt(strArray[i])%9 == 0){
//                System.out.println("The number is not a prime number"+i);
//            }else {
//                System.out.println("The number is a prime number"+i);
//            }
//        }


