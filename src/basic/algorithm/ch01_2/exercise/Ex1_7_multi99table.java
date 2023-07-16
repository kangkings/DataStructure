package basic.algorithm.ch01_2.exercise;

/*
다중루프를 활용하여 9x9 곱셈표 출력하기(자릿수는 3자리씩)
 */
public class Ex1_7_multi99table {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }
    }
}
