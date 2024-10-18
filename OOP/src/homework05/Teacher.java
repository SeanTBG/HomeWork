package homework05;

/**
 * @author: Sean
 * @date: 2024/10/19
 * @project: HomeWork
 */
public class Teacher extends Staff {
    private int classDays;
    private double classSalary;

    public Teacher(String name, double monthSalary, int classDays, double classSalary) {
        super(name, monthSalary);
        this.classDays = classDays;
        this.classSalary = classSalary;
    }

    @Override
    public void printYearSalary() {
        System.out.println("=========老师==========");
        System.out.println("老师"+ getName() + "的年薪是：" + (getMonthSalary() + classDays * classSalary) * getSalMonth());
    }
}
