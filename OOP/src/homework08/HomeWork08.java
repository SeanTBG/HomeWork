package homework08;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class HomeWork08 {
    public static void main(String[] args) {
        System.out.println("=======CheckingAccount=========");
        CheckingAccount account = new CheckingAccount(100);
        System.out.println("余额为：" + account.getBalance());
        account.deposit(50);
        System.out.println("余额为：" + account.getBalance());
        account.withdraw(100);
        System.out.println("余额为：" + account.getBalance());
        System.out.println("===========SavingAccount============");
        SavingAccount savi = new SavingAccount(100);
        savi.deposit(10000);
        savi.deposit(10000);
        savi.deposit(10000);
        savi.deposit(10000);
        savi.deposit(10000);
        System.out.println(savi.getBalance());
        System.out.println("===========earnMonthlyInterest============");
        // 月初定时器自动调用earnMonthlyInterest，重置面手续费次数，同时结算当月利息
        savi.earnMonthlyInterest();
        System.out.println(savi.getBalance());
        savi.withdraw(100);
        System.out.println(savi.getBalance()); // 无手续费取款
        savi.withdraw(100);
        savi.withdraw(100);
        System.out.println(savi.getBalance());
        savi.deposit(100); // 第四次存取款交易，产生手续费
        System.out.println(savi.getBalance());
    }
}
