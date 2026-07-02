class Marvellous
{
    public Marvellous()
    {
        System.out.println("Inside Contructor");
    }

    protected void finalize()
    {
        System.out.println("Inside Finalize method");
    }

}



class  FinalizeDemo
{
    public static void main(String[] args)
    {
        Marvellous mobj =new Marvellous();
        Marvellous mobj2=mobj;

        mobj=null;
        mobj2=null;
        System.gc();

        System.out.println("EnD OF MAIN");
    }
}