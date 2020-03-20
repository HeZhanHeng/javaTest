package com.company.IO类;

import java.io.*;

public class 字节流 {
    public static void main(String[] args) {
//        输入流===读
        File file=new File("C:\\Users\\Administrator\\IdeaProjects\\javaTest\\src\\com\\company\\text2.txt");
        byte[]bytes=new byte[100];
        int count=0;
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            while ((count = fileInputStream.read(bytes))!=-1){
                String content=new String(bytes,0,count);
                System.out.println(content);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//    输出流==写
    String text="我是中国人";
    byte[]b=text.getBytes();
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            try {
                fileOutputStream.write(b);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
