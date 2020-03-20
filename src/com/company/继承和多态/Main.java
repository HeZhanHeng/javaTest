package com.company.继承和多态;



public class Main {
    public static void main(String[] args) {
//        上转型对象
//        继承与多态，父亲的爱好可以直接拿儿子们的爱好来掩饰
        Father father=new Child();
        father.hobby();
        Father father2=new Child2();
        father2.hobby();
    }

}
