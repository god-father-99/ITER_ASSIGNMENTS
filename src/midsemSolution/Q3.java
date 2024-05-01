package MidsemSolution;

import java.util.*;

class MyArithmeticException extends Exception {
    public MyArithmeticException(String s) {
        super(s);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter your preferred Arithmetic operation (*,/,-,+) : ");
        char op = sc.next().charAt(0);
        int c=0;
        try{
            if(a<b)
                throw new MyArithmeticException("a<b error occurred");
            switch (op) {
                case '+':
                    c=a+b;
                    System.out.println(c);
                    break;
                case '-':
                    c=a-b;
                    System.out.println(c);
                    break;
                case '*':
                    c=a*b;
                    System.out.println(c);
                    break;
                case '/':
                    try{
                        c=a/b;
                        System.out.println(c);
                        break;
                    }
                    catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                default:
                    System.out.println("Invalid operation");
            }
        }
        catch (MyArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
