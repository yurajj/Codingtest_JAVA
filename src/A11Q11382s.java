import java.util.Scanner;

public class A11Q11382s {
    

    
        // 11382번 https://www.acmicpc.net/problem/11382
        // 문제 : 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!



    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in) ;

            long A = sc.nextLong() ;
            long B = sc.nextLong() ;
            long C = sc.nextLong() ;
            
            System.out.println( A+B+C );

            sc.close(); 

        } catch (Exception e) {
            // TODO ~
        }
         // return 0;
    } 
}
