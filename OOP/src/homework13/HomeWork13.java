package homework13;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class HomeWork13 {
    public static void main(String[] args) {
        System.out.println("=========基础验证=========");
        Person person = new Person("John", '男', 30);
        person.printInfo();
        person.play();
        Student student = new Student("Mike", '男', 25, 123456);
        student.printInfo();
        Teacher teacher = new Teacher("Jane", '女', 40, 10);
        teacher.printInfo();

        Person[] persons = new Person[4];
        persons[0] = new Student("小红", '女', 17, 123456);
        persons[1] = new Student("小刚", '男', 18, 123457);
        persons[2] = new Teacher("小明", '男', 40, 10);
        persons[3] = new Teacher("小蓝", '女', 30, 8);
        System.out.println("=========根据年龄排序==========");
        sortPerson(persons);
        System.out.println("=========behavior============");
        behavior(student);
        behavior(teacher);


    }
    public static void sortPerson(Person[] persons) {
        Person temp; // 辅助变量，用于实现交换
        int swap; // 用于记录交换的次数, 如果某一次排序交换次数为0，说明已经是增序排列了，不需要继续
        int count = 0; // 用户记录排序的轮数
        for (int i = 0; i < persons.length-1; i++) { // 外层循环用来控制排序的轮数，之所以为arr.length-1是因为如果有6个数，实际上最多只需要排列5次
            swap = 0; // 每一轮排序结束，就把交换次数重置
            for (int j = 0; j < persons.length - i - 1; j++) {
                // 每一轮的排序逻辑
                if (persons[j].getAge() > persons[j + 1].getAge()) {
                    swap++;
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
            // 如果swap=0，说明本轮排序没有发生交换，可以直接停止了
            if (swap == 0) {
                break;
            }
            // 排序结束后，排序轮数+1
            count++;
            System.out.println("第" + count + "次排序结果：");
            // 遍历本轮排序后的数组结果
            for (int j = 0; j < persons.length; j++) {
                System.out.print(persons[j].getName() + "\t");
            }
            System.out.println();
        }
        System.out.println("排序完毕，共用了" + count + "轮排序");
    }

    public static void behavior(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        } else if (person instanceof Teacher) {
            ((Teacher) person).teach();
        }else {
            System.out.println("不支持的类型！！！");
        }
    }

}
