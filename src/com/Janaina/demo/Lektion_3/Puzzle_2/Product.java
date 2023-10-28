package com.Janaina.demo.Lektion_3.Puzzle_2;

public class Product {

    public String name;
    public int price;
    //boolean isOnSale;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

}
