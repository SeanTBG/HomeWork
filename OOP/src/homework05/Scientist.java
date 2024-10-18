package homework05;

/**
 * @author: Sean
 * @date: 2024/10/19
 * @project: HomeWork
 */
public class Scientist extends Staff {
    private double bonus;

    public Scientist(String name, double monthSalary, double bonus) {
        super(name, monthSalary);
        this.bonus = bonus;
    }

    @Override
    public void printYearSalary() {
        System.out.println("=========科学家==========");
        System.out.println("科学家" + getName() + "的年薪为：" + (getMonthSalary() * getSalMonth() + bonus));
    }
}
