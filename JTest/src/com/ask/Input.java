package com.ask;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Описывает функции воода данных
 */
public class Input {
    /**
     * Фунцкия для ввода числового значения
     * @return введенное число
     */
    public static int inputInt(){
        System.out.print("Введите число ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Не верный тип введенных данных");
            return 0;
        }
    }

    /**
     * Фунция ввода строки
     * @return введенная строка
     */
    public static String intputStr(){
        System.out.print("Введите строку ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Функция для ввода вещественного числа
     * @return введенное число
     */
    public static float intputFloat(){
        System.out.print("Введите число ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextFloat();
        }
        catch (InputMismatchException e){
            System.out.println("Не верный тип введенных данных");
            return 0;
        }
    }
}
