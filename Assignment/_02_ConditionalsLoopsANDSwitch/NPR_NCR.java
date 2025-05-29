package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class NPR_NCR {
    // They are formulas used in combinations and permutations in mathematics.
    /*
    1. NPR (Permutation):
    Used when order matters (arranging things).
    Formula:-
             nPr = n! / (n-r)!

     2. NCR (Combination):
     Used when order does NOT matter (choosing things).
     Formula:-
             nCr = n! / r!(n-r)!
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the value of 'n' : ");
        int n = sc.nextInt();
        System.out.print("Please Enter the value of 'r' : ");
        int r = sc.nextInt();

        if(n >= r){
            long nPr = factorial(n) / factorial(n-r);
            long nCr = factorial(n) / (factorial(r) * factorial(n-r));
            System.out.println("nPr = " + nPr);
            System.out.println("nCr = " + nCr);
        } else {
            System.out.println("Error: n must be greater than or equal to r.");
        }
    }

    static long factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f *= i;
        }
        return f;
    }
}
