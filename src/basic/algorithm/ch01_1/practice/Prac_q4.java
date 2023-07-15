package basic.algorithm.ch01_1.practice;

/*
이전에 만들었던 med함수와 다음의 med함수는 효율성의 차이가 있다
후자가 전자에 비해 효율이 낮은 이유는 if문 안에 있는 조건식을 중복 판단 하기 때문이다
b >= a 와 a > b는 사실상 같은 판단인데 이를 불필요하게 반복하게 되므로 효율이 떨어진다
 */
public class Prac_q4 {
    static int med3(int a, int b, int c){
        if ((b >= a && c <= a)||(b <= a && c>= a)){
            return a;
        }else if ((a > b && c < b)||(a < b && c > b)){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {

    }
}
