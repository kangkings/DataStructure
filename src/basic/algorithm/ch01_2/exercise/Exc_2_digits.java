package basic.algorithm.ch01_2.exercise;
import java.util.Scanner;

/*
조건문과 논리연산자를 사용하여 2자리 정수를 입력받았을 때 그 값을 출력
*/
public class Exc_2_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        }while (n < 10 || n > 99);
        System.out.printf("n = %d\n", n);
    }
}
