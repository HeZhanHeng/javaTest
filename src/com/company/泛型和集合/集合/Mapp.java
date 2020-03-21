package com.company.泛型和集合.集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("name","和战恒");
        map.put("age","25");
        System.out.println(map.get("name"));
//        遍历
      Iterator<Map.Entry<String,String>>iterator= map.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<String,String>entry=iterator.next();
           System.out.println(entry.getKey());
           System.out.println(entry.getValue());
       }
    }
}
