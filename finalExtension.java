class FinalDemo {
    float pi=3.14f;
    public void area(int r)
    {
        System.out.println(pi*r*r);
    }
    public static void main(String args[])
    {
        FinalDemo ob1=new FinalDemo();
        // ob1.pi=7.25;
        ob1.area(2);
    }
}
class finalExtension extends FinalDemo
{
    public void area(int r)
    {
        System.out.println("area of circle is "+(pi*r*r)+" when radius is "+r);
    }
}
    class xyx{
    public static void main(String args[])
    {
        {
            finalExtension ob1=new finalExtension();
            ob1.area(2);
        }
    }
}

