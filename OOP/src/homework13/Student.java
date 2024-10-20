package homework13;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class Student extends Person {
    private int stu_id;

    public Student(String name, char gender, int age, int stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public void printInfo() {
        System.out.println("=========学生的信息==========");
        System.out.println("学生姓名：" + getName() + "\n性别：" + getGender() + "\n年龄：" + getAge() + "\n学号：" + stu_id);
        study();
        play();
    }

    public void study() {
        System.out.println("我承诺，我会好好学习......");
    }

    @Override
    public void play() {
        System.out.println("学生：" + getName() + "玩的是足球");
    }
}
