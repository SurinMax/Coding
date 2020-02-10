import com.surin.jGenNum;

import java.util.Date;

public class JMatchGen {
    public static void main(String[] args) {
        int i = 1; //Начальное условие
        int countGenMath = 100;//Сколько примеров нужно сгенерировать
        /**
         * 0: начало интервала
         * 1: конец интервала
         * 2: количество примеров
         * 3: код знака операции
         */
        int[] interval = new int[4];
        //int start = 10;//начальное число для генерации
        //int end = 99;//конечное число дле генерации
        int firstNum,lastNum;
        int exitGen = 100;
        String oper = "-"; //математическая операция
        String pathToFile = "E:\\test.txt";
        Date date = new Date();
        interval = jGenNum.inputData();


        //jGenNum.WriteToFile(pathToFile,"Список примеров на "+ date.toString() + "\n");

        do{
             /*
            firstNum = jGenNum.genInt(start,end);
            lastNum = jGenNum.genInt(start,end);
            if (jGenNum.checkMath(firstNum,lastNum,oper)){
                jGenNum.WriteToFile(pathToFile,i+": "+firstNum + oper + lastNum + "=" + "\n");
                System.out.println(i+": "+firstNum + "-" + lastNum);
                i++;
            }
            */
              */
        }
        while (i<=interval[]);


    }
}
