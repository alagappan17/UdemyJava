import java.util.Scanner;

public class JavaGram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fname, lname, uname, city, country;
        int age;
        System.out.println("Welcome to JavaGram. Please enter the following details!");
        System.out.println("Enter First Name: ");
        fname = scan.nextLine();
        System.out.println("Enter Last Name: ");
        lname = scan.nextLine();
        System.out.println("Enter User Name: ");
        uname = scan.nextLine();
        System.out.println("Enter City: ");
        city = scan.nextLine();
        System.out.println("Enter Country: ");
        country = scan.nextLine();
        System.out.println("Enter Age: ");
        age = scan.nextInt();

        System.out.println("Thanks for sharin your details! Entered Details:");
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("User Name: " + uname);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        scan.close();
    }
}
