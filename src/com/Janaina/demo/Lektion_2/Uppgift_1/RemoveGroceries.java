package com.Janaina.demo.Lektion_2.Uppgift_1;

import java.util.List;
import static com.Janaina.demo.Lektion_2.Uppgift_1.GetInput.scannerText;

public class RemoveGroceries {

    public static void removeGroceries(List<String> shoppingList){

        System.out.println("What would you like to remove from your shopping list?");

        String elementToRemove = scannerText();
        shoppingList.remove(elementToRemove);


    }


}
