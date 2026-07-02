



class Encapsulation
{
    private int age;
    private void setAge(int age)
    {
        if (age>=0)
        {
            this.age=age;
        }
        else
        {
            System.out.println("Invalid Age");
        }
    }

    public int GetAge()
    {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation ej=new Encapsulation();
        ej.setAge(12);
        int ret=ej.GetAge();

        System.out.println(ret);
    }
}