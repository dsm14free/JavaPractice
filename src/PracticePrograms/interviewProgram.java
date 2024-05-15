package PracticePrograms;

public class interviewProgram {
    //durga123shankar456
    //123+456
    public static void addNumbersOnly(String str){
        int num=0;
        String[] strArray = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        int[] intArray = new int[str.length()];
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].contains("0") || strArray[i].contains("1") || strArray[i].contains("2") || strArray[i].contains("3") || strArray[i].contains("4") || strArray[i].contains("5") || strArray[i].contains("6") || strArray[i].contains("7") || strArray[i].contains("8") || strArray[i].contains("9")){
                intArray[i] = Integer.parseInt(strArray[i]);
            }
        }
        for(int j=0; j<intArray.length; j++){
            num += intArray[j];
        }
        System.out.println("The addition of the numbers is: "+num);
    }

    public static void main(String[] args){
        interviewProgram.addNumbersOnly("durga123shankar456");
    }
}
