import java.util.Scanner;

public class A10Q2588s {
    

    public static void main(String[] args) {

        // 2588번 https://www.acmicpc.net/problem/2588
        // 문제 : (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
        
        Scanner mu = new Scanner(System.in) ;

        // int A1 = mu.nextInt();
        // int A2 = mu.nextInt();
        // int A3 = mu.nextInt();

        // int B1 = mu.nextInt();
        // int B2 = mu.nextInt();
        // int B3 = mu.nextInt();

        // int Z1 = ((A1*100)+(A2*10)+(A3*1))*B3 ;
        // int Z2 = ((A1*100)+(A2*10)+(A3*1))*B2 ;
        // int Z3 = ((A1*100)+(A2*10)+(A3*1))*B1 ;

        int A = mu.nextInt() ;
        int B = mu.nextInt() ;

        System.out.println( A*(B%10) ) ;
        System.out.println( A*(B%100/10) ) ;
        System.out.println( A*((B-B%100)/100) ) ;
        System.out.println( A*B );

        // System.out.println( Z1 );
        // System.out.println( Z2 );
        // System.out.println( Z3 );
        // System.out.println( ((Z1*1)+(Z2*10)+(Z3*100)) );
        
        mu.close();
    }
}
