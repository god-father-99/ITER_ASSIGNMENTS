package CSW_4th_Sem.Error_Handling;
import java.util.*;
public class Q7_EH {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.print("enter a String to be converted to a no : ");
            String s=sc.next();
            try {
                int n = Integer.parseInt(s);
                System.out.println(n);
                break;
            }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("enter a valid String");
            }
        }
    }
}
