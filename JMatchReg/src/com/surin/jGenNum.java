package com.surin;

public class jGenNum {
    /**
     * Генерирует целое цисло между диапазоном двух чисел
     * @param start начальное число
     * @param end конечное число
     * @return сгенерированное число
     */
    public static int genInt(int start, int end){
        return start + (int) (Math.random()*end);
    }

    /**
     * Функция проверят два числа
     * @param a первое число
     * @param b второе число
     * @return если меньше нуля - false(нельзя использовать), true - в противном случае
     */
    public static boolean checkMath(int a, int b){
        if ((a-b)<0){
            return false;
        }
        else {
            return true;
        }
    }
}
