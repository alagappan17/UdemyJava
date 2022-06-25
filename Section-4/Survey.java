import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("How much do you spend on coffee?");
        double coffee = scan.nextDouble();
        counter++;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeTimes = scan.nextInt();
        counter++;

        System.out.println("Thank you for answering " + counter + " questions!");
        System.out.println("Name: " + name);
        System.out.println("Money spent on coffee: Rs." + coffee);
        System.out.println("Times a week: " + coffeeTimes);
        scan.close();
    }
}
