class SingletonDemo
{
String name;
static SingletonDemo ob;
private SingletonDemo(){}
public static SingletonDemo getInstance()
{
if(ob==null)
{
ob=new SingletonDemo();
return ob;
}
return ob;
}
}
class TestSingleton
{
public static void main(String args[])
{
SingletonDemo ob1=SingletonDemo.getInstance();
ob1.name="Goli";
SingletonDemo ob2=SingletonDemo.getInstance();
System.out.println(ob2.name);
}
}