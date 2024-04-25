package PracticePrograms;

public class FirstNonDuplicateChar {

    public void firstNDuplicateChar(String str){
        char[] charArray = str.toCharArray();
        for(int i=0;i<str.length();i++){
            int beginIndex=i+1;
            int endIndex=i;

            if(str.indexOf(charArray[i],beginIndex,str.length())==-1) {
                if (str.indexOf(charArray[i], 0, endIndex) == -1) {
                    System.out.println("Hello: " + charArray[i]);
                    char nonDuplicateChar = charArray[i];
                    System.out.println("The first non duplicate character in the string is: " + charArray[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        FirstNonDuplicateChar obj = new FirstNonDuplicateChar();
        obj.firstNDuplicateChar("dad");
    }
}

/** Using IndexOf and SubString **/
/** public void firstNDuplicateChar(String str){
    char[] charArray = str.toCharArray();
    for(int i=0;i<str.length();i++){
        int beginIndex=i+1;
        int endIndex=str.length();
        String subStr=str.substring(beginIndex,endIndex);
        System.out.println("The sub string is: "+subStr);
        System.out.println("SubString: "+subStr.indexOf(charArray[i]));
        if(subStr.indexOf(charArray[i])==-1){
            String prevSubStr=str.substring(0,i);
            System.out.println("PrevSubString: "+prevSubStr.indexOf(charArray[i]));
            if(prevSubStr.indexOf(charArray[i])==-1){
                char firstNonDuplicateChar=charArray[i];
                System.out.println("The first non duplicate character in the string is: "+firstNonDuplicateChar);
                break;
            }
        }
    }
} **/

/** Using ChrArray **/
/** public void returnFirstNonRepeatedChar(String str){
    char[] charArray = str.toCharArray();
    int count=0;
    for(int i=0;i<charArray.length;i++){
        for(int j=0;j<charArray.length;j++){
            if(charArray[i]==charArray[j]){
                count++;
            }
        }
        if(count==1){
            System.out.println("The non repetitive character is: "+charArray[i]);
            break;
        }else{
            count=0;
        }
    }
} **/