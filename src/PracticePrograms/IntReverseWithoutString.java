package PracticePrograms;

public class IntReverseWithoutString {

    public void intReverse(int num){
        int reverseNum=0;
        int tempNum=0;
        int counter=0;
        while(num>0){
            if(counter==0){
                tempNum=num%10;
                reverseNum=tempNum*10;
                num=num/10;
                counter+=1;
            }else{
                tempNum = num%10;
                reverseNum+=tempNum;
                num=num/10;
                if(num!=0){
                    reverseNum*=10;
                }
            }
        }
        System.out.println("The reverse number is: "+reverseNum);
    }

    public static void main(String[] args){
        IntReverseWithoutString obj = new IntReverseWithoutString();
        obj.intReverse(5428);
    }
}
