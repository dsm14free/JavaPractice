package PracticePrograms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchCheckedException {
    public static void main(String[] args) {


        PrintWriter pw;
        try {
            pw = new PrintWriter(""); //may throw exception
            pw.println("saved");
        }
// providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
        }
        System.out.println("File saved successfully");
    }
}
