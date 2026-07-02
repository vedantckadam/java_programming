class Student
{
    public String Name;
    public int Marks;
    public int Age;

    Student(String A,int B,int C)
    {
        this.Name=A;
        this.Age=B;
        this.Marks=C;
    }
    public String toString()
    {
        return "Vedat Chetan Kadam";
    }
}

class  toStringDemoStudent
{
    public static void main(String[] args)
    {
       Student sobj=new Student("Amit", 27, 98);
       System.out.println(sobj);
    }
}