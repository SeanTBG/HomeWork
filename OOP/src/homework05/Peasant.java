package homework05;

/**
 * @author: Sean
 * @date: 2024/10/19
 * @project: HomeWork
 */
public class Peasant extends Staff {
    public Peasant(String name, double monthSalary) {
        super(name, monthSalary);
    }

    @Override
    public void printYearSalary() {
        System.out.println("=========农民==========");
        super.printYearSalary();
    }

}
