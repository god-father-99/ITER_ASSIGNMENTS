package CSW_4th_Sem.Error_Handling;

public class Q10_EH {
    public static void main(String[] args) {
        double x=90;
        try {
            double n=(Math.sin(x)+Math.cos(x))/Math.tan(x);
            System.out.println(n);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
