package basic.algorithm.ch01_1.practice;

import java.util.Scanner;
/*
3개가 아닌 4개를 받아서 최소값을 구하는 연습문제
 */
public class Prac_q3_min4 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        if (d<min) min = d;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(min4(a,b,c,d));
    }
}
