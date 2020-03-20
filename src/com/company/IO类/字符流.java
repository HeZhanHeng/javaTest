package com.company.IO类;

import java.io.*;

public class 字符流 {
    public static void main(String[] args) {
        String content="我是中国河南洛阳人";
        File file=new File("C:\\Users\\Administrator\\IdeaProjects\\javaTest\\src\\com\\company\\text2.txt");
        char[]c=content.toCharArray();
        try {
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write(c);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader=new FileReader(file);
            char[]c2=new char[100];
            int count=0;
            while (true){
                try {
                    if ((count=fileReader.read(c2))!=-1){
                        String ss=new String(c2,0,count);
                        System.out.println(ss);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}