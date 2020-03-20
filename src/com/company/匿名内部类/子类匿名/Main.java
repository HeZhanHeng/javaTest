package com.company.匿名内部类.子类匿名;

public class Main {
    public static void main(String[] args) {

//        Person person=new Boy();
//        person.sex();
//        Person person2=new Girl();
//        person2.sex();
        Person person=new Boy();
        TestPerson testPerson=new TestPerson();
       testPerson.getSex(person);
        TestPerson testPerson2=new TestPerson();
        testPerson2.getSex(new Girl());
        TestPerson testPerson3=new TestPerson();
//        与子类相关的匿名类，new Person相当于new Boy/Girl，只不过是需要把重写的sex写到了这里
        testPerson3.getSex(new Person() {
            @Override
            void sex() {
                System.out.println("男孩");

            }
        });
//       一般类中创建匿名类，它的构造方法不一定需要重写，而上面的抽象类是必须要重写sex方法
        TestPerson testPerson4=new TestPerson();
        testPerson4.getSex(new Boy(){
            @Override
            void sex() {
                super.sex();
            }
        });
        testPerson4.sound(new Car(){
            @Override
            void sound() {
                System.out.println("我不想发车了");

            }
        });
    }
}
