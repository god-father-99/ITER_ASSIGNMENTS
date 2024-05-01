package MidsemSolution;

import java.util.*;
import java.io.*;

public class Q5 {
    public static boolean isPrime(int n) {
        if(n < 2)
            return false;
        for (int i = 2; i*i<=n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void printPrimeFile(File f){
        if(!f.exists())
            System.out.println("File not found");
        else {
            try {
                FileReader fr = new FileReader(f);
                System.out.print("Prime numbers in the file are : ");
                while (fr.ready()) {
                    char ch = (char) fr.read();
                    if(ch==' ')
                        System.out.print(" ");
                    else
                        System.out.print(ch);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the no. of elements you want to enter in the array : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements you want to enter in the array");
        for(int i=0;i<n;i++){
            System.out.print("enter the "+(i+1)+"th element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(isPrime(arr[i]))
                System.out.println(arr[i]+" is a prime number");
        }
        File f=new File("adi.txt");
        if(!f.exists())
            System.out.println("File not found");
        else{
            try{
                FileWriter fw=new FileWriter(f);
                for(int i=0;i<n;i++){
                    if(isPrime(arr[i]))
                        fw.write(arr[i]+" ");
                }
                fw.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
            printPrimeFile(f);
        }
    }
}
