package File_Handling;
import java.io.*;
public class Q5_FH {
    public static void main(String[] args) {
        File f=new File("D:/madhav html css/Project 4");
        try{
            File []f1=f.listFiles();
            for(File f2 : f1){
                if(f2.getName().endsWith(".html")){
                    System.out.println(f2.getName());
                }
            }
        }
        catch (SecurityException e){
            System.out.println(e);
        }
    }
}
