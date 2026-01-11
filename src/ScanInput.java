import java.util.Scanner;

public class ScanInput {
    public static void main(String[] args){
/*
* shopping cart example
* we have item
* item has price
* quantity of the item
* currency of the price
* total price = quantity * price */

        Scanner scan = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What Item would you like to buy?: ");
        item = scan.nextLine();

        System.out.println("What is the price of each item?: ");
        price = scan.nextDouble();
//        System.out.println(price);


        System.out.println("How many items would you like?: ");
        quantity = scan.nextInt();
//        System.out.println(quantity);

        total = price * quantity;
        System.out.println("The total price = " + total);

        System.out.println("\nYou have bought " + quantity + " " + item + "/s" + " which cost " + total + currency);

        scan.close();
    }
}