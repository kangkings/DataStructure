package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

public class Prac_q13 {
    //n입력받고 해당 행만큼의 피라미드 출력
    static void spira(int n){
        for (int i = 0; i < n; i++) {
            //좌측 출력
            for (int j = 0; j < (n-1); j++) {
                if (j<(n-1-i)) System.out.printf(" ");
                else System.out.printf("*");
            }
            //중앙 출력
            System.out.printf("*");
            
            //우측 출력
            for (int j = 0; j < (n-1); j++) {
                if(j<i) System.out.printf("*");
                else System.out.printf(" ");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        spira(n);
    }
}
