package PracticePrograms;

import java.util.StringTokenizer;

public class StringTokenizerClass {

    public static void main(String[] args){
        StringTokenizer st1 = new StringTokenizer("By using String Tokenizer Tokens", " ");
        System.out.println("Total number of tokens: "+ st1.countTokens());
        while(st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        System.out.println();

        StringTokenizer st2 = new StringTokenizer("By using String Tokenizer Elements", " ");
        System.out.println("Total number of tokens: "+ st2.countTokens());
        while(st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}
