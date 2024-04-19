package CSW_4th_Sem.Error_Handling;

public class Q12_EH {
    public static void main(String[] args) {
        double x=90;
        try{
            double ans=Math.sqrt(Math.abs(Math.sin(x)*Math.cos(x)))/(Math.tan(x)+1);
            System.out.println("ans is : "+ans);
        }
        catch(ArithmeticException e ){
            System.out.println(e.getMessage());
        }
    }
}
