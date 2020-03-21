package com.company.泛型和集合.泛型与接口;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        Teacher teacher=new Teacher();
        student.listen(new Piano());
        teacher.listen(new Violin());
    }

}
