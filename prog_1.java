import java.util.Scanner;
 class prog_1 
{
    public static void main(String args[])
    {
Scanner s=new Scanner(System.in);
System.out.println("enter a number::");
int x=s.nextInt();
if(x%2==0)
System.out.println("even number");
else
System.out.println("odd number");
System.out.println("enter your name::");
String name=s.next();
System.out.println("your name is "+name);
System.out.println("enter your gender");
char g=s.next().charAt(0);
System.out.println("your gender is "+g);
s.close(); //to close Scanner s object
}

}