package homework05;

/**
 * @author: Sean
 * @date: 2024/10/19
 * @project: HomeWork
 */
public class Staff {
    private String name;
    private double monthSalary;
    private int salMonth = 12;

    public Staff(String name, double monthSalary) {
        this.name = name;
        this.monthSalary = monthSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public void printYearSalary() {
        System.out.println(name + "的年薪是：" +monthSalary * salMonth);
    }
}
