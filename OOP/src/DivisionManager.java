/**
 * @author: Sean
 * @date: 2024/10/18
 * @project: HomeWork
 */
public class DivisionManager extends Employee {
    private double bonus;
    public DivisionManager(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void getSalary() {
        double divisionManagerSalary = getBonus()  + getDaySalary() * getWorkDays() * getGrade();
        System.out.println("部门经理" + getName() + "的工资为：" + divisionManagerSalary);
        super.getSalary();
    }
}