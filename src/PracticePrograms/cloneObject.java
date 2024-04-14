package PracticePrograms;

public class cloneObject implements Cloneable{
    int rollNo;
    String name;

    public Object Clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public cloneObject(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args){
        try{
        cloneObject cloneObj = new cloneObject(4, "DurgaShankar");
        cloneObject cloneedObj = (cloneObject)cloneObj.clone();
        System.out.println("The rollNo and name is: "+cloneObj.rollNo+" , "+cloneObj.name);
        System.out.println("The rollNo and name is: "+ cloneedObj.rollNo+" , "+cloneedObj.name);
        System.out.println(cloneObj == cloneedObj);
    }catch(CloneNotSupportedException c){}
}}
