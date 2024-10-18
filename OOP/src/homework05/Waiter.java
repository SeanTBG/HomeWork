package homework05;

/**
 * @author: Sean
 * @date: 2024/10/19
 * @project: HomeWork
 */
public class Waiter extends Staff {
    public Waiter(String name, double monthSalary) {
        super(name, monthSalary);
    }

    @Override
    public void printYearSalary() {
        System.out.println("=========服务员==========");
        super.printYearSalary();
    }
}
