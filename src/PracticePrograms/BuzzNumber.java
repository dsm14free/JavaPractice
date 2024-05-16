package PracticePrograms;

public class BuzzNumber {

    public void buzzNumber(int num){
        String[] strArray = String.valueOf(num).split("");
        int firstNum = Integer.valueOf(strArray[strArray.length-1]);
        int secondNum = num%7;
        if(firstNum==7 || secondNum==0){
            System.out.println("The number is Buzz Number: "+num);
        }else{
            System.out.println("The number is not a Buzz Number: "+num);
        }
    }
    public static void main(String[] args){
        BuzzNumber obj = new BuzzNumber();
        obj.buzzNumber(37);
    }
}
