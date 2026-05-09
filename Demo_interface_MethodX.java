interface  Circle 
{   
    //Characteristics
    float Pi=3.14f;     //Public Static Final
    
    //Behaviour
    float Area(float Radius);
    float Circumference(float Radius);

}

public class Marvellous implements Circle
{

    public float Area(float Radius)
    {
        return Circle.Pi*Radius*Radius ;
    }

    public float Circumference(float Radius)
    {
        return 2*Circle.Pi*Radius;
    }
}

public class Demo_interface_MethodX
{
    public static void main (String a[])
    {
        Marvellous mobj = new Marvellous();
        float ret=0.0f;

        ret=mobj.Area(12.4f);
        System.out.println("Radius :"+ret);
        ret=mobj.Circumference("Circumference:"+12.4f);

    
    }
}