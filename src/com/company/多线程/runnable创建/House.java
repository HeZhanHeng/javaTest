package com.company.多线程.runnable创建;

public class House implements Runnable {
    int cake;

    public void setCake(int cake) {
        this.cake = cake;
    }

    @Override
    public void run() {
        int m = 2;
        while (true) {
            if (cake <= 0) {
                System.out.println(Thread.currentThread().getName() + "进入死亡状态");
                return;
            }
            cake = cake - m;
            System.out.println(Thread.currentThread().getName() + "吃了" + m + "克蛋糕");
            System.out.println(Thread.currentThread().getName() + "剩了" + cake + "克蛋糕");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
