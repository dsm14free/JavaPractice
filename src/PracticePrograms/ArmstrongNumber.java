package PracticePrograms;

public class ArmstrongNumber {

    public void armstrongNumber(int num){
        String[] strNum = String.valueOf(num).split("");
        int numLength = strNum.length;
        int finalnum=0;
        for(int i=0;i<numLength;i++){
            finalnum+=(int)Math.pow(Integer.parseInt(strNum[i]), numLength);
        }
        if(finalnum == num){
            System.out.println("The numbers are: "+num+" , "+finalnum);
            System.out.println("The number is an armstrong number: "+num);
        }else{
            System.out.println("The numbers are: "+num+" , "+finalnum);
            System.out.println("The number is not an armstrong number: "+num);
        }
    }

    public static void main(String[] args){
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.armstrongNumber(153);
    }
}
