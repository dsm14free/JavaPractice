package PracticePrograms;

public class CountNumberOfLetters {

    public void countNumberOfLetter(String str){
        char[] charArray = str.toCharArray();
        String newStr="";
        int counter=0;
        for(int i=0;i<charArray.length;i++){
            for(int j=0;j<charArray.length;j++){
                if(charArray[i]==charArray[j] && !newStr.contains(String.valueOf(charArray[i]))){
                    counter+=1;
                }
            }
            newStr= newStr + charArray[i];
            if(counter!=0){
                System.out.println("The occurrences of the letter: "+charArray[i]+" is: "+counter+" times.");
            }
            counter=0;
        }
    }

    public static void main(String[] args){
        CountNumberOfLetters obj = new CountNumberOfLetters();
        obj.countNumberOfLetter("helloallworld");
    }
}
