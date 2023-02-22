
import java.util.Scanner;
class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many subjects u have studied inn last sem");
        int n = sc.nextInt();
        int marks[][] = new int[n][];
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter how many  CA of subject"+(i+1));
            int k = sc.nextInt();
            marks[i]=new int[k];
            for(int j=0;j<k;j++)
            {
                System.out.println("Enter marks of CA "+(j+1)+" of subject "+(i+1));
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks[i].length;j++)
            {
                System.out.print(marks[i][j]+",");
            }
            System.out.println();
        }
        sc.close();
    }
}