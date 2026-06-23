package Lecture_25;

import java.util.*;
// lect 25 = arraylist
// objects = non continuous memory, size variable 

public class PrintArrayList {
    // main function in primary class
    public static void main(String[] args) {
        // provide input and it will display
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(8);
        System.out.println(list);
        // add, get, remove/delete, modify, iterate
        list.add(3, 9);
        System.out.println(list);

        list.get(0);

        list.remove(0);
        System.out.println(list);

        list.set(1, 6);
        System.out.println(list);

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
