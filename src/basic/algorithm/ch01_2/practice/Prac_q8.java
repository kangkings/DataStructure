package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

/*
factorial 연산 결과 값만 출력하지 말고 각 피연산자를 전부 출력하기
 */
public class Prac_q8 {

    public static void main(String[] args) {
        //가우스 공식 = (첫수+끝수)*(전체수/2)
        //개수가 홀수라면 중간값이 하나 남기때문에 첫+끝의 값을 한번 더 더해주고 아니면 0을 더한다
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum = (1+n)*(n/2)+(n%2==1?(n+1) / 2: 0);
        System.out.println("sum = " + sum);

    }
}
