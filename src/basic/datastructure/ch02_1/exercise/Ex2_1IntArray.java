package basic.datastructure.ch02_1.exercise;

public class Ex2_1IntArray {
    public static void main(String[] args) {
        int[] a = new int[5];//배열의 선언
        a[1] = 37;//a[1]에 37대입
        a[2] = 51;//a[1]에 37대입
        a[3] = 31;//a[1]에 37대입
        a[4] = a[1]*2;//a[1]에 37대입

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
    }
}
