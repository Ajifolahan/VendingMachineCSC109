import java.util.HashMap;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, Double> shop = new HashMap<String, Double>();

        // Add keys and values (Country, City)
        shop.put("Oreos", 2.5);
        shop.put("Popcorn", 5.00);
        shop.put("Celsius", 4.25);
        shop.put("Maltesers", 6.90);

    //Welcomes user and gives instructions
    System.out.println("Welcome to the Vending Machine! You may chose between Oreos, Popcorn, Celsius, Maltesers");
    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();

    System.out.println("Gotcha. Please enter your bills. You can only enter $1 bills");
    
    if (choice.equalsIgnoreCase("Oreos")) {
        int amount = scanner.nextInt();
        int count = 1;
        while (count != 3) {
            if (amount != 1) {
                System.out.println("Wrong Input. Please try again");
                amount = scanner.nextInt();
            } else {
                amount = scanner.nextInt();
                count += 1;
            }
    
        }

    } else if (choice.equalsIgnoreCase("Popcorn")) {
        int amount = scanner.nextInt();
        int count = 1;
        while (count != 5) {
            if (amount != 1) {
                System.out.println("Wrong Input. Please try again");
                amount = scanner.nextInt();
            } else {
                amount = scanner.nextInt();
                count += 1;
            }
        }
    } else if (choice.equalsIgnoreCase("Celsisus")) {
        int amount = scanner.nextInt();
        int count = 1;
        while (count != 5) {
            if (amount != 1) {
                System.out.println("Wrong Input. Please try again");
                amount = scanner.nextInt();
            } else {
                amount = scanner.nextInt();
                count += 1;
            }
        }
    } else if (choice.equalsIgnoreCase("Maltesers")) {
        int amount = scanner.nextInt();
        int count = 1;
        while (count != 7) {
            if (amount != 1) {
                System.out.println("Wrong Input. Please try again");
                amount = scanner.nextInt();
            } else {
                amount = scanner.nextInt();
                count += 1;
            }
        }
    }


    


    }

}