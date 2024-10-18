package homework03;

/**
 * @author: Sean
 * @date: 2024/10/17
 * @project: HomeWork
 */
public class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是副教授的信息：");
        super.introduce();
    }
}
