package basic.datastructure.ch02_1.exercise;

public class Ex2_3_CloneArray {
    public static void main(String[] args) {
        //배열 복제
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();//b는 a의 복제를 참조

        b[3] = 0;//한 요소에만 0대입

        for (int i = 0; i < a.length; i++) {
            System.out.println(" "+a[i]);
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.println(" "+b[i]);
        }

    }
}
