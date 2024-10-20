简答题

题目：Java的动态绑定机制什么？举例说明

动态绑定机制是指在运行时根据对象的实际类型，而不是声明类型来决定方法调用的。

在Java中，动态绑定机制通过方法重写来实现，即子类可以重写父类的方法。

当一个对象的方法被调用时，JVM会根据对象的实际类型来决定调用哪个方法。

1. 当调用对象的方法时，该方法会和水箱的内存地址/运行类型绑定
2. 当调用对象的属性时，没有动态绑定机制，属性在哪里定义就在哪里使用

举例说明：

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); 
        // 动态绑定，运行的时候实际上调用的是运行类型Dog()类的makeSound方法
        // 所以输出：Dog barks
    }
}
```