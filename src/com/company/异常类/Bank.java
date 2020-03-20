package com.company.异常类;

public class Bank {
    void income(int in,int out) throws BankException {
        if (in<0||out>0){
            throw new BankException();
        }
        System.out.println("操作成功");
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        try {
            bank.income(-1,-2);
        } catch (BankException e) {
         e.showMsg();
        }
    }
}
