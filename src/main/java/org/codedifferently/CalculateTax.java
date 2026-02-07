package org.codedifferently;

import java.util.Random;

public class CalculateTax {


    public int randomIdCode(){

        Random random = new Random();

        return random.nextInt(100, 999);


    }

    public void receiptCode(String name, int iD){

       String iDName = name.substring(0, 2);

        System.out.println("Your Receipt: " + iDName.toUpperCase() + "-" + iD);

    }


    public double itemPrices (){
        Random random = new Random();

        double item1 =   random.nextDouble(10.00, 50.00);
        double item2 = random.nextDouble(10.00, 50.00);
        double item3 = random.nextDouble(10.00, 50.00);

        System.out.println("Item 1: " + Math.round(item1*100.0)/100.0);
        System.out.println("Item 2: " + Math.round(item2*100.0)/100.0);
        System.out.println("Item 3: " + Math.round(item3*100.0)/100.0);
        double subTotal = item1 + item2 + item3;

        System.out.println("Subtotal: " + Math.round(subTotal*100.0)/100.0);

        return subTotal;

    }

    public double itemTax (double subTotal){

        Random random = new Random();

        int tax = random.nextInt(10);

        System.out.println("Item Tax: " + tax + "%");

        double taxAmount = subTotal * ((double) tax /100);

        System.out.println("Final Total: " + Math.round(subTotal + taxAmount));

        return subTotal + taxAmount;

    }


    public void canThisNiggaAffordIt(double total, double budget){


        double finalTotal = total - budget;

        if(budget < total){
            System.out.println("You don't have enough. You need " + Math.round(finalTotal*100.0)/100.0 + " to complete order");

        }
        else{
            System.out.println("You have enough! your change is " + Math.abs(Math.round(finalTotal*100.0)/100.0 ) + ".");
        }



    }










}
