package homework08;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class CheckingAccount extends BankAccount{
    // 在BankAccount的基础上，对每次存款取款操作都收取1块钱的手续费

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
