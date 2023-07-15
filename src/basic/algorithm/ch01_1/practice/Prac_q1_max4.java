package basic.algorithm.ch01_1.practice;

import java.util.Scanner;
/*
3개가 아닌 4개를 받아서 비교해 최댓값 출력하는 연습문제
 */
public class Prac_q1_max4 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if (b>max) max = b;
        if (c>max) max = c;
        if (d>max) max = d;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(max4(a,b,c,d));
    }
}
