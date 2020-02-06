import com.surin.jGenNum;

public class JMatchGen {
    public static void main(String[] args) {
        System.out.println("Список примеров:");
        int i=1;
        do{
            int firstNum = jGenNum.genInt(1,100);
            int lastNum = jGenNum.genInt(1,100);
            if (jGenNum.checkMath(firstNum,lastNum)){
                System.out.println(i+": "+firstNum + "-" + lastNum);
                i++;
            }
        }
        while (i<=10);
    }
}
