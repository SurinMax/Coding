import com.surin.jGenNum;

public class JMatchGen {
    public static void main(String[] args) {
        System.out.println("Список примеров:");
        int i = 1; //Начальное условие
        int countGenMath = 20;//Сколько примеров нужно сгенерировать
        int start = 11;//начальное число для генерации
        int end = 99;//конечное число дле генерации
        do{
            int firstNum = jGenNum.genInt(start,end);
            int lastNum = jGenNum.genInt(start,end);
            if (jGenNum.checkMath(firstNum,lastNum)){
                System.out.println(i+": "+firstNum + "-" + lastNum);
                i++;
            }
        }
        while (i<=countGenMath);
    }
}
