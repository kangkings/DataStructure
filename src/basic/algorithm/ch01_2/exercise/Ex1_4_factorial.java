package basic.algorithm.ch01_2.exercise;
import java.util.Scanner;

/*
n의 값을 입력받고 1~n까지의 합(팩토리얼)계산하기
 */
public class Ex1_4_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 1;
        while (cnt<=n){
            sum += cnt;
            cnt++;
        }
        System.out.printf("sum = %d",sum);
    }
}
