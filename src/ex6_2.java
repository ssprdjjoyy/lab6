package com.company;
import java.io.*;

public class ex6_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader brin = null;
        BufferedWriter brout = null;
        try {
            brin = new BufferedReader( new FileReader("D:\\MyFile1.txt" ), 1024);
            brout = new BufferedWriter( new FileWriter( "D:\\MyFile2.txt" ));
            int lineCount = 0;
            String s;
// Переписывание информации из одного файла в другой
            while ((s = brin.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                brout.write(s);
                brout.newLine(); // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!");
        }
        finally{
            brin.close();
            brout.flush();
            brout.close();
        }
    }
}
