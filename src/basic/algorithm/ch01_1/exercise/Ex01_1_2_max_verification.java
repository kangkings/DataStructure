package basic.algorithm.ch01_1.exercise;
import java.util.Scanner;

/*
메서드화 해서 다양한 입력값에 대해 알고리즘이 작동하는지 검증

main함수는 static이기 때문에 메모리에 올라갈 때 같이 사용할 수 있도록
메서드도 static속성 부여
 */

public class Ex01_1_2_max_verification {
    //3가지 숫자 중 최댓값 구하는 메서드
    static int max3(int a, int b, int c){
        int max = a;
        if (b>max) max = b;
        if (c>max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(max3(1, 2, 3));
        System.out.println(max3(3, 3, 3));
        System.out.println(max3(2, 7, 1));
        System.out.println(max3(6, 6, 2));
        System.out.println(max3(-3, 2, 6));
        System.out.println(max3(20, 3, 7));
        System.out.println(max3(1, 7, 2));
        System.out.println(max3(5, 7, 9));
        System.out.println(max3(2, 8, 1));

    }
}
