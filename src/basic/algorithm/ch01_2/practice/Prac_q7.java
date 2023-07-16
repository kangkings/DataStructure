package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

/*
factorial 연산 결과 값만 출력하지 말고 각 피연산자를 전부 출력하기
 */
public class Prac_q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i != n){
                System.out.printf("%d + ", i);
            }else {
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("= %d",sum);

    }
}
