package app;

import java.util.Scanner;

public class Main {
    static String[] products;
    static int count;
    static int numeration = 1;

    public static void main(String[] args) {

        products = new String[]{"Laptop", "Computer", "Laptops", "Laptop", "Keyboard", "Tachpad", "Laptop", "Keyboard", "Mobile phone", "Tachpad"};

        //output of a numbered list of products
        for (String s : products) {
            System.out.println(numeration + ") " + s);
            numeration++;
        }

        //Ask the user to enter data for search
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the product name to search: ");
        String e = sc.next();

        // A loop for searching for matches with counting the number of matches
        for (String s : products) {

            if (s.equals(e)) {
                count++;
                System.out.println(count + ") A match was found: " + e);
            }
        }

        if (count > 0)
            System.out.println("Total number of matches: " + count + ".");

        if (count == 0)
            System.out.println("No results. Try again)");

    }
}