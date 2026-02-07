package org.codedifferently;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("print");
        CalculateTax calculateTax = new CalculateTax();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your Name?");
        String customerName = scanner.next();

        System.out.println("What is your Budget?");
        double budget = scanner.nextDouble();



        calculateTax.receiptCode(customerName, calculateTax.randomIdCode());
        double total = calculateTax.itemTax(calculateTax.itemPrices());
        calculateTax.canThisNiggaAffordIt(total,budget);












        }
    }

