import com.surin.jGenNum;

import java.util.Date;

public class JMatchGen {
    public static void main(String[] args) {
        int i = 1; //Начальное условие
        int countGenMath = 30;//Сколько примеров нужно сгенерировать
        int start = 10;//начальное число для генерации
        int end = 99;//конечное число дле генерации
        int firstNum,lastNum;
        int exitGen = 100;
        String pathToFile = "E:\\test.txt";
        Date date = new Date();
        jGenNum.WriteToFile(pathToFile,"Список примеров на "+ date.toString() + "\n");
        do{
            firstNum = jGenNum.genInt(start,end);
            lastNum = jGenNum.genInt(start,end);
            if (firstNum == -1 || lastNum == -1){
                System.out.println("Ошибочные начальные условия");
                i=exitGen;
            }
            if (jGenNum.checkMath(firstNum,lastNum)){
                jGenNum.WriteToFile(pathToFile,i+": "+firstNum + "-" + lastNum + "=" + "\n");
                System.out.println(i+": "+firstNum + "-" + lastNum);
                i++;
            }
        }
        while (i<=countGenMath);
    }
}
