package homework05;

/**
 * @author: Sean
 * @date: 2024/10/19
 * @project: HomeWork
 */
public class Teacher extends Staff {
    private int classDays;
    private double classSalary;

    public Teacher(String name, double monthSalary) {
        super(name, monthSalary);
        this.classDays = classDays;
        this.classSalary = classSalary;
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public int getClassSalary() {
        return (int) classSalary;
    }

    public void setClassSalary(double classSalary) {
        this.classSalary = classSalary;
    }

    @Override
    public void printYearSalary() {
        System.out.println("=========老师==========");
        System.out.println("老师"+ getName() + "的年薪是：" + (getMonthSalary() + getClassSalary() * getClassDays()) * getSalMonth());
    }
}
