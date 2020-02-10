package com.surin;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class jGenNum {
    /**
     * Генерирует целое цисло между диапазоном двух чисел
     * @param start начальное число
     * @param end конечное число
     */
    public static int genInt(int start, int end){
        Random random = new Random();
        return random.nextInt((end - start) + 1) + start;
    }

    /**
     * Функция проверят два числа
     * @param a первое число
     * @param b второе число
     * @param oper код матетатической операции
     * @return если меньше нуля - false(нельзя использовать), true - в противном случае
     */
    public static boolean checkMath(int a, int b, int oper){
        switch (oper){
            case 2: {
                if ((a - b) < 0) {
                    return false;
                }
                else {
                    return true;
                }
            }
            case 1:
            {
                if((a+b)>100){
                    return false;
                }
                else {
                    return true;
                }
            }
        }
        return false;
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

    public static int[] inputData(){
        int rez[] = new int[]{0,0,0,0};//массив результатов
        String temp = "";
        Scanner scanner = new Scanner(System.in);
        do {
            /**
             * Вводим начало интервала (с обработкой ошибок)
             */
            System.out.println("Введите начало интервала: ");
            temp = scanner.nextLine();
            try {
                rez[0] = Integer.parseInt(temp);
            }
            catch (NumberFormatException e){
                System.out.println("Невеный формат строки");
            }
            /**
             * Вводим конец интервала (с обработкой ошибок)
             */
            System.out.println("Введите конец интервала: ");
            temp = scanner.nextLine();
            try {
                rez[1] = Integer.parseInt(temp);
            }
            catch (NumberFormatException e){
                System.out.println("Неверный формат строки");
            }
            if (rez[0]>=rez[1]){
                System.out.println("Начало интервала больше конца интервала. Повторите ввод.");
            }
        }
        while (rez[0]>=rez[1]);

        /**
         * Теперь вводим сколько нам нужно примеров
         */
        System.out.println("Сколько Вам нужно примеров: ");
        do{
            try {
                temp = scanner.nextLine();
                rez[2]=Integer.parseInt(temp);
            }
            catch (NumberFormatException e){
            }
            if (rez[2]<=0){
                System.out.println("Введены неверные данные\nСколько Вам нужно примеров: ");
            }
        }
        while (rez[2]<=0);

        /**
         * Теперь будем вводить математическую операцию
         */
        System.out.println("Введите математическую операцию (+-*\\)");
        do {
            temp = scanner.nextLine();
            switch (temp){
                case "+":
                    rez[3]=1;
                    break;
                case "-":
                    rez[3]=2;
                    break;
                case "*":
                    rez[3]=3;
                    break;
                case "/":
                    rez[3]=4;
                    break;
                default:
                    System.out.println("Неверный формат данных\nПовторите ввод...");
            }
        }
        while (rez[3]==0);

        System.out.println("Генерация примеров будет происходить в диапазоне от " +rez[0] + " до "+ rez[1] +
                ". Примеров будет " + rez[2] +
                ". Например: 1: 2" + temp + "2=");
        return rez;
    }

    /**
     * Функция формирует строку на запись в файл
     * @param a первое число
     * @param b второе число
     * @param oper код математической операции
     * @return готовая строка для записи в файл
     */
    public static String outputStr(int a, int b, int oper){
        return "";
    }
}
