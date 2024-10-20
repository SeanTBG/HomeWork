简答题

题目：什么是多态？多太具体体现有哪些？可以举例说明？

多态是面向对象编程中一个很重要的概念，它指的是方法或者对象可以具有多种形态，即一个对象可以有多个不同的实现。

多态建立在封装和继承的基础上：
1. 继承：子类可以继承父类的方法，但子类可以重写父类的方法，从而实现多态。
2. 覆盖：子类可以覆盖父类的方法，即子类重写父类的方法，从而实现多态。
3. 引用：父类引用可以指向子类的对象，从而实现多态。

多态的具体体现可以分为：

1. 方法多态：
    - 重载体现多态
    - 重写体现多态
    
2. 对象多态：
    - 对象的编译类型和运行类型可以不一致，编译类型在定义的时候就确定，不能改变
    - 对象的运行类型是可以改变的，我们可以通过getClass()方法来查看运行类型
    - 编译类型看定义时 = 的左边，运行类型看 = 的右边
举个例子来说明：
```java
public class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}
// 继承
public class Dog extends Animal {
    // 重写
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}
// 引用
public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();// 输出：Dog is eating.
    }
}
```