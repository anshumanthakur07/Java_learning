
// import java.util.Scanner;

// import javax.lang.model.util.ElementScanner6;

// public class ques2 {
//     static int x;
//     public static void main(String args[])
//     {
//         Scanner s=new Scanner(System.in);

//         System.out.println("enter a number 1::");
//         int x=s.nextInt();
//         System.out.println("enter a number 2::");
//         int y=s.nextInt();
//         if(x==y)
//         {
//             int z=x+y;
//             System.out.println("sum is ::"+z);
//         }
//         else 
//         {
//             if(x>y)
//             {
//                 int z=x-y;
//             System.out.println("answer is::"+z);
//             }else
//             {
//                 int z=y-x;
//             System.out.println("answer is::"+z);
//             }
//         }  
//    }
// }
import java.io.*;
import java.util.*;

public class ques2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        float gold=s.nextFloat();
        float silver=s.nextFloat();
        String choice=s.next();
        float weight=s.nextFloat();
        
        if(weight>=0.01 && weight<=1000 && gold<1000000 && silver<1000000)
        {
            float one_grm_gold=gold/10;
            float one_grm_silver=silver/1000;
            if(choice=="gold")
            {
            float ans=one_grm_gold*weight;
             System.out.print(ans);
            }
            else
            {
               float ans=one_grm_silver*weight;
             System.out.print(ans); 
            }

            
        }
        else
            System.out.print("Invalid Input");


    }
}