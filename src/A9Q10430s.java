import java.util.Scanner;

public class A9Q10430s {
    
    public static void main(String[] args) {

        // 10430번 https://www.acmicpc.net/problem/10430
        // 문제 : (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        //        (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        //        세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

        
        Scanner same = new Scanner(System.in) ;
        
        int A = same.nextInt();
        int B = same.nextInt();
        int C = same.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);

        same.close();
    }

}
