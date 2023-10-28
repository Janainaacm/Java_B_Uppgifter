package com.Janaina.demo.Lektion_2.Uppgift_1;

import java.util.ArrayList;
import java.util.List;

import static com.Janaina.demo.Lektion_2.Uppgift_1.GetGroceries.getGroceries;
import static com.Janaina.demo.Lektion_2.Uppgift_1.GetInput.scannerText;
import static com.Janaina.demo.Lektion_2.Uppgift_1.RemoveGroceries.removeGroceries;

public class Shopping {
    public void groceryShopping() {
        List<String> shoppingList = new ArrayList<>();

        System.out.println("Let's get started on your shopping! Type 'stop' when finished");
        System.out.println("'add' to add something to your list \n'remove' to remove something from your list \n'view' to view your entire list.");

        boolean isShopping = true;
        do {
            System.out.println("Main menu:");
            switch (scannerText()) {
                case "add" -> getGroceries(shoppingList);
                case "remove" -> removeGroceries(shoppingList);
                case "view" -> System.out.println(shoppingList);
                case "stop" -> isShopping = false;
                default -> System.out.println("I didn't quite understand that, try again");
            }
        }while (isShopping);
    }
}
