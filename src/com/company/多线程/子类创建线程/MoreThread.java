package com.company.多线程.子类创建线程;

public class MoreThread {
    public static void main(String[] args) {
Cake cake=new Cake();
cake.setSize(10);
Ant redAnt=new Ant("红蚂蚁",cake);
Ant blackAnt=new Ant("黑蚂蚁",cake);
        blackAnt.start();
        redAnt.start();

    }
}
