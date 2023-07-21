package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

public class Prac_q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("a의 값: ");
        int a = sc.nextInt();
        int b;
        do {
            System.out.printf("b의 값: ");
            b = sc.nextInt();
            if(b<=a){
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        }while(a>=b);
        System.out.printf("b-a는 %d입니다.",b-a);

    }
}
