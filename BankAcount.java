import java.util.Scanner;

import javax.swing.plaf.basic.BasicLabelUI;

import javafx.print.PrintColor;

// import java.util.Scanner;

// public class BankAcount {
//     int balance=0;
//      public static void deposit(int amt) 
//      {
//          balance=balance+amt;
//         }   
//         public static int withdraw ()
//         {
//             Scanner sc=new Scanner(System.in);
//             System.out.println("enetr the amount to be withdrawn!");
//             int val=sc.nextInt();
//             if(val>BankAcount.balance)
//             {
//                 System.out.println("not enough money in account!");
                
//             }
//             else 
//             {
//                 BankAcount.balance=BankAcount.balance-val;
                
//             }
            
//             return BankAcount.balance;
            
            
//         } 
//         public static void TestBankAccount ()
//         {

//         } 



// }

public class BankAcount
{
    int balance;
    void deposit(int amt)
    {
        balance=balance+amt;
    }
    int withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to be withdrawn!");
        int amt=sc.nextInt();
        if(amt>balance)
        System.out.print("insufficient balance");
        else
        balance=balance-amt;
        return balance;
    }
    class TestBankAccount
    {
      public static void main (String args[])
      {
        BankAcount om=new BankAcount();
        om.deposit(500);
        int b=om.withdraw();
        System.out.println("your balance is"+b);
      }  
    }
}