package File_Handling;
import java.io.*;
public class Q6 {
    public static void main(String[] args) {
        File f=new File("iary.txt");
        try{
            f.delete();
        }
        catch (SecurityException e){
            System.out.println(e);
        }
    }
}
