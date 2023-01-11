package PracticePrograms;

public class stringPallindrome {

    public boolean strPallindrome(String str){
        String inputStr = str;
        String outputStr = "";
        for(int i=str.length()-1; i>=0; i--){
            outputStr = outputStr + str.charAt(i);
        }
        System.out.println("Input String is: "+inputStr);
        System.out.println("Output String is: "+outputStr);
        if(inputStr.equals(outputStr)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        stringPallindrome strPalObj = new stringPallindrome();
        boolean isPallindrome = strPalObj.strPallindrome("HeleH");
        System.out.println("String is Pallindrome: "+isPallindrome);
    }
}
