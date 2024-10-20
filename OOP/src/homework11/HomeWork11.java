package homework11;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class HomeWork11 {
    public static void main(String[] args) {
        Person p = new Student();// 向上转型：父类的引用指向子类对象
        p.eat(); // 运行，调用父类eat()方法
        p.run(); // 运行时，先找子类是否有run()方法，有就直接调用子类run()方法，没有向上找父类，以此类推
        // p.study(); 错误，子类中study方法不是Person类中的方法，想上转型后，p的编译类型是父类Person，所以无法调用子类中的方法
        Student s = (Student) p; // 向下转型，父类引用转成子类引用
        s.run();
        s.eat();
        s.study();
    }
}
