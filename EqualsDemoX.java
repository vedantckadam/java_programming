public class Marvellous 
{
    public int i,j,k;
    public Marvellous(int A,int B,int C)
    {
        this.i=A;
        this.j=B;
        this.k=C;
    }

    public boolean equals(Object obj2)
    {
        Marvellous temp =(Marvellous)obj2;

        if((this.i == temp.i) && (this.k==temp.k) && (this.j==temp.k))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

class  EqualsDemoX
{
    public static void main(String[] args) 
    {  
        Marvellous mobj=new Marvellous(11, 21, 51);
        Marvellous mobjX=new Marvellous(11, 1, 51);

        if(mobj.equals(mobjX))
        {
            System.out.println("Objecys Are Identical");
        }
        else
        {
           System.out.println("Objecys Are DiFFerent"); 
        }

    }
} 
    

