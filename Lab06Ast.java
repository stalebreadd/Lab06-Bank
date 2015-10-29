// Lab06Ast.java
// The First Bank Program
// Object Methods and Output Formatting
// This is the student, starting version of Lab 06A.

import java.text.DecimalFormat;

public class Lab06Ast
{
    public static void main(String args[])
    {
      // Create DecimalFormat and Bank Objects
      DecimalFormat money = new DecimalFormat("$00,000.00");
      Bank tom;
      tom = new Bank();
      tom.checkingDeposit(0);
      tom.savingsDeposit(0);
      
      
      Bank suzy;
      suzy = new Bank();
      suzy.checkingDeposit(1600);
      suzy.savingsDeposit(32000);
      
      Bank bill;
      bill = new Bank();
      bill.checkingDeposit(8000);
      bill.savingsDeposit(57420);
      
      // Display Initial Balances
      System.out.println("INITIAL BALANCES: ");
      System.out.println("Tom's checking balance:" + " "  + tom.getChecking());
      System.out.println("Tom's savings balance:" +  " "  + tom.getSavings());
      System.out.println("Suzy's checking balance" +  " " + suzy.getChecking());
      System.out.println("Suzy's savings balance:" + " "  + suzy.getSavings());
      System.out.println("Bill's checking balance:" + " " + bill.getChecking());
      System.out.println("Bill's savings balance:" + " " + bill.getSavings());
      
      
      // Deposits and Withdrawals
      tom.checkingDeposit(500);
      tom.savingsDeposit(7000);
      suzy.checkingDeposit(20000);
      suzy.savingsWithdrawal(20000);
      bill.checkingWithdrawal(8000);
      bill.savingsWithdrawal(57420);
      
      
      // Display Final Balances
      System.out.println();
      System.out.println("Tom's checking balance:" + " " + tom.getChecking());
      System.out.println("Tom's savings balance:" + " " + tom.getSavings());
      System.out.println("Suzy's checking balance:" + " " + suzy.getChecking());
      System.out.println("Suzy's savings balance:" + " " + suzy.getSavings());
      System.out.println("Bill's checking balance:" + " " + bill.getChecking());
      System.out.println("Bill's savings balance:" + " " + bill.getSavings());
    }
}
