package com.company.多线程.子类创建线程;

public class Cake {
    int size;

    public void setSize(int n) {
        size = n;
    }

    public int getSize() {
        return size;
    }
    public void lost(int m){
        if (size-m>=0){
            size=size-m;

        }

    }
}
