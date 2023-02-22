import java.util.Scanner;

class patient
{
String name;
int age;
long contact;
int id;
static int u;
patient(String n,int a,long c)
{
name=n;
age=a;
contact=c;
id=u+1;
u++;
}
 static void display(int i,patient p[])
{
for(patient m:p)
{
if(m.id==i){



    System.out.println("Name of patient is "+m.name);
    System.out.println("age of patient is "+m.age);
    System.out.println("contact of patient is "+m.contact);
    return;
}
}
System.out.println("no details found!");
}
public static void main(String args[])
{
    patient anshu=new patient("anshuman", 20, 84001);
    patient tiger=new patient("tiger", 20, 84001);
    patient aashu=new patient("aashu", 20, 84001);
    patient goli=new patient("goli", 20, 84001);
    patient p[]={anshu,tiger,aashu,goli};
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the id for getting details");
    int i=sc.nextInt();
    patient.display(i, p);
    sc.close();
}
}