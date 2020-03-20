package com.company.继承和多态;

public class Child2 extends Father  {
    void eatting(){
        System.out.println("大盘鸡");
    }
    @Override
    void hobby() {
        System.out.println("踢足球");
    }
public static void main(String[] args) {
         Child2 child=new Child2();
         child.hobby();
}
}
