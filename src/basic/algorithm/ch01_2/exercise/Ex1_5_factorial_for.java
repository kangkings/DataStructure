package basic.algorithm.ch01_2.exercise;
import java.util.Scanner;

/*
n의 값을 입력받고 1~n까지의 합(팩토리얼)계산하기
하나의 변수만 사용하는 반복문은 for문이 더 좋음
 */
public class Ex1_5_factorial_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("sum = %d",sum);
    }
}
