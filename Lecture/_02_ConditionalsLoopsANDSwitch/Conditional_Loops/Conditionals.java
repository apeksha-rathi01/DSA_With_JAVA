package Lecture._02_ConditionalsLoopsANDSwitch.Conditional_Loops;
public class Conditionals {

    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if (boolean expression T or F) {
                // body
            } else {
                // do this
            }
        */

        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }

        /*
            Syntax of if-else-if statements:
            if (boolean expression T or F) {
                // body
            } else if(boolean expression T or F) {
                // body
            }else{
                //do this
            }
        */

        if (salary > 10000) {
            salary += 2000; // salary = salary + 2000
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);

        /*
            Syntax of single if statements:
            if (boolean expression T or F) {
                // body
            }
        */
        int a = 10;
        int b = 40;
        if (a != 35) {
            System.out.println("Hello World");
        }
    }
}