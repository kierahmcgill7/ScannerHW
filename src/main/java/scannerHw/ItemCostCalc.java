package scannerHw;

import java.util.Scanner;

public class ItemCostCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //created the scanner object to read user input


        System.out.println("What product would you like: ");
        String menu = "Chicken: $10, Rice: $5, Tacos: $12, Watermelon: $6, Grapes: $3"; // implemented user menu choices
        System.out.println(menu); //print menu items
        String productName = scanner.nextLine(); //method reads user input on the next line and stores to productName
        double price = 0; //declare price variable
        switch (productName) {
            case "Chicken" -> price = 10; // used switch/case condition to assign products to prices so the user can't input their own price
            case "Rice" -> price = 5;
            case "Tacos" -> price = 12;
            case "Watermelon" -> price = 6;
            case "Grapes" -> price = 3;
            default -> System.out.println("This item is out of stock");
        }



        System.out.println("What is your quantity of items: ");
        int quantity = scanner.nextInt(); //reads user input of int and stores it in quantity



        double totalItemPrice = quantity * price;
        System.out.println("What is your Distance: ");
        double distance = scanner.nextDouble(); //Reads a double value from the user
        double deliveryFee; // delivery fee is a double ex. 5.0 || 10.0
        if (distance >= 0 && distance <= 5){deliveryFee = 2.0;} //conditional statement on deliveryFees based on data
        else if (distance > 5 && distance <= 15) {deliveryFee = 5.0;}
        else if (distance > 15 && distance <= 25) {deliveryFee = 10.0;}
        else if (distance > 25 && distance <= 50) {deliveryFee = 15.0;}
        else {deliveryFee = 20.0;}
        double totalCost = totalItemPrice + deliveryFee;
        System.out.println("Product      Qty      Price       Miles      Total"); //displaying output
        System.out.println("----         ---      -----      -----      -----"); //output after total
        System.out.printf("%-12s %-8d %.1f        %.1f        %.1f\n", productName,quantity, pricePerUnit,distance, totalPrice);
        //System.out.println(productName + "       " + quantity + "       " + totalItemPrice +  "       " + distance + "      " + totalCost);
        System.out.println("\nThank you. Come Again!!!");
        scanner.close();




    }

}
