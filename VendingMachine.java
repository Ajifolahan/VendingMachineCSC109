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

    System.out.println("Welcome to the little Grocery Store");
    System.out.println("We have the following snacks available:");

    for (String i: shop.keySet()){
        System.out.println(i +" :$"+shop.get(i));
    }
    try {
        Thread.sleep(1000);
    } catch(InterruptedException e) {
        System.out.println("got interrupted!");
    }
    System.out.println("Please enter the snacks of choice: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    try {
        Thread.sleep(1000);
    } catch(InterruptedException e) {
        System.out.println("got interrupted!");
    }
    System.out.println("Gotcha. Please enter your bills. You can only enter $1 bills");

    if(input.equalsIgnoreCase("Oreos")){
        int amount = scanner.nextInt();
        int count = 1; 
        while(count != 3){
            amount = scanner.nextInt();
            count +=1;
        }
    double change = count - shop.get("Oreos");
    System.out.println("Thanks for your order, Your change is " + change);
       
    }


    }
   
}