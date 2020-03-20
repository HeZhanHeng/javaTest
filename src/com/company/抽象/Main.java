package com.company.抽象;

public class Main {
    public static void main(String[] args) {
//        Father father=new Child();
//        father.hobby();
//        Father father2=new Child2();
//        father2.hobby();
       Hobby hobby=new Hobby();
       Father father=new Child();
       hobby.hobby(father);
        Father father2=new Child2();
        hobby.hobby(father2);
    }
}
