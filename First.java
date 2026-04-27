class First
 {
    public static void main(String A[])
    {

        Arithmetic aobj=new Arithmetic(11,10);
        int result=0;

        int result1=0;
 
        result=aobj.Addition();
        System.out.println("Addithinon is:"+result);

        result=aobj.Subtraction();
        System.out.println("Subtraction is:"+result);

        result=aobj.Multiplication();
        System.out.println("Multiplication is:"+result);

        /* */
    }   
}

class Arithmetic
{
    public int no1,no2;
    public Arithmetic() //constructor
    {
        this.no1=100;
        this.no2=200;
    }

    public Arithmetic(int value1, int value2)
    {
        this.no1=value1;
        this.no2=value2;
    }

    public int Addition()
    {
        int ans =0;
        ans=this.no1+this.no2;
        return ans;
    }  

    public int Subtraction()
    {
        int ans =0;
        ans=this.no1-this.no2;
        return ans;
    }

    public int Multiplication()
    {
        int ans =0;
        ans=this.no1*this.no2;
        return ans;
    }
}
