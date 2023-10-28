package com.Janaina.demo.Lektion_3.Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public void calculator() {
        int first = firstNumber();
        String method = mathMethod();
        int second = secondNumber();

        boolean calculating = true;

        do {

            switch (method) {
                case "+" -> {
                    addition(first, second);
                    calculating = false;
                }
                case "-" -> {
                    subtraction(first, second);
                    calculating = false;
                }
                case "*" -> {
                    multiplication(first, second);
                    calculating = false;
                }
                case "%" -> {
                    division(first, second);
                    calculating = false;
                }
                default -> System.out.println("Wrong input, try again");
            }
        } while (calculating);



    }



    public boolean calculate(String m){

        if (Objects.equals(m, "+") || Objects.equals(m, "-") || Objects.equals(m, "%") || Objects.equals(m, "*")) {
            return true;
        } else {
            return false;
        }
    }


    public String mathMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do with your number? (+ - % *)");
        String method = sc.nextLine();
        if (calculate(method)) {
            return method;
        }else {
            System.out.println("Wrong input, please try again");
            return mathMethod();
        }

    }


    public int firstNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the first number");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }
        System.out.println("Invalid input, try again!");
        return firstNumber();
    }

    public int secondNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to add with your first number?");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }
        System.out.println("Invalid input, try again!");
        return secondNumber();
    }

    public void addition(int x, int y){
        int sum = x + y;
        System.out.println("Your result is: " + sum);
    }

    public void subtraction(int x, int y){
        int sum = x - y;
        System.out.println("Your result is: " + sum);

    }

    public void multiplication(int x, int y){
        int sum = x * y;
        System.out.println("Your result is: " + sum);

    }

    public void division(int x, int y){
        int sum = x - y;
        System.out.println("Your result is: " + sum);

    }




}

