package basic.algorithm.ch01_2.practice;

import java.util.Scanner;

/*
sum은 구해졌지만 while문 사용하는 과정에서 cnt가 실제 값보다 +1이 됨
이를 감소시켜 정상값으로 만들고 출력
 */
public class Prac_q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 1;
        while (cnt<=n){
            sum += cnt;
            cnt++;
        }
        System.out.printf("sum = %d\n",sum);
        System.out.printf("cnt = %d", --cnt);
    }
}
