package Error_Handling;

public class Q1_EH {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.charAt(0));
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
