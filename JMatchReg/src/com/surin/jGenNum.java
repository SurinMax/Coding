package com.surin;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class jGenNum {
    /**
     * Генерирует целое цисло между диапазоном двух чисел
     * @param start начальное число
     * @param end конечное число
     */
    public static int genInt(int start, int end){
        Random random = new Random();
        try {
            return random.nextInt((end - start) + 1) + start;
        }
        catch (IllegalArgumentException e){
            return -1;
        }
    }

    /**
     * Функция проверят два числа
     * @param a первое число
     * @param b второе число
     * @return если меньше нуля - false(нельзя использовать), true - в противном случае
     */
    public static boolean checkMath(int a, int b){
        if ((a-b)<0 || a == -1 || b == -1){
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Функиия записи/дозаписи примеров в файл
     * @param pathToFile
     * @param lineWrite
     */
    public static void WriteToFile(String pathToFile, String lineWrite){
        try {
            FileWriter fw = new FileWriter(pathToFile,true);
            fw.write(lineWrite);
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
