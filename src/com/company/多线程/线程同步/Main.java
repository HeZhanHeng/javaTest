package com.company.多线程.线程同步;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.setMoney(200);
        Thread account=new Thread(bank);
        account.setName("会计");
        Thread cashier=new Thread(bank);
        cashier.setName("出纳");
        account.start();
        cashier.start();
    }
}
