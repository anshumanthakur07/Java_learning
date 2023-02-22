//write a prog to prime no

import java.util.Scanner;

public class ques {
    static int x;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("enter a number::");
        int x=s.nextInt();
        int k=0;
        if(x==1 ||x==2)
        System.out.println("prime number");
        
        else
        {
            for(int i=2;i<x;i++)
            {
                if(x%i==0){
                
                    k=1;
                    break;
                }    
            }
            if(k==0)
            System.out.println("a prime number");
            else
            System.out.println("not a prime number");

            

            
        }
        
        



   }
}
