package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Batting {
    //Batting average tells us how many runs a batsman scores on average every time they get out.
    /* FORMULA:
    Batting Average = Total Runs Scored / Number of Times Out;
    Times Out = Total Matches Played − Not Outs;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total Runs Scored: ");
        double totalRuns = sc.nextDouble();
        System.out.print("Enter the Total Matches Played: ");
        double totalMatches = sc.nextDouble();
        System.out.print("Enter the Not-Out: ");
        double notOut = sc.nextDouble();

        double timesOut = totalMatches - notOut;
        batting(totalRuns,timesOut);

    }
    static void batting(double totalRuns, double timesOut){
        double battingAvg = totalRuns / timesOut;
        System.out.println("Total batting Average is: "+battingAvg);
    }
}
