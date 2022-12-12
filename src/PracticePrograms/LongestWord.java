package PracticePrograms;

public class LongestWord {
    public void findLongestWord(String sentence){
        String longestWord = "";
        int tempLen=0;
        int effLen=0;
        String[] strArray = sentence.split(" ");
        for(int i=0; i<strArray.length; i++){
            if (i==0){
                tempLen = strArray[i].length();
            } else{
                effLen = strArray[i].length();
            }
            if (effLen > tempLen){
                longestWord = strArray[i];

            } else {
                longestWord = strArray[i];
            }
        }
        System.out.println("Longest Word: " +longestWord);
    }

    public static void main(String[] args){
        LongestWord longWordObj = new LongestWord();
        longWordObj.findLongestWord("This is the longest word in dicti onary");
    }
}
