package Lecture._04_Arrays_ArrayLists;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ARRAY OF PRIMITIVES.
        System.out.println("*** Arrays of Primitives ***");
        int arr[] = new int[5];
//        arr[0] = 04;
//        arr[1] = 12;
//        arr[2] = 26;
//        arr[3] = 29;
//        arr[4] = 35;
//        // [04,12,26,29,35]
//        System.out.println(arr[4]); //COMPLICATED

        //input using for-loop
        System.out.println("Please the roll numbers: ");
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
//        for(int i = 0; i < arr.length ; i++){
//            System.out.print(arr[i]+" ");
//        }

//        for(int num : arr){ //for every element in the array, print the element.
//            System.out.print(num+" ");// here num represents element of the array.
//        }
//        System.out.println(arr[5]); //Shows ERROR! Index Out of Bound Error.
        System.out.println("\n"+Arrays.toString(arr));

        //ARRAYS OF OBJECTS (NON_PRIMITIVES)
        System.out.println("*** Arrays of Object (NON_PRIMITIVES) ***");
        System.out.println("Please enter the names: ");
        String[] str = new String[5];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //Modify
        str[1] = "Saini";
        System.out.println(Arrays.toString(str));




    }
}
