package com.company.泛型和集合.集合;

import java.util.HashSet;
import java.util.Iterator;
/*
* hashSet打印出来没有顺序并且不打印重复的数据
* */
public class Set {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(2);
        Iterator<Integer>iterator=hashSet.iterator();
        while (iterator.hasNext()){
            int s= iterator.next();
            System.out.println(s);
        }
    }
}
