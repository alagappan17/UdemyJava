import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Dealership!");
        System.out.println("Select Option - \na. Buy Car\nb. Sell Car");
        String choice = scan.nextLine();
        switch (choice) {
            case "a":
                System.out.println("What is you budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! Cars are available.");
                    System.out.println(("Do you have a license?"));
                    scan.nextLine();
                    String license = scan.nextLine();
                    System.out.println(("Do you have an insurance?"));
                    String insurance = scan.nextLine();
                    System.out.println(("What is your credit score?"));
                    int credscore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && credscore > 600) {
                        System.out.println("Sold!");
                    } else {
                        System.out.println("You are not eligible!");
                    }
                } else
                    System.out.println("Sorry! No cars are available.");
                break;
            case "b":
                System.out.println("What is the value of your car?");
                int value = scan.nextInt();
                System.out.println("What is your selling price?");
                int sellingprice = scan.nextInt();
                if (value > sellingprice && sellingprice < 30000)
                    System.out.println("Your car is sold!");
                else
                    System.out.println("Sorry! Not interested");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
