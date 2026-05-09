interface  Circle 
{   
    //Characteristics
    float Pi=3.14f;     //Public Static Final

    //Behaviour
    float Area(float Radius);

    float Circumference(float Radius);
    
}

class Marvellous implements Circle
{
    //Error Due to missing Body if Area and circumference 

}
class Demo_interface_Method 
{

    public static void main (String a[])
    {
        Marvellous mobj = new Marvellous();

    
    }
}