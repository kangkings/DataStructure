package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

public class Prac_q11 {
    public static void main(String[] args) {
        //양의 정수 입력받고 자릿수 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int position = 0;
        do {
            a = a/10;
            position++;
        }while(a != 0);
        System.out.printf("그 수는 %d자리 입니다", position);
    }

}
