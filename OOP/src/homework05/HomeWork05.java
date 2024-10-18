package homework05;

/**
 * @author: Sean
 * @date: 2024/10/19
 * @project: HomeWork
 */
public class HomeWork05 {
    // 5.设计父类一员工类。子类：工人类(Vorker),农民类(Peasant),教师类(Teacher),科学家类(Scientist),服务生类(Waiter)。
    // (1)其中工人，农民，服务生只有基本工资
    // (2)教师除基本工资外，还有课酬（元/天）
    // (3)科学家除基本工资外，还有年终奖
    // (4)编写一个测试类，将各种类型的员工的全年工资打印出来
    public static void main(String[] args) {
        Worker worker = new Worker("小明", 5000);
        worker.printYearSalary();
        Peasant peasant = new Peasant("小红", 3000);
        peasant.printYearSalary();
        Waiter waiter = new Waiter("小刚", 5000);
        waiter.printYearSalary();
        Teacher teacher = new Teacher("小刚", 5000, 300, 100);
        teacher.printYearSalary();
        Scientist scientist = new Scientist("小刚", 5000, 300);
        scientist.printYearSalary();
    }
}
