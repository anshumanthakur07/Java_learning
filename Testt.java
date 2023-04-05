// class A
// {
//     int x;
// 	public static void main(String[] args) {
// 	    A ob1=new A();
// 	    A ob2=new A();
// 	    ob2.x=7;
	   
// 		System.out.println(ob1.x+ob2.x);
// 	}
// }
// class vari
// {
//     static int x;
// 	public static void main(String[] args) {
// 		String obj="Hai";
// 		String obj1="fine";
// 		String obj2="Hai";
// 	   System.out.println(obj.equals(obj1)+" "+obj.equals(obj2));
// 	}
// }
// class thiskeyword
// {
// 	private int a=4;
// 	private int b=1;
// 	void getsum(int a,int b)
// 	{
// 		this.a=a;
// 		this.b=b;
// 		System.out.println(this.a+this.b);
// 	}
// }
// public class vari{
// 	public static void main(String[] args) {
// 		StringBuffer a=new StringBuffer("Hello India");
// 		StringBuffer b=new StringBuffer("Hello World");
// 		StringBuffer c=new StringBuffer("Hello Java");
// 		System.out.print(a.delete(0,6));
// 		System.out.print(b.delete(0,b.length()));
// 		System.out.print(c.delete(0,2));

// 	}
// }

// final class Complex{
// 	private final double re;
// 	private final double im;
// 	public Complex(double re,double im){
// 		this.re=re;
// 		this.im=im;
// 	}
// 		public String toString() {
// 			return "(" + re + " + " + im + "i)";	
// 		}
// 	}

// 	class vari{
// 		public static void main(String[] args) {
// 			Complex c=new Complex(25,25);
// 			System.out.println("Complex number is"+c);
// 		}
// 	}
// class  vari {

// 	public static void main(String args[])    {
   
// 		String s1 = "Hello";

// 		String s2 = s1;

// 		System.out.println("Output: "+ s1 == s2);

// }
// }

// class vari {

// 	public static void main(String args[])    {
   
// 				  StringBuilder sb1 = new StringBuilder("I love java");
   
// 				  StringBuilder sb2 = new StringBuilder("I love java");
   
// 				  System.out.println(sb1.equals(sb2));
   
	
   
// 	  }
   
//    }

// class vari {

// 	public static void main(String args[])    {
   
// 				  StringBuilder sb = new StringBuilder("I love java");
   
// 								 sb.delete(6,4);
   
// 						System.out.println(sb);
   
	
   
// 	  }
   
//    }
// public class Testt
// {
// 	static int x;
// 	public static void main(String[] a)
// 	{
// 		Testt test=new Testt();
// 		Testt test1=new Testt();
// 		test.x++;
// 		System.out.println(test.x+test1.x);
// 	}
// }

public class Testt { 
	public static void main(String[] args) { 
	String s1 = "hello"; 
	String s2 = new String("hello"); 
	String s3 = "hello"; 
	if (s1 == s2) { 
	System.out.print("s1 and s2 equal"); 
   } 
  else { 
	System.out.print("s1 and s2 not equal");
   } 
	if (s1 == s3) { 
	System.out.print(" s1 and s3 equal");
   } 
  else { 
	System.out.print(" s1 and s3 not equal");
   } } }
	  
   
   // public class StrEqual { 
//   public static void main(String[] args) { 
//   String s1 = "hello"; 
//   String s2 = new String("hello"); 
//   String s3 = "hello"; 
//   if (s1 == s2) { 
//   System.out.print("s1 and s2 equal"); 
//  } 
// else { 
//   System.out.print("s1 and s2 not equal");
//  } 
//   if (s1 == s3) { 
//   System.out.print(" s1 and s3 equal");
//  } 
// else { 
//   System.out.print(" s1 and s3 not equal");
//  } } }



// public class StrEqual {
//   public static void main(String[] args) { 
//   String str = null;
//   System.out.println(str.valueOf(10)); 
//  } }


// public class StrEqual {
//   public static void main(String[] args) { 
// String s1 = "Java"; 
// String s2 = "Java"; 
// StringBuilder sb1 = new StringBuilder(); sb1.append("Ja").append("va"); 
// System.out.println(s1 == s2);
// System.out.println(s1.equals(s2));
// System.out.println(sb1.toString() == s1); 
// System.out.println(sb1.toString().equals(s1));
//  } }


//  class output     {        public static void main(String args[])        {             
//             String c = new String("Hello");             String c1 = new String(" World");             c.append(c1);
//              System.out.println(c);
//         }    }

  class output {
	public static void main(String args[]){            
		String a = "hello i love java";           
		System.out.println(a.indexOf('e')+a.indexOf('a')+a.lastIndexOf('l')+" "+a.lastIndexOf('v'));      
		}   
}



