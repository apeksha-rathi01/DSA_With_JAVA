package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Perfect {
    /*
    Example:
    6 is a perfect number because its divisors (excluding 6) are 1, 2, 3, and their sum is 1 + 2 + 3 = 6.
    So, a Perfect Number is a number where the sum of its divisors (excluding the number itself) is equal to the number.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        perfect(num);
    }
    static void perfect(int n){
        int n1 = n;
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(n1 == sum){
            System.out.println(n1+ " is a Perfect Number.");
        }else{
            System.out.println(n1+ " is not a Perfect Number.");
        }
    }
}
