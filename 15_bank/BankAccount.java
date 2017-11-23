
/**
 * Represents a bank account.
 * 
 * @author  Kara I
 * @version 1.0
 */
public class BankAccount
{
    public double balance;
    public String name;
    
    public BankAccount (double initialBalance, String customerName) {
        balance = initialBalance;
        name = customerName;
    }
    
    public void deposit (double amount) {
        balance += amount;
    }
    
    public void withdraw (double amount) {
        balance -= amount;
    }
}
