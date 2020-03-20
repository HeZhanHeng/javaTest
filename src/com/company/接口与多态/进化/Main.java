package com.company.接口与多态.进化;

public class Main {
    public static void main(String[] args) {
//        最简单的接口回调，这里结果就实现了多态
        Test test;
        Tom tom=new Tom();
        test=tom;
        System.out.println("最后的结果实现了多态="+ test.getSum(10));
        test=new Bob();

        System.out.println("最后的结果实现了多态="+ test.getSum(20));
//        接口和抽象类的比较：
//        1.二者都可以有abstract方法
//        2.接口中只有常量，抽象类中则可以有常量也可以有变量
//        3.抽象类中可以有非抽象方法，但接口中只有抽象方法
    }

}
