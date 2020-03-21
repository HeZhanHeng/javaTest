package com.company.泛型和集合.集合;

import java.util.ArrayList;
import java.util.LinkedList;

/*
* list:LinkList
*      ArrayList:可变大小的数组
* ,set
* ,map
* */
public class List {
    public static void main(String[] args) {
//        明确指定我们的集合类型Integer
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for (int i=0;i<arrayList.size();i++){
            int temp= arrayList.get(i);
            System.out.println(temp);
        }
        System.out.println("接下来是linklist");
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(4);
        for (int i=0;i<linkedList.size();i++){
            int temp= linkedList.get(i);
            System.out.println(temp);
        }
    }
}
