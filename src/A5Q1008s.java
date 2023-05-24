import java.util.Scanner;

public class A5Q1008s {

    public static void main(String[] args) {


        // 1008번 https://www.acmicpc.net/problem/1008
        // 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.



        Scanner D = new Scanner(System.in);

            Double A = D.nextDouble();
            Double B = D.nextDouble();

        System.out.println(A/B);

        D.close();

    }
    
}