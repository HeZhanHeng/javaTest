package com.company.泛型和集合.泛型与接口;

public class Student implements Listen<Piano> {
    @Override
    public void listen(Piano piano) {
        piano.tump();
    }
}
