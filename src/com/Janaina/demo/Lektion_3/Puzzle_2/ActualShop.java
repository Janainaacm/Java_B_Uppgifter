package com.Janaina.demo.Lektion_3.Puzzle_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static com.Janaina.demo.Colors.*;

public class ActualShop {

    public int total = 0;
    public int finalTotal = 0;
    public void shopping(double budget) {
        List<Product> productList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        productList.add(new Product("Love letter", 10));
        productList.add(new Product("Chocolate and roses", 150));
        productList.add(new Product("Gold plated necklace", 600));
        productList.add(new Product("Gucci bag", 2000));
        productList.add(new Product("Prada bag", 7000));
        productList.add(new Product("Tiffany's diamond ring", 9000));

        List<Product> shoppingCart = new ArrayList<>();

        while (true) {
            System.out.println(YELLOW_BRIGHT + "SHOP" + RESET);
            System.out.println(YELLOW + "Available products:" + RESET);

            for (int i = 0; i < productList.size(); i++) {
                Product product = productList.get(i);
                System.out.println(CYAN + (i + 1) + ". " + product.getName() + " - $" + product.getPrice() + RESET);
            }
            System.out.println(CYAN + "0. View shopping cart and checkout" + RESET);

            System.out.println(YELLOW + "Enter the number of the item you would like to purchase" + RESET);
            int choice = sc.nextInt();

            if (choice == 0){
                break;
            }

            if (choice < 1 || choice > productList.size()){
                System.out.println(BLUE + "Invalid choice, please try again" + RESET);
                continue;
            }

            Product selectedProduct = productList.get(choice - 1);

            if (total + selectedProduct.getPrice() <= budget){
                shoppingCart.add(selectedProduct);
                total += selectedProduct.getPrice();
                System.out.println(PURPLE + selectedProduct.getName() + " has been added to your cart." + RESET);
            } else {
                System.out.println(RED + selectedProduct.getName() + " is out of your budget \n(you do not have the capacity for that big man)" + RESET);
            }



        }

        System.out.println(YELLOW + "Items in your cart: " + RESET);
        for (Product product : shoppingCart){
            System.out.println(CYAN + product.getName() + " - $" + product.getPrice() + RESET);
        }
        System.out.println(YELLOW + "Your total is: " + total + RESET);


        checkout();




    }

    public void checkout(){
        int numberOfDots = 3;
        System.out.println(BLUE + "Let's see if you've spent enough for a discount... " + RESET);
        try {
            for (int i = 0; i < numberOfDots; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        } catch (InterruptedException ignored) {

        }


        if (total >= 6000){
            double result = total * 0.9;
            finalTotal = (int) result;
            System.out.println(PURPLE + "\nCongratulations! You get 10% off" + RESET);
        } else {
            finalTotal = total;
            System.out.println(YELLOW + "\nYikes, maybe next time" + RESET);
        }
    }

    public int getTotal(){
        return finalTotal;
    }


}
