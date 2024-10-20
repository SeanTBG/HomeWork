package homework10;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Object obj) {
        // 首先判断比较的两个对象是否是同一类型
        if (this == obj) {
            return true;
        } else if (obj instanceof Doctor) { // 是同一类型表明可比，接着再看是否都是Doctor类型或者其子类
            Doctor doctor = (Doctor) obj; // 向下转型，因为obj的运行类型是Doctor或者其子类，需要拿到其所有属性
            return this.name.equals(doctor.name)
                    && this.age == doctor.age
                    && this.job.equals(doctor.job)
                    && this.gender == doctor.gender
                    && this.salary == doctor.salary;
        } else {
            return false;
        }
    }

    public void printInfo() {
        System.out.println("姓名：" + this.name + "\t年龄：" + this.age + "\t职位：" + this.job + "\t性别：" + this.gender + "\t薪水：" + this.salary);
    }
}
