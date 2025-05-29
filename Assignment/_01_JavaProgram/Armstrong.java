package Assignment._01_JavaProgram;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your 1st Number: ");
        int n1 = sc.nextInt();
        System.out.print("Please enter your 2nd Number: ");
        int n2 = sc.nextInt();
        System.out.println("Armstrong numbers between " + n1 + " and " + n2 + ":");

        for(int i = n1; i<=n2; i++){
            int count=0;

            int t = i;
            while(t!=0){
                count++;
                 t = t/10;
            }
            t = i;
            int sum = 0;
            while(t>0){
                int digit = t % 10;
                sum = sum + (int)Math.pow(digit , count);
                t = t / 10;
            }
            if(i==sum){
                System.out.println(sum);
            }
        }
    }
}
