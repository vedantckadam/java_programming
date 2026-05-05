abstract class Demo 
{
public int i,j;
public int Add(int a,int b)
{
      return a+b;   
}

public abstract int sub(int a,int b);
    
}

class Hello extends Demo
{
    public int sub(int a,int b)
    {
        return a-b;
    }

}
class Abstract_Demo_Complete 
{
      public static void main(String a[])
    {
        Hello hobj=new Hello();
        hobj.sub(10, 020);
        
            
    }

}
