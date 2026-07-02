class Marvellous 
{
    public int i,j,k;
    public Marvellous(int A,int B,int C)
    {
        this.i=A;
        this.j=B;
        this.k=C;
    }


}

class  EqualsDemo 
{
    public static void main(String[] args) 
    {  
        Marvellous mobj=new Marvellous(11, 21, 51);
        Marvellous mobjX=new Marvellous(11, 21, 51);

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