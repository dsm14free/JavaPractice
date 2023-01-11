package PracticePrograms;

public class LongestWordConcatReplace {
    public String LongestWordConcatAndReplace(String str){
        String[] strArray = str.split(" ");
        String temp = "";
        for(int i=0; i<strArray.length-1; i++){
                if(strArray[i].length() >= strArray[i+1].length()) {
                    if (temp.length() < strArray[i].length())
                        temp = strArray[i];
                }else {
                    if (temp.length() < strArray[i+1].length())
                        temp = strArray[i+1];
                }
        }

        String concatStr = temp.concat("hjdkasjajdbjaj");
        char[] charArray = concatStr.toCharArray();

        for(int i=3; i<concatStr.length(); i+=3){
            charArray[i] = 'X';
        }
        String replacedStr = new String(charArray);
        return replacedStr;

    }
    public static void main(String[] args){
        LongestWordConcatReplace longStr = new LongestWordConcatReplace();
        String finalString = longStr.LongestWordConcatAndReplace("Thisssssss is Helloooo Wordjbbjhihbb");
        System.out.println("Longest first word in the string is: "+finalString);
    }
}
