package com.company.String类;

public class SB {
    public static void main(String[] args) {

        StringBuffer buffer=new StringBuffer("我喜欢");
        buffer.append("篮球");
        buffer.charAt(3);
        buffer.setCharAt(3, '足');
        System.out.println(buffer.toString());
//        System.out.println(buffer.reverse());
//        前闭后开
        buffer.replace(3,5,"乒乓球");
        System.out.println(buffer.toString());
    }
}
