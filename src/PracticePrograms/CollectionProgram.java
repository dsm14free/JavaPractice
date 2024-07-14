package PracticePrograms;

import java.util.*;

public class CollectionProgram {

    public void listProgram(){
        List<String> list = new ArrayList<String>();
        list.add("Hello3");
        list.add("Hello");
        list.add("Hello1");
        list.add("Hello2");

        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("");
        set.add("Hello1");

        Map<String, Integer> map = new TreeMap<>();
        map.put("Hello", 1);
        map.put("Hello1", 1);
        map.put("Hello2",0);
        map.put("",2);
        map.put("",3);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Hello", 1);
        map1.put("Hello1", 1);
        map1.put("Hello2",0);
        map1.put("",2);
        map1.put("",3);



        System.out.println("List: "+list);
        System.out.println("Set: "+set);
        System.out.println("Map: "+map);
        System.out.println("Map1: "+map1);
    }
    public static void main(String[] args){
        CollectionProgram obj = new CollectionProgram();
        obj.listProgram();
    }
}
