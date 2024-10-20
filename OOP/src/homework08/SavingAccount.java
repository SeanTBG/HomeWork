package homework08;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class SavingAccount extends BankAccount{
    // 每个月有利息产生，每个月有三次免手续费的操作（存款或取款）
    // 利息产生和重置交易次数都在earnMonthlyInterest方法中完成
    private int count = 3;
    private double rate = 0.01; // 利率

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--; // 免手续费次数-1
    }
    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount - 1);
        }
        count--; // 免手续费次数-1
    }
    public void earnMonthlyInterest() {
        // 月初重置免手续费次数
        count = 3;
        super.deposit(getCount() * rate);
    }
}
