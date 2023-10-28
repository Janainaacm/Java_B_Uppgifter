package com.Janaina.demo.Lektion_3.Puzzle_2;

import com.Janaina.demo.Colors;

import static com.Janaina.demo.Colors.*;

public class FaceFrida {
    public void theEnd(int finalTotal){

        int numberOfDots = 3;
        System.out.println(BLUE + "Let's see if you've spent enough to make Frida want Benny" + RESET);
        try {
            for (int i = 0; i < numberOfDots; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        } catch (InterruptedException ignored) {

        }

        if (finalTotal < 2000){
            System.out.println(RED +"\nFrida is not impressed, try harder my dude" + RESET);
        } else if (finalTotal >= 2000 && finalTotal < 5000){
            System.out.println(BLUE + "\nFrida is impressed by Benny's economy, she has agreed to a date" + RESET);
        } else if (finalTotal >= 5000 && finalTotal < 9000){
            System.out.println(CYAN + "\nFrida has agreed to be Benny's girlfriend!!!" + RESET);
        } else if (finalTotal >= 9000){
            System.out.println(PURPLE + "\nFrida and Benny are getting married next week!" + RESET);
        }




    }




}
