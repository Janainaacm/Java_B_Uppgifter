package com.Janaina.demo.Lektion_2.Uppgift_4_tn;

import java.util.ArrayList;
import java.util.List;

public class NoNegative {

    public void noNegative() {
        List<Integer> scoreList = new ArrayList<>();

        scoreList.add(10);
        scoreList.add(3);
        scoreList.add(-67);
        scoreList.add(7);
        scoreList.add(-2);
        scoreList.add(-15);
        scoreList.add(30);

        System.out.println(scoreList);

        for (int i = 0; i < scoreList.size(); i++) {
            System.out.println(scoreList.get(i));

            if (scoreList.get(i) < 0){
                scoreList.remove(i);
                System.out.println("The value is negative");
                i--;
            }

        }

        System.out.println(scoreList);


    }


}
