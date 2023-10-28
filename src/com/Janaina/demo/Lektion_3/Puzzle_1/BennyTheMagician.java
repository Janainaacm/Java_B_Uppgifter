package com.Janaina.demo.Lektion_3.Puzzle_1;

import com.Janaina.demo.Colors;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static com.Janaina.demo.Colors.*;

public class BennyTheMagician {

    public String stone = "Stone";
    Scanner sc = new Scanner(System.in);

    public String color;

    public void magicSpell() {

        System.out.println(stone);
        System.out.println("The stone looks boring! Cast the magic spell on the stone!");
        System.out.println("Choose a color between: red, blue, green or yellow");

        String action;
        boolean practisingMagic = true;

        do {
            action = sc.nextLine();

            switch (action) {
                case "red" -> System.out.println(RED + stone + RESET);
                case "blue" -> System.out.println(BLUE + stone + RESET);
                case "green" -> System.out.println(GREEN + stone + RESET);
                case "yellow" -> System.out.println(YELLOW + stone + RESET);
                case "exit" -> practisingMagic = false;
                default -> System.out.println(stone + "\nSpell failed, you suck");



            }


        } while (practisingMagic);

    }

}


