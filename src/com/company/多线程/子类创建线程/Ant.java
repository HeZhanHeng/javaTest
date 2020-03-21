package com.company.多线程.子类创建线程;

public class Ant extends Thread {
    Cake cake;
    public Ant(String name,Cake cake){
          this.cake=cake;
          setName(name);
    }
    @Override
    public void run() {
while (true){
int n=2;
System.out.println(getName()+"吃了"+n+"克蛋糕");
cake.lost(n);
System.out.println(getName()+"发现蛋糕还剩下"+cake.getSize()+"克");
    try {
        sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    if (cake.getSize()<=0){
        System.out.println(getName()+"已经进入死亡状态");
        return;
    }
}

    }
}
