package Lecture._03_Methods;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for Prime: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println("Enter value for Armstrong: ");
        int a = sc.nextInt();
        System.out.println(isArmstrong(a));
    }
    //3 digit Armstrong Number
    static boolean isArmstrong(int a){
        int temp = a;
        int count = 0;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        int sum = 0;
        temp = a;
        while(temp > 0){
            int rem = temp % 10;
            sum += Math.pow(rem,count);
            temp = temp / 10;
        }

       return sum==a;
    }
    // Prime Numbers
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
