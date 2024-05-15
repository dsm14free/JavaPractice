package PracticePrograms;

public class InterviewProgram1 {
    //Array 1 to 7, value: d=2
    //3,4,5,6,7,1,2

    public static void rotateArray(String[] strArray, int d){

        int num=d;
        StringBuilder strBldr = new StringBuilder();
        StringBuilder prevStrBldr = new StringBuilder();
        String numStr = String.valueOf(num);
        for(int i=0;i<strArray.length;i++){
            prevStrBldr.append(strArray[i]);
            if(strArray[i].equals(numStr)){
                for(int j=i+1; j< strArray.length; j++){
                    strBldr.append(strArray[j]);
                }
                break;
            }
        }
        String newString = strBldr.append(prevStrBldr).toString();
        System.out.println("The rotated values are: "+newString);
    }

    public static void main(String[] args){
        String[] strArray = {"1","2","3","4","5","6","7"};
        int[] intArray = {1,2,3,4,5,6,7};
        InterviewProgram1.rotateArray(strArray,2);
    }
}
