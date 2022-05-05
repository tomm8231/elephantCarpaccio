package com.company;

import java.util.Scanner;

public class UserInterface {

  public void run() {
    welcomeMessage();
  }

  public void welcomeMessage() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to THE TOTAL PRICE APPLICATION X-TREME");
    System.out.println();

    System.out.println("Enter the amount of items:");
    int amountOfUnits = sc.nextInt();

    System.out.println("Enter the cost of one unit:");
    double pricePrUnit = sc.nextDouble();

    System.out.println("Total price before tax:");
    double totalPriceBeforeTax = totalPriceBefore(amountOfUnits, pricePrUnit);
    System.out.println(totalPriceBeforeTax);

    double totalPriceAfterTax = totalPriceAfterTax(totalPriceBeforeTax);
    System.out.println("Total price after tax:");
    System.out.println(totalPriceAfterTax);

  }

  public double totalPriceBefore(int amountOfUnits, double pricePrUnit) {
    return amountOfUnits * pricePrUnit;
  }

  public double totalPriceAfterTax(double totalPriceBeforeTax) {
    return totalPriceBeforeTax * 1.0655;
  }
}
