package com.company.String类;

public class Main {
    public static void main(String[] args) {
        String s=new String(" hello world ");
        System.out.println(s);
        System.out.println(s.trim());//去掉前后空格后的字符串
        boolean ee=s.equals(s.trim());
        System.out.println("是否相等"+ee);
        System.out.println(s.length());
        System.out.println(s.substring(1,4));
        String s2="hello worl";
        boolean b=s.equals(s2);
        System.out.println(b);
        boolean b2=s.startsWith("h");
        System.out.println(b2);
        int p=s.indexOf("w");
        System.out.println(p);
        char [] c={'A','B','C'};
        String ss=new String(c);
        System.out.println(ss);
        String sss=new String(c,1,2);
        System.out.println(sss);
        String num="123";
       int i=Integer.parseInt(num);
        System.out.println(i);
        String num2="12.90";
        double d=Double.parseDouble(num2);
        System.out.println(d);
        String arr=new String(" hello world ");
        char [] chars=arr.toCharArray();
        for (int x=0;x<chars.length;x++){
            System.out.println(chars[x]);
        }
    }
}
