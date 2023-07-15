package basic.algorithm.ch01_2.exercise;
import java.util.Scanner;

/*
n의 값을 입력받고 1~n까지의 합(팩토리얼)계산하기
하나의 변수만 사용하는 반복문은 for문이 더 좋음
###만약 입력값이 음수라면? 해당 프로그램에선 올바르지 않은 입력 -> 제한할 필요있음
반복문으로 양수 입력할때까지 반복시키기(최초 1회는 입력받아야 하기 때문에 do while문 사용)
 */
public class Ex1_6_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        do{
            System.out.printf("n의 값: ");
            n = sc.nextInt();
        }while(n<=0);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("sum = %d",sum);
    }
}
