package homework05;

/**
 * @author: Sean
 * @date: 2024/10/19
 * @project: HomeWork
 */
public class Worker extends Staff {
    public Worker(String name, double monthSalary) {
        super(name, monthSalary);
    }

    @Override
    public void printYearSalary() {
        System.out.println("=========工人==========");
        super.printYearSalary();
    }
}
