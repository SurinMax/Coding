package com.ask;

public class appTest {
    public static void main(String[] args) {
        int a = Input.inputInt();
        int b = Input.inputInt();
        System.out.println("Результат операции сложения " + Calculate.add(a,b));
        float c = Input.intputFloat();
        float d = Input.intputFloat();
        System.out.println("Результат операции сложения " + Calculate.add(c,d));
        String str = Input.intputStr();
        System.out.println("Вы ввели " + str);
    }
}