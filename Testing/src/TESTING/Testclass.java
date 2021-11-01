package TESTING;
import java.text.NumberFormat;
public class Testclass {
    private static final double RATE = 0.035;
    private long accNumber;
    private double balance;
    private String name;
    
    public Testclass(String owner, long account, double initial) {
        name = owner;
        accNumber = account;
        balance = initial;
    }
    
    public double deposit(double amount) {
        balance += balance + amount;
        return balance;
    }
    
    public double withdraw(double amount, double fee) {
        balance = balance - amount - fee;
        return balance;
    }
    
    public double addInterest() {
        balance += balance * RATE;
        return balance;
    }
    
    public double getBalance() {
        return balance;
    }
    public void getBalance(double bala) {
        balance = bala;
    }
    
    public long getAccNumber() {
        return accNumber;
    }
    public void getAccNumber(long accN) {
        accN = accNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (accNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}


