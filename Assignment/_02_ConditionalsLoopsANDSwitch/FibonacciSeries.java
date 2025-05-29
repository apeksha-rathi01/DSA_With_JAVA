package Assignment._02_ConditionalsLoopsANDSwitch;


import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the nth term: ");
        int n = sc.nextInt();
        System.out.println("*** FIBONACCI-SERIES ***");
        int a = 0, b = 1;
        for(int i=1 ; i <= n ; i++ ){
            int c = a + b;
            System.out.print(a+" ");
            a = b;
            b = c;
        }
    }
}
