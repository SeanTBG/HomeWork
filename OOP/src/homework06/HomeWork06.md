## super/this关键字练习

**题目：** 

假定Grand、Father和Son在同个包，问：父类和子类中通过`this`和`super`都可以调用哪些属性和方法

```java
class Grand{
    String name = "Grand";
    private int age = 100;
    public void g1(){}
}
```
```java
class Father extends Grand{
    String id = "001";
    private double score;
    public void f1(){
    // super可以访问那些成员（属性或者方法？）
        super.name;
        super.g1();
        // super.age; 错误, 私有属性不能被继承
    // this可以访问哪些成员？    
        this.id;
        this.score;
        this.f1();
        this.name;
        this.g1();
    }
    
}
```

```java
class Son extends Father{
    String name = "Son";
    public void g1(){};
    private void show(){
        // super可以访问那些成员（属性和方法）？
        super.id;
        // super.score; score在继承的父类father中是私有属性，不能被访问
        super.f1();
        super.name;
        super.g1();
        // this可以访问哪些成员？
        this.name;
        this.g1();
        this.show();
        this.id;
        this.f1();
    }
}
```
**简单回顾：**
1. `this`的原理是：`this`代表当前对象，`this`可以访问当前对象的所有属性和方法，如果this访问的成员在当前类中没有，那么会去父类中查找。
2. `super`的原理是：`super`代表父类对象，`super`可以访问父类的所有属性和方法，如果`super`访问的成员在父类中没有，那么会去父类的父类中查找。