/**
 * @author: Sean
 * @date: 2024/10/17
 * @project: HomeWork
 */
public class HomeWork03 {
    public static void main(String[] args) {
        // 编写老师类Homework03.java
        // (1)要求有属性“姓名name”,“年龄age”,“职称post”,“基本工资salary
        // (2)编写业务方法，introduce(),实现输出一个教师的信息
        // (3)编写教师类的三个子类：教授类(Professor)、副教授类、讲师类。工资级别分别为：教授为1.3、副教授为1.2、讲师类1.1。在三个子类里面都重写父类的introduce()方法。
        // (4)定义并初始化一个老师对象，调用业务方法，实现对像基本信息的后台打印
        Professor professor = new Professor("张三", 30, "教授", 5000, 1.3);
        professor.introduce();
        AssociateProfessor associateProfessor = new AssociateProfessor("李四", 28, "副教授", 4000, 1.2);
        associateProfessor.introduce();
        Lecture lecture = new Lecture("王五", 25, "讲师", 3000, 1.1);
        lecture.introduce();
    }
}
