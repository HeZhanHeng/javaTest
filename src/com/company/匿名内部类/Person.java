package com.company.匿名内部类;

public class Person {
    int age=20;
    Car car;
    public Person(){
        car=new Car();
//        car.playCar();
    }
    void start(){
        car.playCar();
    }
    void  eat(){
        System.out.println("吃饭");
    }
/*
* 内部类中不可以声明类变量和类方法，外部类的类体中可以用内部类声明对象，作为外部类的成员
* 内部类仅供它的外嵌类使用
* */
    class Car{
    void playCar(){
        System.out.println("开大奔");
        System.out.println(age);
        eat();
    }
    }
}
