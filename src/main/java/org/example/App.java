/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function to decide how much to tax someone based on state and county
    // Functionality for Wisconsin (Dunn and Eau Claire counties) as well as for Illinois. All other states are not.
    // Return total and tax
    public static void main( String[] args )
    {
        double amount, tax;
        String state, county;

        System.out.println("What is the order amount?");
        Scanner inputAmount = new Scanner(System.in);
        amount = inputAmount.nextDouble();

        System.out.println("What state do you live in?");
        Scanner inputState = new Scanner(System.in);
        state = inputState.nextLine();

        if (state.equals("Wisconsin")) {
            System.out.println("What county do you live in?");
            Scanner inputCounty = new Scanner(System.in);
            county = inputCounty.nextLine();

            if (county.equals("Eau Claire")) {
                tax = amount * .055;
                System.out.println("The tax is $" + String.format("%.2f", tax) + ".\nThe total is $" + String.format("%.2f", amount + tax) + ".");
            } else if (county.equals("Dunn")) {
                tax = amount * .054;
                System.out.println("The tax is $" + String.format("%.2f", tax) + ".\nThe total is $" + String.format("%.2f", amount + tax) + ".");
            } else {
                tax = amount * .05;
                System.out.println("The tax is $" + String.format("%.2f", tax) + ".\nThe total is $" + String.format("%.2f", amount + tax) + ".");
            }
        }
        else if (state.equals("Illinois"))
        {
            tax = amount * .08;
            System.out.println("The tax is $" + String.format("%.2f",tax) + ".\nThe total is $" + String.format("%.2f",amount + tax) + ".");
        }
        else
        {
            tax = 0;
            System.out.println("The tax is $" + String.format("%.2f",tax) + ".\nThe total is $" + String.format("%.2f",amount + tax) + ".");
        }
    }
}
