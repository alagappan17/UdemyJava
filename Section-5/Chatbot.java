import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Heyy! What is your name?");
        String name = scan.nextLine();

        System.out.println("Hi " + name + "! How old are you?");
        int age = scan.nextInt();

        System.out.println("So you're " + age + " years old. I'm 400 years old!");
        System.out.println("That means I'm " + (400 / age) + " times older than you!\n");

        System.out.println("Thank you for your time.");
        scan.close();
    }
}
