package basic.algorithm.ch01_2.exercise;
import java.util.Scanner;

/*
변의길이 n을 입력받고 왼쪽 아래가 직각인 직각이등변삼각형 출력(*)
행,열의 개념을 생각하면서 이중루프로 해결
 */
public class Ex1_8_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j<=i){
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
