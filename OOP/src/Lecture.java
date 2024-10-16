/**
 * @author: Sean
 * @date: 2024/10/17
 * @project: HomeWork
 */
public class Lecture extends Teacher{
    public Lecture(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是讲师的信息：");
        super.introduce();
    }
}
