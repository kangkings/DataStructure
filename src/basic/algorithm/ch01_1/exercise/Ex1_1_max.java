package basic.algorithm.ch01_1.exercise;
import java.util.Scanner;

/*
입력받은 세 숫자 중 최댓값 구하기
 */
public class Ex1_1_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 정수의 최댓값 구하기");
        System.out.print("a의 값 : "); int a = sc.nextInt();
        System.out.print("b의 값 : "); int b = sc.nextInt();
        System.out.print("c의 값 : "); int c = sc.nextInt();
        int max = a;
        if (b>max) max = b;
        if (c>max) max = c;

        System.out.printf("최댓값은 %d",max);
    }
}
