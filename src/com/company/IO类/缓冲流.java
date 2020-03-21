package com.company.IO类;

import java.io.*;

public class 缓冲流 {
    public static void main(String[] args) {
        String[]content={"我是中国人","武汉加油","中国加油"};
        File file=new File("C:\\Users\\Administrator\\IdeaProjects\\javaTest\\src\\com\\company\\text3.txt");
        try {
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (String s:content){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            fileWriter.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String string=null;
            while (true){
                try {
                    if (((string=bufferedReader.readLine())!=null)) {
                        System.out.println(string);
                    };
                    fileReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
