package codeblock;

/**
 * @author: Sean
 * @date: 2024/10/26
 * @project: HomeWork
 */
public class CodeBlockDetail {
    // 1. 类加载: 父类-->子类
    // 2. 创建对象: 从子类构造器开始分析
    public static void main(String[] args) {
        new Son();
        new Test();
    }
}

class Father{
    private static int n1 = getVal1(); // 静态属性初始化
    static { // 静态代码块
        System.out.println("Father static block");
    }
    { // 普通代码块
        System.out.println("Father instance block");
    }
    public int n2 = getVal2(); // 普通属性初始化

    public static int getVal1(){
        System.out.println("getVal1()");
        return 20;
    }
    public int getVal2(){
        System.out.println("getVal2()");
        return 30;
    }

    public Father(){
        System.out.println("Father()构造器");
    }
}

class Test {
    private int n5 = 200;
    private static int n6 = 300;
    private void m1() {}
    private static void m2() {}
    static {
        // 静态代码块，只能调用静态成员
        // System.out.println(n5); 错误
        System.out.println(n6); // 正确
        // m1(); 错误
        m2();
    }
    {
        // 普通代码块，可以调用所有成员
        System.out.println(n5); // 普通代码块调用静态属性
        System.out.println(n6); // 普通代码块调用普通属性
        m1(); // 普通代码块调用普通方法
        m2(); // 普通代码块调用静态方法
    }

}

class Son extends Father{
    private static int n3 = getVal3(); // 静态属性初始化
    static { // 静态代码块
        System.out.println("Son static block");
    }
    { // 普通代码块
        System.out.println("Son instance block");
    }
    public int n4 = getVal4(); // 普通属性初始化

    public static int getVal3(){
        System.out.println("getVal3()");
        return 40;
    }
    public int getVal4(){
        System.out.println("getVal4()");
        return 50;
    }
    public Son(){ // 构造器
        // 隐藏代码: super();
        // 隐藏调用：子类自己的普通代码块
        System.out.println("Son()构造器");
    }
}