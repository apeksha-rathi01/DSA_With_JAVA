package Assignment._01_JavaProgram;

import java.util.Scanner;

public class INR_to_USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Currency in Rupees to USD***");
        double conversionRate = 83.2;
        System.out.print("Enter Currency in Rupees :");
        double rupees = sc.nextDouble();
        double usd = rupees / conversionRate;
        System.out.println("Currency in USD : "+usd);
    }
}
