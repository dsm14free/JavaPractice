package PracticePrograms;

import java.util.*;
import java.util.stream.Collectors;

public class StringCollectionJoining {
    public static void main(String[] args){
        List<String> listStr = Arrays.asList("abc","xyz");
        String str = listStr.stream().collect(Collectors.joining(", "));
        System.out.println(str.toString());
    }
}
