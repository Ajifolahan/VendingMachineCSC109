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
    Scanner input = new Scanner(System.in);
    String choice = input.nextLine();
    
    

    }
   
}