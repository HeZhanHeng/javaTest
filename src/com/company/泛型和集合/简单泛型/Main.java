package com.company.泛型和集合.简单泛型;

public class Main {
    public static void main(String[] args) {
       ShowObj<Cat>catShowObj=new ShowObj<>();
        ShowObj<Dog>dogShowObj=new ShowObj<>();
       catShowObj.showMsg(new Cat());
        dogShowObj.showMsg(new Dog());
    }
}
