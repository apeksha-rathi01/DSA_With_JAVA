package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the range of 'n' : ");
        int n = sc.nextInt();
        double  sum = 0;
        double avg;
        for(int i = 1; i<=n ; i++){
            sum += i;
        }
        avg = sum / n;
        System.out.println("Average of 'n' number is: "+ avg);
    }
}
