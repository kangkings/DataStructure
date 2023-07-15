package basic.algorithm.ch01_1.exercise;
import java.util.Scanner;

/*
입력받은 숫자가 양수인지 음수인지 0인지 판별
 */
public class Ex01_1_3_judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0) System.out.printf("%d은(는) 음수\n",a);
        else if (a==0) System.out.printf("%d은(는) 0\n",a);
        else System.out.printf("%d은(는) 양수",a);
    }
}
