package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class NumberSums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        calculateSums(sc);
    }

    private static void calculateSums(Scanner sc) {
        int negSum = 0;
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter numbers (0 to stop):");

        while(true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }else if(num < 0 ){
                negSum += num;
            }else if(num%2==0){
                evenSum += num;
            }else{
                oddSum += num;
            }
        }
        printSums(negSum,evenSum,oddSum);
    }

    static void printSums(int negSum, int evenSum, int oddSum) {
        System.out.println("\nSum of negative numbers: " + negSum);
        System.out.println("Sum of positive even numbers: " + evenSum);
        System.out.println("Sum of positive odd numbers: " + oddSum);
    }
}
