import java.util.Scanner;

public class A4Q10998s {

    public static void main(String[] args) {


        // 10998번 https://www.acmicpc.net/problem/10998
        // 문제 : 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.


        Scanner mu = new Scanner(System.in);

            int A = mu.nextInt();
            int B = mu.nextInt();

        System.out.println(A*B);

        mu.close();

    }
    
}