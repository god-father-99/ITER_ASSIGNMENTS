package File_Handling;

import java.io.File;

public class Q10_FH {
    public static void printFiles(File f){
        File [] f1=f.listFiles();
        for(File f2: f1){
            if(f2.isDirectory())
                printFiles(f2);
            else
                System.out.println(f2.getName());
        }
    }
    public static void main(String[] args) {
        File f=new File("D:/madhav html css/Project 4");
        printFiles(f);
    }
}
