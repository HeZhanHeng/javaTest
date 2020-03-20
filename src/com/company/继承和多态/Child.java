package com.company.继承和多态;

public class Child extends Father {


    @Override
    void hobby() {
     System.out.println("打篮球");
    }

    public static void main(String[] args) {
     Child child=new Child();
     child.hobby();
    }
}
