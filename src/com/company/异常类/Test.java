package com.company.异常类;

public class Test {
    public static void main(String[] args) {

        Person person=new Person();
        person = null;
        int a=10;
        int b=0;

        try {
            person.speek();
            int c=a/b;
            System.out.println(c);
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException");
        }

    }
}
