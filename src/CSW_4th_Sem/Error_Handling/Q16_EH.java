package CSW_4th_Sem.Error_Handling;

public class Q16_EH {
    public static void main(String[] args) {
        int [] arr=new int[5];
        try{
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
