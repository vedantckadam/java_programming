class Demo
{
    public void fun()
    {
        System.out.println("Inside Demo Fun");
    }

    public final void gun()
    {
        System.out.println("Inside Demo Gun");
    }

}

class Hello extends Demo
{
    public void gun()
    {
        System.out.println("Inside hello gun..");
    }
}
class Final_Method
{
    public static void main(String a[])
    {
        Hello hobj=new Hello();
        
    }
    
}
 
    

