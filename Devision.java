import java.util.*;

class Devision {
    public static void main (String A[])
    {
        Scanner sobj =new Scanner(System.in);
        float No1,No2,Ans=0.0f;

        System.out.println("Enter First Number");
        No1=sobj.nextFloat();

        System.out.println("Enter Second Number");
        No2=sobj.nextFloat();

        Ans=No1/No2;
        
        System.out.println("Division is : "+Ans);

    }
    
}
