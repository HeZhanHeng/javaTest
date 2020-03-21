package com.company.泛型和集合.泛型与接口;

public class Teacher implements Listen<Violin> {
    @Override
    public void listen(Violin violin) {
        violin.pull();
    }
}
