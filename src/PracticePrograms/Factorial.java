package PracticePrograms;

public class Factorial {

    public void factorialNum(int num){
        int finalNum=1;
        for(int i=num;i>0;i--){
            finalNum*=i;
        }
        System.out.println("The factorial of the number is: "+finalNum);
    }
    public static void main(String[] args){
        Factorial obj = new Factorial();
        obj.factorialNum(4);
    }
}
