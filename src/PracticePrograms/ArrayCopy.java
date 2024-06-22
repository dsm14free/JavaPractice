package PracticePrograms;

import java.util.Arrays;

public class ArrayCopy {

    String name;
    public String getName(){
        return name;
    }
    public void arrayCopy(int[] intArray){

        int[] copyIntArray= new int[intArray.length];
        System.arraycopy(intArray, 2, copyIntArray, 0,5);
        System.out.println(Arrays.toString(copyIntArray));
        String str = "\"Hello\": "+getName()+",\n"+"\"number: \"";
        System.out.println(str);
    }

    public static void main(String[] args){
        ArrayCopy obj = new ArrayCopy();
        obj.arrayCopy(new int[] {1,2,3,4,5,6,7});
    }
}
