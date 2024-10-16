/**
 * @author: Sean
 * @date: 2024/10/17
 * @project: HomeWork
 */
public class HomeWork01 {
    // 1.定义一个Person类{name,age,job},初始化Person对象数组，有3个person对像，按照age从大到小进行排序，提示，使用冒泡排序
    public static void main(String[] args) {
        Person[] arr = {new Person("a", 18, "student"),
                new Person("b", 19, "teacher"),
                new Person("c", 17, "doctor")};
        Person temp;
        int swap;
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            swap = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 每一轮的排序逻辑
                if (arr[j].getAge() > arr[j + 1].getAge()) {
                    swap++;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
        System.out.println("排序完毕，共用了" + count + "轮排序");
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public void setAge(int age) {}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
