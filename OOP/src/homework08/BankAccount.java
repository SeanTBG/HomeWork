package homework08;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class BankAccount {
    private double balance; // 账户余额
    public BankAccount(double initialBalance) {
        this.balance = (int) initialBalance;
    }
    public void deposit(double amount) {
        // 存款
        balance += amount;
    }
    public void withdraw(double amount) {
        // 取款
        balance -= amount;
    }
    public double getBalance() {
        // 获取余额
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
