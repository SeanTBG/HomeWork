package homework14;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class HomeWork14 {
    public static void main(String[] args) {
        C c = new C(); // 输出的内容是？
    }
}

class A {
    public A() {
        System.out.println("我是A");
    }
}

class B extends A {
    public B() {
        System.out.println("我是B的无参构造");
    }
    public B(String name) {
        // 注意，这里会自动调用B的父类即A类的无参构造器，所以会输出“我是A”
        System.out.println(name + "\t我是B的有参构造");
    }
}

class C extends B {
    public C() {
        this("hello");
        System.out.println("我是C的无参构造");
    }
    public C(String name) {
        super("hahaha");
        System.out.println(name + "\t我是C的有参构造");
    }
}