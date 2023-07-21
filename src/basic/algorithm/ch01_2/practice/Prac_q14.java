package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

public class Prac_q14 {
    //n입력받고 n개 행의 숫자 피라미드 출력
    static void npira(int n){
        for (int i = 0; i < n; i++) {
            //왼쪽 출력
            for (int j = 0; j < (n-1); j++) {
                if (j<(n-1-i)) System.out.printf(" ");
                else System.out.printf("%d",i+1);
            }

            //중앙 출력
            System.out.printf("%d",i+1);

            //우측 출력
            for (int j = 0; j < i; j++) {
                System.out.printf("%d",i+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        npira(n);
    }
}
