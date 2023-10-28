package com.Janaina.demo.Lektion_3.Uppgift_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayString {

    public void createString() {

        Scanner sc = new Scanner(System.in);

        List<String> characterList = new ArrayList<>();
        boolean isCreating = true;

        System.out.println("Input in the words or letters you want to add to your sentence. Type 'quit' to exit");
        String input;
        String username;

        do {
            switch (input = sc.nextLine()) {
                case "quit" -> isCreating = false;

                default -> characterList.add(input.replace(" ", ""));
            }
        }while (isCreating);

        username = String.join("", characterList);

        System.out.println(username);

    }


}
