package homework04;

/**
 * @author: Sean
 * @date: 2024/10/18
 * @project: HomeWork
 */
public class Employee {
    private String name;
    private double daySalary;
    private int workDays;
    private double grade;

    public Employee(String name, double daySalary, int workDays, double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void getSalary() {
        System.out.println("员工" + name + "的工资为：" + daySalary * workDays * grade);
    }
}
