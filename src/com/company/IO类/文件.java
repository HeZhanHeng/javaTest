package com.company.IO类;

import java.io.File;
import java.io.IOException;

public class 文件 {
//    C:\Users\Administrator\IdeaProjects\javaTest\src\com\company

    public static void main(String[] args) {
        File file=new File("C:\\Users\\Administrator\\IdeaProjects\\javaTest\\src\\com\\company","text2.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        File file1=new File("C:\\Users\\Administrator\\IdeaProjects\\javaTest\\src\\com\\company\\IO类");
       FileAccept fileAccept=new FileAccept();
       String[]fileName=file1.list(fileAccept);
       for (String name:fileName){
           System.out.println(name);
       }
        if (!file.exists()){
    try {
        file.createNewFile();
        System.out.println("文件创建成功");
    } catch (IOException e) {
        e.printStackTrace();
    }
}else {
            System.out.println("文件已经存在");
        }
    }
}
