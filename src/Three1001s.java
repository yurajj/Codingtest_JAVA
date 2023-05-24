import java.util.Scanner;

public class Three1001s {
    
    public static void main(String[] args) {
        

        // 1001번 https://www.acmicpc.net/problem/1001
        // 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.


        Scanner mm = new Scanner(System.in) ; 
            int A = mm.nextInt();
            int B = mm.nextInt();
        
        System.out.println(A-B);
        
        mm.close() ;
        
    }
    
}