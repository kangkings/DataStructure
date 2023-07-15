package basic.algorithm.ch01_1.practice;

import java.util.Scanner;
/*
3개의 값을 받아서 최소값을 구하는 연습문제
 */
public class Prac_q2_min3 {
    static int min3(int a, int b, int c){
        int min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(min3(a,b,c));
    }
}
