package Lecture._04_Arrays_ArrayLists;
import java.util.*;

public class ArrayListEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        ArrayList is like a flexible box in Java where you can store many items,
         and you can add, remove, or change items anytime easily.
         */
        //SYNTAX:
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList is a class - similarly it is a collection framework

//        list.add(04);
//        list.add(12);
//        list.add(26);
//        list.add(29);
//        list.add(35);
//        System.out.println(list);
//        System.out.println(list.contains(5));
//        list.set(0,99);
//        list.remove(04);
//        System.out.println(list);

        //INPUT:-
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        //Get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here.
        }
        System.out.println(list);


    }
}
