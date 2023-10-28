package com.Janaina.demo.Lektion_3.Uppgifter;

import java.util.Scanner;

public class SwitchTraining {
    public void weekdaySwitch(){
        Scanner sc = new Scanner(System.in);

        boolean isPlaying = true;
        System.out.println("Please enter your username:");
        String uname = sc.nextLine();

        do {
            System.out.println("What day of the week do you want");
            switch (sc.nextInt()) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                case 9 -> {
                    isPlaying = false;
                    sayGoodbye(uname);
                }

                default -> System.out.println("?");
            }
        }while (isPlaying);
    }


    public void sayGoodbye(String username){
        System.out.println("Goodbye " + username + "!");
    }
}
