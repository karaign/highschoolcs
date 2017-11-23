import java.util.*;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(balance, name);
        
        account.deposit(505.22);
        System.out.println(account.balance);
        
        account.withdraw(100);
        System.out.println("The " + account.name + " account balance is, $" + account.balance);
    }
}
