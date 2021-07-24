package com.example.IceCool.calculator;

import java.util.Scanner;

public class Calculator {

    Flavors flavorsObj = new Flavors();

    private int totalQuantity =0;
    private int totalPurchase =0;
    private String[] products = {null};
    private int[] iceCreamPrices ={0, 150, 200, 350,350};
    private int[] finalQty = new int[5];

    public void calculate(){

        Scanner s = new Scanner(System.in);
        int choose, quantity;
        int p1 =0;
        int p2 =0;
        int p3 =0;
        int p4 =0;
        char decision;
        System.out.println("Welcome To IceCool");

        do{
            for(int i = 0; i< products.length; i++){
                if(products[i] !=null)
                    System.out.println(products[i]);
            }

            System.out.print("Choose any item: ");
            choose = s.nextInt();

            System.out.print("How many pieces? ");
            quantity = s.nextInt();

            switch(choose){
                case 1:
                    p1 += quantity;
                    finalQty[1] = p1;
                    break;

                case 2:
                    p2 += quantity;
                    finalQty[2] = p2;
                    break;

                case 3:
                    p3 += quantity;
                    finalQty[3] = p3;
                    break;

                case 4:
                    p4 += quantity;
                    finalQty[4] = p4;
                    break;

            }
            System.out.print("Would you like to order again? Y/N / y/n: ");
            decision = s.next().charAt(0);
        } while (decision != 'n' && decision != 'N');

        System.out.println("==Final Cart==");
        System.out.println("\t\\Item\t\\Qty\t\\Total");
        int sum = 0;
        for (int i = 0; i < finalQty.length; i++) {
            if (finalQty[i] != 0) {
                System.out.println(products[i] + "\\" + finalQty[i] + "\\" + finalQty[i] * iceCreamPrices[i]);
                sum = sum + finalQty[i] * iceCreamPrices[i];
            }
        }
        System.out.println("Total Purchased items: " + (p1 + p2 + p3 + p4));
        System.out.println("Total Purchase: " + sum);
        int payment = 0;
        do {
            System.out.print("Enter Payment: ");
            payment = s.nextInt();
        } while (sum > payment);
        System.out.println("Thank you for buying! here's your change: " + (payment - sum));
    }
}
