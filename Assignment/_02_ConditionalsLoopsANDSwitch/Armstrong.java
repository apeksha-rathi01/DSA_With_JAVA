package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Armstrong {
    /*
    An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
    153 is an Armstrong number: 153 = 1^3 + 5^3 + 3^3.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        armstrong(n);
    }

    static void armstrong(int n){
        int temp = n;
        int p = String.valueOf(n).length(); // number of digits
        int sum = 0;

        while(n > 0){
            int r = n % 10;
            sum += Math.pow(r, p); // corrected power
            n = n / 10;
        }

        if(sum == temp){
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is NOT an Armstrong number.");
        }
    }
}
