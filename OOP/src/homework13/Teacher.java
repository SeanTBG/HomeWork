package homework13;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class Teacher extends Person {
    private int work_age; // 工龄

    public Teacher(String name, char gender, int age, int work_age)
    {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public void printInfo() {
        System.out.println("==========老师的信息============");
        System.out.println("老师姓名：" + getName() + "\n性别：" + getGender() + "\n年龄：" + getAge() + "\n工龄：" + work_age);
        teach();
        play();
    }
    public void teach() {
        System.out.println("我承诺，我会认真讲课........");
    }

    @Override
    public void play() {
        System.out.println("老师" + getName() + "玩的是象棋");
    }
}
