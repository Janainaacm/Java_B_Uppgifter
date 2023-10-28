package com.Janaina.demo.Lektion_3.Puzzle_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.Janaina.demo.Colors.*;

public class Shop {

    public int budget = Lottery.getBudget(0);

    public void shop() {
        ActualShop ActualShop = new ActualShop();
        FaceFrida FaceFrida = new FaceFrida();

        Scanner sc = new Scanner(System.in);

        boolean isShopping = true;


        do {

            budget -= ActualShop.finalTotal;
            System.out.println(YELLOW_BOLD_BRIGHT + "MENU" + RESET);
            System.out.println(YELLOW + "1. Go shopping \n2. View budget \n3. Face Frida" + RESET);

            switch (sc.nextInt()) {

                case 1 -> ActualShop.shopping(budget);
                case 2 -> System.out.println(BLUE + "Your budget is: " + budget + RESET);
                case 3 -> isShopping = false;
                default -> System.out.println("Invalid input, try again");
            }

        } while (isShopping);

        FaceFrida.theEnd(ActualShop.getTotal());

        System.out.println(PURPLE_BOLD_BRIGHT + "THE END" + RESET);

    }


}
