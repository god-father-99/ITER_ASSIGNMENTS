package File_Handling;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q1_FH {
    public static void main(String[] args) {
        File f=new File("Diary.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now=LocalDate.now();
        String s= dtf.format(now);
        try {
            FileWriter fw=new FileWriter("Diary.txt",true);
            fw.write(s+"\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data you want to be in your diary : ");
        String s1=sc.nextLine();
        try{
            FileWriter fw=new FileWriter("Diary.txt",true);
            fw.write(s1);
            fw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
