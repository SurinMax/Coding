import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class jMathGenerator {
    private int firstNumber;
    private int secondNumber;
    private String matchOperation;
    private int startRange;
    private int endRange;

    /**
     * Конструктор
     * @param uStartRange начала диапазона
     * @param uEndRange конец диапазона
     * @param uMatchOperation знак математической операции
     */
    jMathGenerator(int uStartRange, int uEndRange, String uMatchOperation){
        matchOperation = uMatchOperation;
        startRange = uStartRange;
        endRange = uEndRange;
    }

    /**
     * Генерирует первое число для примера
     */
    public void genFirstNumber(){
        firstNumber = new Random().nextInt((endRange - startRange) + 1) + startRange;
    }

    /**
     * Генерирует второе число для примера
     */
    public void genSecondNumber(){
        secondNumber = new Random().nextInt((endRange - startRange) + 1) + startRange;
    }

    /**
     * Метод проверяет правильность введенного диапазона генерации
     * @return true/false
     */
    public boolean checkRange(){
        return startRange < endRange;
    }

    /**
     * Метод проверят корректсность сгенерированного примера. Применять только для примеров с вычетанием.
     * @return true/false
     */
    public boolean checkGen(){
        return firstNumber >= secondNumber;
    }

    /**
     * Функцтя возвращает первое число в примере
     * @return число
     */
    public int getFirstNumber() {
        return firstNumber;
    }

    /**
     * Функиия возвращает второе число в примере
     * @return число
     */
    public int getSecondNumber() {
        return secondNumber;
    }

    /**
     * Функция возвращает знак математической операции
     * @return знак операции
     */
    public String getMatchOperation() {
        return matchOperation;
    }

    /**
     * Функиия записи/дозаписи примеров в файл
     * @param pathToFile путь к файлу
     * @param lineWrite что пишем в файл
     */
    public void WriteToFile(String pathToFile, String lineWrite){
        try {
            FileWriter fw = new FileWriter(pathToFile,true);
            fw.write(lineWrite);
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String pathToFile = "E:\\test.txt"; //куда будем записывать примеры
        int countMatch = 10; //сколько примеров нужно
        int startRange = 10; //начальное число для генерации
        int endRange = 90; //конечное число для генерации
        System.out.println("Match Generator Start");
        jMathGenerator mathGeneratorAdd = new jMathGenerator(startRange, endRange,"+");
        jMathGenerator mathGeneratorSub = new jMathGenerator(startRange,endRange,"-");
        if(!mathGeneratorAdd.checkRange()){
            System.out.println("Error initialization");
            System.exit(0);
        }
        mathGeneratorAdd.WriteToFile(pathToFile,new Date().toString()+"\n");
        for (int i=1;i<=countMatch;i++){
            mathGeneratorAdd.genFirstNumber();
            mathGeneratorAdd.genSecondNumber();
            do{
                mathGeneratorSub.genFirstNumber();
                mathGeneratorSub.genSecondNumber();
            }
            while (!mathGeneratorSub.checkGen());
            mathGeneratorAdd.WriteToFile(pathToFile, i +": "+
                                                            mathGeneratorAdd.getFirstNumber()+
                                                            mathGeneratorAdd.getMatchOperation()+
                                                            mathGeneratorAdd.getSecondNumber()+"=\n");
            mathGeneratorSub.WriteToFile(pathToFile, i+": "+
                    mathGeneratorSub.getFirstNumber()+
                    mathGeneratorSub.getMatchOperation()+
                    mathGeneratorSub.getSecondNumber()+"=\n");
        }
        System.out.println("Match Generator End");
    }

}