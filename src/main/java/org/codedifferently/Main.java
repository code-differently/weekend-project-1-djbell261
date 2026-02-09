package org.codedifferently;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        RecieptGenerator calculateTax = new RecieptGenerator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your Name?");
        String customerName = scanner.next();

        System.out.println("What is your Budget?");
        double budget = scanner.nextDouble();

        System.out.println("----WELCOME TO THE DEV GROUP'S MYSTERY SHACK----");


        calculateTax.receiptCode(customerName, calculateTax.randomIdCode());
        double total = calculateTax.itemTax(calculateTax.itemPrices());
        calculateTax.canYouAffordIt(total, budget);

        scanner.close();

    }
}

