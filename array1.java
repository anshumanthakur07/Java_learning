import java.util.Scanner;

public class array1 {
    public static void main(String[] rk)
    {
  
        Scanner s=new Scanner(System.in);

        System.out.println("enter no of subjects::");
        int x=s.nextInt();
        int sum=0;
        for(int i=0;i<x;i++)
        {
            System.out.println("enter no of subject::"+i);
            sum=sum+s.nextInt();
            
        }
        System.out.println(sum );
        
        sum=sum/500;
        sum=sum*100;
        System.out.println("PERCENTAGE IS "+sum+"%" );



    }

    
}
