package com.company.多线程.runnable创建;

public class Main {
    public static void main(String[] args) {
      House house=new House();
      house.setCake(10);
      Thread antRed=new Thread(house);
      antRed.setName("红蚂蚁");
        Thread antBlack=new Thread(house);
        antBlack.setName("黑蚂蚁");
        antRed.start();
        antBlack.start();
    }
}
