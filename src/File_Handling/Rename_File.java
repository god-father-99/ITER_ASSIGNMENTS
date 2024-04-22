package File_Handling;
import java.io.*;
public class Rename_File {
    public static void main(String[] args) {
        File f=new File("bkl.txt");
        File f2=new File("adi.txt");
        try{
            if (f.exists()) {
                f.renameTo(f2);
            }
        }
        catch (SecurityException e){
            System.out.println(e.getMessage());
        }
    }
}
