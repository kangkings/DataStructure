package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

public class Prac_q9 {
    static int sumof(int a, int b){
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int i = b; i < a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumof(sc.nextInt(),sc.nextInt()));
    }
}
