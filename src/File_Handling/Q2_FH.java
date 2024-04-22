package File_Handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2_FH {
    public static void main(String[] args) {
        String s="";
        try{
            FileReader fr=new FileReader("Diary.txt");
            while (fr.ready()){
                s+=(char)(fr.read());
            }
            System.out.println(s);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        try{
            FileWriter fw=new FileWriter("CSW2.txt",true);
            String s1=s;
            fw.write(s);
            fw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
