package homework04;

import homework04.Employee;

/**
 * @author: Sean
 * @date: 2024/10/18
 * @project: HomeWork
 */
public class NormalStaff extends Employee {
    public NormalStaff(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    @Override
    public void getSalary() {
        double normalStaffSalary = getDaySalary() * getWorkDays();
        System.out.println("普通员工" + getName() + "的工资为：" + normalStaffSalary);
    }
}
