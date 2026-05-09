interface  Circle 
{   
    //Characteristics
    float Pi=3.14f;     //Public Static Final


    
}
class Demo_interface
{

    public static void main (String a[])
    {
        System.out.println(Circle.Pi);
        Circle.Pi=7.13f;//Error due to Final
    }
}