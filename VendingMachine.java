import java.util.HashMap;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // Create a HashMap object
        HashMap<String, Double> shop = new HashMap<String, Double>();

        // Add keys and values
        shop.put("Oreos", 2.5);
        shop.put("Popcorn", 5.00);
        shop.put("Celsius", 4.25);
        shop.put("Maltesers", 6.90);

        // Welcomes user and gives instructions
        System.out.println("Welcome to the Vending Machine!");
        System.out.println("We have the following snacks available:");

        for (String i : shop.keySet()) {
            System.out.println(i + " :$" + shop.get(i));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
        System.out.println("Please enter the snacks of choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }

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
            System.out.println(
                    "Please confirm that you would like to proceed with this transaction.  Please enter Yes/No. \n1.Yes \n2.No");
            scanner.nextLine();
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Yes")) {
                double change = count - shop.get("Oreos");
                System.out.println("Thanks for your ordering Oreos with us!  Your change is $" + change
                        + ". We hope to see you again");
            } else {
                System.out.println("Transaction cancelled.  Have your refund of $" + count);
            }
        }

        else if (choice.equalsIgnoreCase("Popcorn")) {
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
            System.out.println(
                    "Please confirm that you would like to proceed with this transaction.  Please enter Yes/No. \n1.Yes \n2.No");
            scanner.nextLine();
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Yes")) {
                double change = count - shop.get("Popcorn");
                System.out.println("Thanks for your ordering Popcorn with us!  Your change is $" + change
                        + ". We hope to see you again");
            } else {
                System.out.println("Transaction cancelled.  Have your refund of $" + count);
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
            System.out.println(
                    "Please confirm that you would like to proceed with this transaction.  Please enter Yes/No. \n1.Yes \n2.No");
            scanner.nextLine();
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Yes")) {
                double change = count - shop.get("Celsius");
                System.out.println("Thanks for your ordering Celsius with us!  Your change is $" + change
                        + ". We hope to see you again");
            } else {
                System.out.println("Transaction cancelled.  Have your refund of $" + count);
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
            System.out.println(
                    "Please confirm that you would like to proceed with this transaction.  Please enter Yes/No. \n1.Yes \n2.No");
            scanner.nextLine();
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Yes")) {
                double change = count - shop.get("Maltesers");
                System.out.println("Thanks for your ordering Maltesers with us!  Your change is $" + change
                        + ". We hope to see you again");
            } else {
                System.out.println("Transaction cancelled.  Have your refund of $" + count);
            }
        }

    }

}