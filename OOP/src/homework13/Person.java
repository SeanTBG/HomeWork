package homework13;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("人的姓名" + name + ", 性别" + gender + ", 年龄" + age);
    }

    public void play() {
        System.out.println(getName() + "在玩泥巴" );
    }
}
