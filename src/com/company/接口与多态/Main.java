package com.company.接口与多态;

public class Main  {
    public static void main(String[] args) {
//儿子们不仅有爱好，还有其他的一些特点怎么办？java中也不支持多继承
//        接口就是抽象的最高境界
        Father father=new Father();
        father.hobby();
        Child child=new Child();
        child.hobby();
        Child2 child2=new Child2();
        child2.hobby();
    }


}
