package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

public class Prac_q12 {
    //왼쪽 아래가 직각인 직각이등변삼각형
    static void triangleLB(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }//왼쪽 위가 직각인 직각이등변삼각형
    static void triangleLU(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j<(n-i)) System.out.printf("*");
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }//오른쪽 위가 직각인 직각이등변삼각형
    static void triangleRU(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j >= i) System.out.printf("*");
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }//오른쪽 아래가 직각인 직각이등변삼각형
    static void triangleRB(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (n-i-1)) System.out.printf(" ");
                else System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRB(n);
        System.out.println();
        triangleRU(n);
    }
}
