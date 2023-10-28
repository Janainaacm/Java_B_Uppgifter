package com.Janaina.demo.Lektion_2.Uppgift_2;

import java.util.ArrayList;
import java.util.Collections;

public class ListOfNumbers {

    public void listInOrder() {
        ArrayList<Integer> reverseList = new ArrayList<>();

        reverseList.add(1);
        reverseList.add(2);
        reverseList.add(3);
        reverseList.add(4);
        reverseList.add(5);
        reverseList.add(6);
        reverseList.add(7);
        reverseList.add(8);
        reverseList.add(9);
        reverseList.add(10);

        System.out.println(reverseList);

        reverseList.sort(Collections.reverseOrder());

        System.out.println(reverseList);



    }




}
