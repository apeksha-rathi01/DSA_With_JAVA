package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class cgpa {
    //CGPA stands for Cumulative Grade Point Average.
    //It tells you your overall academic performance in a course or semester — like an average of all your grade points.
    /* FORMULA:
    CGPA = (Total Weighted Grade Points) / (Total Credit Hours);
    Total Weighted Grade Points = Grade Point(SGPA) × Credits;
    Total Credit Hours = Total Credit Hours + Credits;
       */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number of Semesters: ");
        double totalSem = sc.nextDouble();
        CGPA(totalSem);

    }
    static void CGPA(double nSem){
        Scanner sc = new Scanner(System.in);
        double totalWeightedGradePoints = 0;
        double totalCredits = 0;
        for(double i = 1; i<=nSem; i++){
            System.out.println("Please Enter the SCPA: ");
            double sgpa = sc.nextDouble();
            System.out.println("Please Enter the Credits: ");
            double credits = sc.nextDouble();

            totalWeightedGradePoints += sgpa * credits;
            totalCredits += credits;
        }
        if(totalCredits > 0){
            double cgpa = totalWeightedGradePoints / totalCredits;
            System.out.printf("Your CGPA is: %.2f\n", cgpa);
        }else{
            System.out.println("Total credits cannot be zero!");
        }
    }
}
