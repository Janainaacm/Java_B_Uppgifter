package com.Janaina.demo.Lektion_3.Puzzle_2;

import java.util.Scanner;

import static com.Janaina.demo.Colors.*;
import static com.Janaina.demo.Colors.RESET;

public class Lottery {
    public static int getBudget(int budget){

        Scanner sc = new Scanner(System.in);

        System.out.println(PURPLE_BOLD_BRIGHT + "Lottery time!" + RESET);
        System.out.println(PURPLE + "Pick a number between 1-5 to determine how deep your pockets go" + PURPLE);

        switch (sc.nextInt()){
            case 1 -> {
                System.out.println(PURPLE + "Meh, you won 5000" + RESET);
                budget = 5000;
            }
            case 2 -> {
                System.out.println(PURPLE + "You won 2000, Frida is not impressed." + RESET);
                budget = 2000;
            }
            case 3 -> {
                System.out.println(CYAN + "JACKPOT \nYou just won 10 000!!" + RESET);
                budget = 10000;
            }
            case 4 -> {
                System.out.println(PURPLE + "You won 7000, Frida is very impressed" + RESET);
                budget = 7000;
            }
            case 5 -> {
                System.out.println(PURPLE + "oof, you won 1000, might as well quit while you're ahead" + RESET);
                budget = 1000;
            }
            default -> System.out.println("Wrong input, try again" + RESET);
        }

        return budget;

    }
}
