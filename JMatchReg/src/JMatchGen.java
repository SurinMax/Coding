import com.surin.jGenNum;

public class JMatchGen {
    public static void main(String[] args) {
        System.out.println("Список примеров:");
        int i = 1; //Начальное условие
        int countGenMath = 20;//Сколько примеров нужно сгенерировать
        int start = 10;//начальное число для генерации
        int end = 50;//конечное число дле генерации
        int firstNum,lastNum;
        int exitGen = 100;
        do{
            firstNum = jGenNum.genInt(start,end);
            lastNum = jGenNum.genInt(start,end);
            if (firstNum == -1 || lastNum == -1){
                System.out.println("Ошибочные начальные условия");
                i=exitGen;
            }
            if (jGenNum.checkMath(firstNum,lastNum)){
                System.out.println(i+": "+firstNum + "-" + lastNum);
                i++;
            }
        }
        while (i<=countGenMath);
    }
}
