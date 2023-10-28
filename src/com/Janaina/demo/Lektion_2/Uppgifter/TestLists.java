package com.Janaina.demo.Lektion_2.Uppgifter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {

    public static void arrayListMethod() {
        List<Integer> scoreList = new ArrayList<>();

        scoreList.add(1);
        scoreList.add(2);
        scoreList.add(3);
        System.out.println(scoreList);

        scoreList.remove(2);
        System.out.println(scoreList);

        scoreList.set(1, 10);
        System.out.println(scoreList);

        scoreList.get(0);
        System.out.println(scoreList);

    }
    public static void linkedListMethod() {
        List<Integer> scoreList = new LinkedList<>();

        scoreList.add(1);
        scoreList.add(2);
        scoreList.add(3);
        System.out.println(scoreList);

        scoreList.remove(2);
        System.out.println(scoreList);

        scoreList.set(1, 10);
        System.out.println(scoreList);

        scoreList.get(0);
        System.out.println(scoreList);


    }

}

