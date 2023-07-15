package basic.algorithm.ch01_1.exercise;
import java.util.Scanner;

/*
입력받은 세 숫자 중 중앙값 구하기
(이 과정은 나중에 퀵정렬에서 자세히 다룸)
 */

public class Ex01c_1_median {
    static int med3(int a, int b, int c){
        if(a >= b){
            if(b>=c){
                return b;
            } else if (a < c) {
                return a;
            }else{
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b>c) {
            return c;
        }else {
            return b;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 정수의 중앙값 구하기");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(med3(a,b,c));

    }
}
