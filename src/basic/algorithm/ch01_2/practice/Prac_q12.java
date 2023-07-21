package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

public class Prac_q12 {
    static void triangleLB(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangleLB(n);
    }
}
